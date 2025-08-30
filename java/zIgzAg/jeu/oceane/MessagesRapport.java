// v2.01 24/02/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.



package zIgzAg.jeu.oceane;
/*
 * @author  Julien Buret
 * @version 2.01, 24/02/01
 */

public class MessagesRapport extends MessagesAbstraits{

 public static final String[] INFO_GENERALES={"Informations g�n�rales","Num�ro du tour","Num�ro du Commandant","Nom",
   "Race","Puissance","Nombre de plan�tes contr�l�es","Grade","R�putation","Statut"};

 public static final String[] VOTRE_PEUPLE={"Votre Peuple","Type","Nombre","Total"};

 public static final String[] RESUME_SYSTEMES={"R�sum� de vos syst�mes","&nbsp;","Position","Nom","Pop","Pop Max",
                                               "Plan�tes",
                                               "Taxe","Stabilit�","Budget T.","Budget S.","Budget C.",
                                               "Propri�taire(s)","Gouverneur"};

 public static final String[] SYSTEMES_GENERAL={"Rapport des Syst�mes","Capitale : ","Aucune"};

 public static final String[] SYSTEME={"Nombre de plan�tes : ","(voir plan�tes)","Populations","Population max",
   "Augmentation","Population totale","Population totale max","Augmentation moyenne","Ressources","Revenu minerai",
   "Stock minerai","Points de construction","Caract�ristiques","Taux d'imp�ts","Stabilit�","Politique","Revenu",
   "R�voltes","Terraformation","Budget","Technologie","Services sp�ciaux","Contre-espionnage","Constructions en cours",
   "Type","Nombre","Points constru. n�cessaires","Pour la plan�te","Non pr�cis�","�quipement","Postes commerciaux",
   "Gouverneur","Programmation construction"};

 public static final String[] POSTES_COMMERCIAUX={"Rapport de vos postes commerciaux","Production","Stock","Prix",
                                                "Rapport des postes commerciaux �trangers"};

 public static final String[] DETAIL_SYSTEME={"D�tail des plan�tes du syst�me ","Propri�taire : ",
   "Caract�ristiques de la plan�te","Atmosph�re","Marchandise Produite",
   "Radiations","Temp�rature","Gravit�","Caract�ristiques d'exploitation",
   "R�volte","NON DISPONIBLES","Production de minerai"};

 public static final String[] FLOTTES={"Rapport des flottes"," (Pour voir le d�tail des flottes)","Nom de la flotte",
  "Num�ro de la flotte","Position","Direction","H�ros pr�sent","Directive","Puissance","Attaque spatiale",
  "Attaque plan�taire","Vitesse","�tat","Exp�rience","Moral","Postes commerciaux survol�s",
  "Transport n�","Type transport","Contenu","�tat de la soute",
  "Capacit� maximale ville spatiale","Population pr�sente","Nombre"};

 public static final String[] RESUME_FLOTTES={"R�sum� de vos flottes","Nom-Num�ro","Position","Direction","Directive",
  "Vitesse","Force spatiale","Force plan�taire","�tat","Cargaison","H�ros"};

 public static final String[] DETAIL_FLOTTES={"Description de vos flottes","Nom de la flotte","Num�ro de la flotte","Nom",
  "Type de vaisseau","Dommages","Exp�rience","Moral","Composants d�truits","�quipage"};

 public static final String[] RESUME_TECHNOLOGIES={"Rapport des technologies","Technologies connues",
  "Technologies pouvant �tre cherch�es","B�timents",
  "Nom","Prix","Points de construction","Minerai","Produits n�cessaires","Encombrement transport",
  "Trouv�e � partir de",
  "Composants de vaisseaux","Nom","Prix","Minerai","Nombre de cases","Produits n�cessaires","Trouv�e � partir de",
  "Autres","Nom","Description","Trouv�e � partir de",
  "Les technologies publiques sont en <FONT color=\"#80FF80\">vert</FONT>.",
  "Recherches actuelles","Technologie","Pourcentage du budget technologique affect�","Points de recherche"};

 public static final String[] TECHNOLOGIES={"D�tail des technologies","Technologies connues",
  "Technologies pouvant �tre cherch�es",
  "Nom","Prix","Minerai","Points de construction","Produits n�cessaires","Points de structure",
  "Prix","Minerai","Nombre de cases",
  "Produits n�cessaires","Vitesse","Dommages bouclier","Dommages coque","Dommages au sol","Port�e","Fiabilit�",
  "Pourcentage de chance de toucher les diff�rents types de coque","Caract�ristique(s) sp�ciale(s)"};

 public static final String[] PLANS_DE_VAISSEAUX={"Plans de vaisseaux","Nom","Concepteur","Marque","Taille","Vitesse",
   "Points de construction n�cessaires","C�ut en centaures","C�ut en minerai","Mat�riaux sp�ciaux n�cessaires",
   "Capacit� d'attaque spatiale","Capacit� d'attaque plan�taire","Soutes � cargo",
   "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Composants&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;",
   "Royalties","Domaine"};

 public static final String[] ALLIANCES={"Alliances","Nom","Type","Concepteur","Dirigeant","Droits d'entr�e","Secr�te",
   "Membres de l'Alliance"};

 public static final String[] ALLIANCES_DETAIL={"Membres de l'alliance ","Nom","Adresse Electronique","Race","Puissance",
   "Nombre de plan�tes","Grade","R�putation","Statut"};

