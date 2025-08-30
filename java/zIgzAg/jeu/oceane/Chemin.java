// v2.00 13/01/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.



package zIgzAg.jeu.oceane;
/*
 * @author  Julien Buret
 * @version 2.00, 13/01/01
 */

import java.io.File;
import zIgzAg.utile.Copie;

public class Chemin{

 /* Cette classe contient les diff�rents chemins o� sont stock�s certains fichiers*/

 public static final String RACINE="c:/julien/Univers/";
  //le repertoire o� on va tout ranger.

 public static final String CARNET_DE_BORD=RACINE+"carnet.txt";
 public static final String NUMERO_DU_TOUR=RACINE+"tour.txt";

 public static final String RACINE_SITE="http://jeu.oceane.free.fr/";
 public static final String SITE=RACINE_SITE+"principal.htm";
 public static final String SITE_REGISTRE=RACINE_SITE+"info/reg.htm";

 public static final String MJ=RACINE+"mj/";
  //Le repertoire o� est stock� les informations n�cessaires au mj.

 public static final String IMAGES_RESERVE=RACINE+"images/";
  //les images de r�serve

 public static final String ATLAS=RACINE+"atlas/";
  //Le repertoire o� est stock� les informations de l'atlas.

 public static final String FICHIERS=RACINE+"fichiers/";
  //Le repertoire o� sont stock�s les fichiers "persistants";

 public static final String FICHIER_RAPPORTS_IMAGES=FICHIERS+"images";
 public static final String FICHIER_STATS=FICHIERS+"stats.htm";

 public static String DONNEES;
  //le repertoire o� sont stok�es les donn�es.

 public static String COMMANDANTS;
 public static String SYSTEMES;
 public static String DEBRIS;
 public static String PLANS_DE_VAISSEAUX;
 public static String COMPOSANTS_DE_VAISSEAUX;
 public static String BATIMENTS;
 public static String ALLIANCES;
 public static String TECHNOLOGIES_PUBLIQUES;
 public static String LEADERS_EN_VENTE;
 public static String BASE_STATS;
 public static String RELATIONS_RACES;
 public static String TRANSFERTS;

 public static String RAPPORTS;
  //le repertoire o� sont stock�s les rapports.

 public static String ZIP;
  //le repertoire o� sont stock�s les rapports.

 public static String RAPPORTS_IMAGES;
  //Le r�pertoire o� sont stock�es les images des rapports.

 public static String ORDRES;
  //le repertoire o� sont stock�s les fichiers n�cessaires pour passer les ordres.

 public static String DONNEES_ORDRES;
 //le fichier sql principal.

 public static String SECURITE_RAPPORT;
 //le r�pertoire de s�curit� pour les rapports.

 public static String DONNEES_RACES;
 //le fichier descriptif des races.

 public static String SECURITE;
  //le repertoire o� sont stock�s les informations � s�curiser.

 public static String STATS;
  //Le repertoire o� sont stock�es les diff�rentes stats.

 private static String c(String valeur,boolean rep){
  String inter=valeur;
  if(inter.charAt(inter.length()-1)=='/') inter=inter.substring(0,inter.length()-1);
  if(rep){
   File f=new File(inter);
   f.mkdirs();
   }
  return valeur;
  }

 public static void initialiserChemins(int numeroTour){
  String rep=RACINE+"tour"+Integer.toString(numeroTour)+"/";

  DONNEES=c(rep+"donnees/",true);

  COMMANDANTS=c(DONNEES+"comm.txt",false);
  SYSTEMES=c(DONNEES+"sys.txt",false);
  DEBRIS=c(DONNEES+"debris.txt",false);
  PLANS_DE_VAISSEAUX=c(DONNEES+"plans.txt",false);
  COMPOSANTS_DE_VAISSEAUX=c(DONNEES+"compo.txt",false);
  BATIMENTS=c(DONNEES+"bati.txt",false);
  ALLIANCES=c(DONNEES+"alliance.txt",false);
  TECHNOLOGIES_PUBLIQUES=c(DONNEES+"techpub.txt",false);
  LEADERS_EN_VENTE=c(DONNEES+"leader.txt",false);
  BASE_STATS=c(DONNEES+"stats.txt",false);
  RELATIONS_RACES=c(DONNEES+"rel.txt",false);
  TRANSFERTS=c(DONNEES+"transfert.txt",false);

  SECURITE_RAPPORT=c(rep+"secure2/",true);
  RAPPORTS=c(rep+"rapports/",true);
  ZIP=c(rep+"zip/",true);
  RAPPORTS_IMAGES=c(RAPPORTS+"images",true);
  ORDRES=c(rep+"ordres/",true);
  DONNEES_ORDRES=c(ORDRES+"ordres",false);
  DONNEES_RACES=c(ORDRES+"race.txt",false);
  SECURITE=c(rep+"secure/",true);
  STATS=c(rep+"stats/",true);

  Copie.copie(FICHIER_RAPPORTS_IMAGES,RAPPORTS_IMAGES);
  Copie.copie(FICHIER_STATS,STATS+"stats.htm");

  }





}






