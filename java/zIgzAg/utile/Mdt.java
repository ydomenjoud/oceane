// v 1.40 01/01/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.


package zIgzAg.utile;

import java.lang.reflect.Array;

/** Cette classe contient des m�thodes statiques permettant de modifier et d'utiliser des tableaux de types primitifs,
  * des tableaux d'objets ainsi que des index simples.<br><br>
  * En fait son nom est l'abr�viation de &quot;Manipulation de Tableau&quot;.<br><br>
  * Les op�rations ne sont pas synchronis�es. Les index(en ce qui concerne les types primitifs) sont � utiliser
  * dans le cas d'index changeant rarement de taille.
  * On �conomise alors le temps utilis� par les &quot;casts&quot; des autres classes de ce type.
  * Dans le cas contraire, il est pr�f�rable d'utiliser des <code>ArrayList</code>, ou des <code>HashMap</code>...
  * @author Julien Buret
  * @version 1.4
  * @see java.util.HashMap
  * @see java.util.ArrayList
  */
public class Mdt{

/** cette classe ne peut �tre instanci�e.
  */
 private Mdt(){}


/** Retourne un tableau d'entiers auquel on a ajout� un �l�ment.
  * @param tab le tableau de d�part.
  * @param val la nouvelle valeur.
  * @return le tableau r�sultat.
  */
 public static int[] ajout(int[] tab,int val){
  int[] retour;
  if(tab==null) retour=new int[1];
   else{
    retour=new int[tab.length+1];
    System.arraycopy(tab,0,retour,0,tab.length);
    }
  retour[retour.length-1]=val;
  return retour;
  }

/** Retourne la premi�re position d'un �l�ment dans un tableau.
  * @param tab le tableau de d�part.
  * @param val la valeur cherch�e.
  * @return la premi�re position. <tt>-1</tt> si la valeur n'est pas pr�sente.
  */
 public static int position(int[] tab,int val){
  if(tab!=null)
   for(int i=0;i<tab.length;i++)
    if(tab[i]==val) return i;
  return -1;
  }

/** Indique si un �l�ment est pr�sent ou non.
  * @param tab le tableau de d�part.
  * @param val la valeur cherch�e.
  * @return <tt>true</tt> si l'�l�ment est pr�sent, <tt>false</tt> sinon.
  */
 public static boolean estPresent(int[] tab,int val){
  if(position(tab,val)==-1) return false;
   else return true;
  }


/** Dans le cas d'un tableau � deux dimensions <code>int[<i>n</i>][2]</code> o� la premi�re coordonn�e correspond � l'index
  * et la deuxi�me � la valeur index�e, retourne la valeur correspondant � l'index.
  * @param tab le tableau de d�part.
  * @param index l'index.
  * @return la premi�re valeur trouv�e correspondant � l'index. <tt>0</tt> si l'index n'est pas pr�sent.
  */
 public static int valeurCorrespondante(int[][] tab,int index){
  if((tab!=null)&&(tab[0].length==2))
   for(int i=0;i<tab.length;i++)
    if(tab[i][0]==index) return tab[i][1];
  return 0;
  }

/** Dans le cas d'un tableau � deux dimensions <code>int[<i>n</i>][2]</code> o� la premi�re coordonn�e correspond � l'index
  * et la deuxi�me � la valeur index�e, retourne la coordonn�e du tableau correspondant � l'index.
  * @param tab le tableau de d�part.
  * @param index l'index.
  * @return la premi�re coordonn�e trouv�e correspondant � l'index. <tt>-1</tt> si l'index n'est pas pr�sent.
  */
 public static int indexCorrespondant(int[][] tab,int index){
  if((tab!=null)&&(tab[0].length==2))
   for(int i=0;i<tab.length;i++)
    if(tab[i][0]==index) return i;
  return -1;
  }

/** Dans le cas d'un tableau � deux dimensions <code>int[<i>n</i>][2]</code> o� la premi�re coordonn�e correspond � l'index
  * et la deuxi�me � la valeur index�e, ajoute la valeur de <code>modification</code> � la valeur index� par
  * <code>index</code>.
  * @param tab le tableau de d�part.
  * @param index l'index.
  * @param modification la modification.
  * @return le tableau modifi�, le tableau inchang� si l'index n'est pas pr�sent.
  */
 public static int[][] modifierIndex(int[][] tab,int index,int modification){
  if((tab!=null)&&(tab[0].length==2)){
   int i=indexCorrespondant(tab,index);
   if(i!=-1) tab[i][1]=tab[i][1]+modification;
   }
  return tab;
  }

/** Dans le cas d'un tableau � deux dimensions <code>int[<i>n</i>][2]</code> o� la premi�re coordonn�e correspond � l'index
  * et la deuxi�me � la valeur index�e, ajoute au tableau principal un index et sa valeur.
  * @param tab le tableau de d�part.
  * @param ajout le couple � rajouter : <code>{index,valeur}</code>.
  * @return le tableau r�sultat.
  */
 public static int[][] ajoutCoupleIndex(int[][] tab,int[] ajout){
  if(ajout==null) return tab;
  int[][] retour;
  if(tab==null) retour=new int[1][2];
   else{
    retour=new int[tab.length+1][2];
    for(int i=0;i<tab.length;i++) retour[i]=tab[i];
    }
  retour[retour.length-1]=(int[])ajout.clone();
  return retour;
  }

/** Dans le cas d'un tableau � deux dimensions <code>int[<i>n</i>][2]</code> o� la premi�re coordonn�e correspond � l'index
  * et la deuxi�me � la valeur index�e, fusionne deux tableaux de ce type.
  * @param tab1 le premier tableau.
  * @param tab2 le deuxi�me tableau.
  * @return le tableau r�sultat.
  * @exception IllegalArgumentException si <code>tab1</code> ou <code>tab2</code> a sa deuxi�me dimension diff�rente de
  * <tt>2</tt>.
  */
 public static int[][] ajoutIndex(int[][] tab1,int[][] tab2){
  if(tab2==null) return tab1;
  if(tab1==null) return (int[][])cloneTableau(tab2);
  if((tab1[0].length!=2)||(tab2[0].length!=2))
   throw new IllegalArgumentException("Index non conforme : la deuxi�me dimension du tableau n'a pas la bonne dimension");
  int[][] retour=(int[][])cloneTableau(tab1);
  for(int i=0;i<tab2.length;i++){
   int inter=indexCorrespondant(retour,tab2[i][0]);
   if(inter!=-1) retour[inter][1]=retour[inter][1]+tab2[i][1];
    else retour=ajoutCoupleIndex(retour,tab2[i]);
   }
  return retour;
  }

/** Fusionne deux tableaux d' <code>Object</code> et renvoit le r�sultat.
  * @param tab1 le premier tableau.
  * @param tab2 le deuxi�me tableau.
  * @return le tableau r�sultat.
  */
 public static Object[] fusion(Object[] tab1,Object[] tab2){
  if(tab1==null) return tab2;
  if(tab2==null) return tab1;
  Object[] retour=(Object[])Array.newInstance(tab1.getClass().getComponentType(),tab1.length+tab2.length);
  System.arraycopy(tab1,0,retour,0,tab1.length);
  System.arraycopy(tab2,0,retour,tab1.length,tab2.length);
  return retour;
  }

/** Retourne la premi�re position d'un �l�ment dans un tableau. Le type d'objet utilis� doit impl�menter la m�thode
  * <i>equals(Object)</i> pour que cette m�thode fonctionne correctement.
  * @param tab le tableau de d�part.
  * @param val la valeur cherch�e.
  * @return la premi�re position. <tt>-1</tt> si la valeur n'est pas pr�sente.
  */
 public static int position(Object[] tab,Object val){
  if((tab!=null)&&(val!=null))
   for(int i=0;i<tab.length;i++)
    if(tab[i].equals(val)) return i;
  return -1;
  }

/** Indique si un �l�ment est pr�sent ou non. Le type d'objet utilis� doit impl�menter la m�thode
  * <i>equals(Object)</i> pour que cette m�thode fonctionne correctement.
  * @param tab le tableau de d�part.
  * @param val la valeur cherch�e.
  * @return <tt>true</tt> si l'�l�ment est pr�sent, <tt>false</tt> sinon.
  */
 public static boolean estPresent(Object[] tab,Object val){
  if(position(tab,val)==-1) return false;
   else return true;
  }

/** Permet de cloner compl�tement un tableau ayant un nombre de dimensions sup�rieur ou �gal � 2. <br>
  * En effet la m�thode <code>clone()</code> * des tableaux ne clone que la premi�re dimension... <br>
  * Celle-ci clone toutes les dimensions.<br><br>
  * Attention, cette m�thode ne clone pas les �l�ments &quot;de base&quot; du tableau, sauf si ceux-ci sont de
  * type primitif.
  *@param o le tableau (cela peut �tre un tableau int[][] par exemple)
  *@return le tableau clon�, <tt>null</tt>, si le tableau est <tt>null</tt>.
  */
 public static Object cloneTableau(Object[] o){
  if(o==null) return null;
  Object o2=o.clone();
  Class c=o.getClass().getComponentType();

  if(c.isArray())
   if(!c.getComponentType().isPrimitive())
    for(int i=0;i<Array.getLength(o);i++)
     Array.set(o2,i,cloneTableau((Object[])Array.get(o,i)));
   else
    if(c.getComponentType()==Integer.TYPE)
     for(int i=0;i<Array.getLength(o);i++)
      Array.set(o2,i,((int[])Array.get(o,i)).clone());
    else
     if(c.getComponentType()==Float.TYPE)
     for(int i=0;i<Array.getLength(o);i++)
      Array.set(o2,i,((float[])Array.get(o,i)).clone());
    else
     if(c.getComponentType()==Double.TYPE)
     for(int i=0;i<Array.getLength(o);i++)
      Array.set(o2,i,((double[])Array.get(o,i)).clone());
    else
     if(c.getComponentType()==Boolean.TYPE)
     for(int i=0;i<Array.getLength(o);i++)
      Array.set(o2,i,((boolean[])Array.get(o,i)).clone());
    else
     if(c.getComponentType()==Character.TYPE)
     for(int i=0;i<Array.getLength(o);i++)
      Array.set(o2,i,((char[])Array.get(o,i)).clone());
    else
     if(c.getComponentType()==Long.TYPE)
     for(int i=0;i<Array.getLength(o);i++)
      Array.set(o2,i,((long[])Array.get(o,i)).clone());
    else
     if(c.getComponentType()==Short.TYPE)
     for(int i=0;i<Array.getLength(o);i++)
      Array.set(o2,i,((short[])Array.get(o,i)).clone());

  return o2;
  }

/** Renvoit les tailles des diff�rentes dimensions du tableau. <BR><BR>
  * Par exemple, <code>dimensionsTableau(<tt>new int[5][6]</tt>) renverra <tt>{5,6}</tt></code>. <br>
  * Cas particulier : <code>dimensionsTableau(<tt>new int[5][0][4]</tt>) renverra <tt>{5,0,0}</tt></code>.
  *@param o le tableau
  *@return les tableau des dimensions, un tableau de taille <tt>0</tt> si l'objet n'est pas un tableau.
  */
 public static int[] dimensionsTableau(Object o){
  int d=nombreDimensionsTableau(o);
  int[] retour=new int[d];
  Object o2=o;
  for(int i=0;i<d;i++){
   retour[i]=Array.getLength(o2);
   if(retour[i]==0) break;
    else o2=Array.get(o2,0);
   }
  return retour;
  }

/** Renvoit le nombre de dimensions d'un tableau.
  * @param o le tableau.
  * @return le nombre de dimensions du tableau, 0 si l'objet <code>o</code> n'est pas un tableau.
  */
 public static int nombreDimensionsTableau(Object o){
  int retour=0;
  Class c=o.getClass().getComponentType();
  while(c!=null){
   retour++;
   c=c.getComponentType();
   }
  return retour;
  }






 }