 public static final String[] LEADERS={"Nom","Position","Niveau","Race","Vitesse","Attaque","D�fense","Moral",
  "Marchandage","Comp�tences","Exp�rience","Valeur de base"};

 public static final String[] STRATEGIES={"Strat�gies de combat","Nom","Agressivit�","Cible prioritaire",
 "Type de vaisseau","Position","Taille vis�e 1","TV 2","TV 3","TV 4","TV 5","TV 6","TV 7","TV 8","TV 9","TV 10"};

 public static final String[] DETECTION_FLOTTES={"Flottes �trang�res d�tect�es par vos radars",
  "Position","Nom","Nombre de vaisseaux","Description","Puissance estim�e"};
 public static final String[] DETECTION_SYSTEMES={"Syst�mes �trangers d�tect�s par vos radars",
  "Position","Nom","Population","Nombre de plan�tes","Propri�taire(s)"};

 public static final String[] MESSAGES={"Erreurs d�tect�es lors de la r�ception des ordres",
  "R�sultats des actions importantes","D�roulement des combats","Ordres pass�s"};

 public static final String[] RAPPORT_COMBAT={"Attaquant","Attaqu�","Type de combat","Flotte attaquante",
  "Flotte ou syst�me attaqu�e (�ventuellement plan�tes prises ou pill�es)"};

 public static final String RAPPORT_FINANCIER="Rapport financier";
 public static final String HEROS="Heros sous vos ordres";
 public static final String GOUVERNEURS="Gouverneurs sous vos ordres";
 public static final String PACTE_NON_AGRESSION="Pactes de non-agression avec les commandants suivants";

 public static final String TITRE_RAPPORT="Rapport du commandant ";
 public static final String TITRE_DETAIL_SYSTEME="D�tail du syst�me ";
 public static final String TITRE_DETAIL_FLOTTES="D�tail des flottes";
 public static final String TITRE_DETAIL_TECHNOLOGIES="D�tail des technologies";
 public static final String TITRE_DETAIL_COMBAT="D�tail des combats";
 public static final String RETOUR_PRINCIPAL="Pour revenir au rapport principal";

 //Viennent ensuite les messages pour la production des ordres.

 public static final String[] CHAPITRES_ORDRES={"Diplomatie et recherche","Gestion des syst�mes","D�placement",
  "Dons et pr�ts","Divers"};

 public static final String[] DEROULEMENT_EVENEMENTS={
  "R�solution des collisions entre les ast�ro�des, les mines anti-mati�res,etc. et les flottes",
  "R�solution des votes au sein des alliances","R�solution des ench�res sur les lieutenants",
  "- R�solution des combats<BR>- Perception des revenus<BR>- Gestion des syst�mes et des constructions"+
  "<BR>- Finalisation du budget"};

 public static final String ORDRE_PRINCIPAL="Page principale des ordres";

 public static final String TITRE_ORDRES="Passage des ordres du commandant ";

 //Et pour le combat.

 public static final String[] COMBAT_FLOTTE={"Tour {0} du combat","Flotte {0} du commandant {1}","Type de vaisseau",
  "Nombre","Dommages encaiss�s","Dommages inflig�s"};
 public static final String[] COMBAT_PLANETE={"Planete {0} du commandant {1}","Milices",
  "Nombre","Dommages encaiss�s","B�timents plan�taires"};

 //Et pour les stats.

 public static final String[] STATS_PUISSANCE={"Statistiques de puissance des commandants","Place","Nom","Num�ro",
   "Race","Puissance"};
 public static final String[] STATS_REPUTATION={"R�putation des commandants","Place","Nom","Num�ro",
   "Race","R�putation","Statut"};
 public static final String[] STATS_PLANETES={"Possessions des commandants","Place","Nom","Num�ro",
   "Race","Nombre de plan�tes","Grade"};
 public static final String[] STATS_TAUX_POSTE={"Taxation des postes commerciaux",
  "Place","Nom","Num�ro","Race","Taxation"};
 public static final String[] STATS_CENTAURES={"Etats des comptes � la Banque Galactique",
  "Place","Nom","Num�ro","Race","Centaures"};
 public static final String[] STATS_POPULATION={"Recensement (en millions d'habitants)",
  "Place","Nom","Num�ro","Race","Population totale"};
 public static final String[] STATS_VAISSEAUX={"Nombre d'exemplaires en circulation",
  "Place","Nom","Nombre"};
 public static final String[] STATS_ALLIANCES={"Alliances non-secr�tes","Place","Nom","Nombre d'adh�rents","Type",
  "Site web"};
 public static final String[] STATS_ENCHERES={"Lieutenants disponibles","Heros en vente","Gouverneurs en vente"};
 public static final String[] STATS_VAISSEAUX_PUBLICS={"Vaisseaux publics"};
 public static final String[] STATS_UNIVERS={"Statistiques g�n�rales sur l'univers connu","Population","Marchandises",
  "Relations entre races","D�tail"};
 public static final String[] STATS_UNIVERS_POPULATION={"Population (en millions)","Type","Nombre","Total"};
 public static final String[] STATS_UNIVERS_POSTE={"Marchandises","Type","Nombre en circulation","Prix moyen constat�"};
 public static final String[] STATS_UNIVERS_RELATIONS={"Relations entres les diff�rentes races"};
 public static final String[] STATS_UNIVERS_SITES={"Sites des commandants","Sites des alliances","Sites d'Oc�ane"};




 }



