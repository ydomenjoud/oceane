// v 1.10 01/01/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.


package zIgzAg.html;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;


/** Cette classe permet de cr�er et d'�crire un document au format HTML.<br>
  * Elle contient diverses m�thodes utiles pour manier les balises HTML.
  * @author Julien Buret
  * @version 1.1
  * @see BaliseHTML
  */
public class DocumentHTML{

 /** Une liste de caract�res sp�ciaux � coder dans un document HTML.
  */
 private static final char[] caracteresSpeciaux={'�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�','�',
         '�','�','�','�','�','�','�','�'};

/** La traduction des caract�res sp�ciaux � coder dans un document HTML.
  */
 private static final String[] traduction={"&#192;","&#193;","&#194;","&#199;","&#200;","&#201;","&#202;","&#206;","&#212;",
         "&#214;","&#217;","&#218;","&#224;","&#225;","&#226;","&#231;","&#232;","&#233;","&#234;","&#238;","&#244;",
         "&#246;","&#249;","&#250;","&#251;","&#239;"};

/** La taille par d�faut du <code>StringBuffer</code> utilis�. Dans le cas de documents gigantesques ou petits,
  * il peut �tre utile pour des raisons de rapidit� d'ex�cution de modifier cette taille en utilisant le constructeur
  * n�cessaire.
  * @see DocumentHTML#DocumentHTML(String,BaliseHTML,int)
  */
 private static final int TAILLE_BUFFER_PAR_DEFAUT=100000;

/** La balise de d�part du document.
  */
 private BaliseHTML document;

/** Le <code>StringBuffer</code> o� sera stock� les caract�res du document HTML avant son �criture.
  */
 private StringBuffer texte;

/** Le fichier ou sera �crit le document HTML.
  */
 private File fichier;

/** La taille du <code>Stringbuffer</code>.
  */
 private int tailleDuBuffer;

/** Un constructeur avec comme nom de fichier <tt>fichier</tt>, comme balise racine <tt>baliseRacine</tt> et
  * comme taille de buffer la taille de buffer par d�faut.
  * @param fichier le nom du fichier.
  * @param baliseRacine la balise racine du document HTML.
  */
 public DocumentHTML(String nomFichier,BaliseHTML baliseRacine){
  this(nomFichier,baliseRacine,TAILLE_BUFFER_PAR_DEFAUT);
  }

/** Un constructeur avec comme nom de fichier <tt>fichier</tt>,comme balise racine <tt>baliseRacine</tt> et
  * comme taille de buffer <tt>tailleBuffer</tt>.
  * @param fichier le nom du fichier.
  * @param baliseRacine la balise racine du document HTML.
  * @param tailleBuffer la taille du <code>Stringbuffer</code>.
  */
 public DocumentHTML(String nomFichier,BaliseHTML baliseRacine,int tailleBuffer){
  tailleDuBuffer=tailleBuffer;
  fichier=new File(nomFichier);
  document=baliseRacine;
  }

 /** Une m�thode pour traduire les caract�res sp�ciaux dans un format lisible en mode HTML.
  */
 public static StringBuffer traduire(StringBuffer entree){
  int pos=0;
  char test;
  while(pos<entree.length()){
   test=entree.charAt(pos);
   if(Character.getNumericValue(test)==-1)
    for(int i=0;i<caracteresSpeciaux.length;i++)
     if(test==caracteresSpeciaux[i]){
      entree.deleteCharAt(pos);
      entree.insert(pos,traduction[i]);
      pos+=traduction[i].length()-1;
      break;
      }
   pos++;
   }
  return entree;
  }

/** Ecrit le document HTML dans le fichier sp�cifi� lors de la cr�ation du document HTML.
  */
 public void ecrire(){
  texte=new StringBuffer(tailleDuBuffer);
  BaliseHTML.affiche(texte,document);
  traduire(texte);

  if(fichier.getParentFile()!=null) fichier.getParentFile().mkdirs();
  try{BufferedWriter fluxE=new BufferedWriter(new FileWriter(fichier));
      String doc=texte.toString();
      fluxE.write(doc,0,doc.length());
      fluxE.close();
      }
  catch(IOException e){e.printStackTrace();}
  }

  /** Renvoit une TABLE HTML en utilisant la m�thode <code>toString()</code> des objets en param�tres.
   * Cette m�thode n'est pas � utiliser <i>� priori</i>, car plus lente que les autres m�thodes <i>creerTable()</i>.
   * @param tableau le tableau d'objects.
   * @return la balise contenant le tableau.
   */
 public static BaliseHTML creerTable(Object[][] tableau){
  BaliseHTML table=new BaliseHTML(BaliseHTML.TABLE);
  BaliseHTML ligne;
  BaliseHTML colonne;
  for(int i=0;i<tableau.length;i++){
   ligne=new BaliseHTML(BaliseHTML.TR);
   for(int j=0;j<tableau[0].length;j++){
    colonne=new BaliseHTML(BaliseHTML.TD,String.valueOf(tableau[i][j]));
    ligne.ajout(colonne);
    }
   table.ajout(ligne);
   }
  return table;
  }

 /** Renvoit une TABLE HTML en utilisant un <code>tableau</code> de Balises en param�tre qui repr�sentent
   * les cellules de la TABLE.
   * De plus <code>lignes</code> permet de d�finir les param�tres des lignes.
   * @param tableau les Balises des cellules.
   * @param lignes les Balises des lignes.
   * @return la balise contenant le tableau.
   */
 public static BaliseHTML creerTable(BaliseHTML[][] tableau,BaliseHTML[] lignes){
  BaliseHTML table=new BaliseHTML(BaliseHTML.TABLE);
  for(int i=0;i<tableau.length;i++){
   for(int j=0;j<tableau[0].length;j++)
    lignes[i].ajout(tableau[i][j]);
   table.ajout(lignes[i]);
   }
  return table;
  }

 /** Renvoit une TABLE HTML en utilisant un <code>tableau</code> de Balises en param�tre qui repr�sentent
   * les cellules de la TABLE.<br>
   * C'est la balise <tt>table</tt> qui est renvoy�e.
   * @param table la Balise tableau o� seront stock�es les diff�rentes lignes(cette balise doit �tre de type <tt>TABLE</tt>
   *               de pr�f�rence!).
   * @param tableau les Balises des cellules.
   * @return la balise <tt>table</tt> � laquelle on a rajout� le tableau.
   */
 public static BaliseHTML creerTable(BaliseHTML table,BaliseHTML[][] tableau){
  BaliseHTML ligne;
  boolean ligneValide;
  for(int i=0;i<tableau.length;i++){
   ligne=new BaliseHTML(BaliseHTML.TR);
   ligneValide=false;
   for(int j=0;j<tableau[0].length;j++)
    if(tableau[i][j]!=null){
     ligne.ajout(tableau[i][j]);
     ligneValide=true;
     }
   if(ligneValide) table.ajout(ligne);
   }
  return table;
  }

 }