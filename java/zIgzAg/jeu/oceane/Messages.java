// v2.01 24/02/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.



package zIgzAg.jeu.oceane;
/*
 * @author  Julien Buret
 * @version 2.01, 24/02/01
 */

public class Messages extends MessagesAbstraits{

 public static final String[] NOMS_GALAXIES={"Voie Lact�e","Orion"};

 public static final String[] SORTES_ATMOSPHERES={"id�ale","vivifiante","classique","toxique","tr�s toxique"};
   // les diff�rentes atmosph�res.

 public static final String[] MARCHANDISES={"produits alimentaires","mat�riel agricole","articles de luxe",
               "holofilms et hololivres","alcools et drogues","m�dicaments","logiciels","robots","composants �lectroniques",
               "armement et explosifs","carburants","pi�ces industrielles","m�taux pr�cieux","tixium","lixiam","oxole"};
   //les noms des marchandises.

 public static final String[] POLITIQUES={"imp�ts","commerce","d�fense","construction","expansion","int�griste",
   "totalitaire","esclavagiste","anti-Humains","anti-ZorgluBs","anti-Golos","anti-Yozdas","anti-Jondo�shis","anti-Nomades",
   "anti-Drewins","anti-Tonks","anti-Golubs","anti-Zooush"};
   //Les diff�rentes formes de politique.

 public static final String[] MISSIONS={"d'espionnage","de sabotage","de vol de technologie","de propagande"};
  //Les diff�rentes sortes de mission pour les services sp�ciaux

 public static final String[] ETOILES={"�toile bleue","nova","�toile blanche","naine orange","naine bleue","naine rouge"};
   //le nom des diff�rents types d'�toiles.

 public static final String[] CARACTERISTIQUES_ARMES={"vitesse de base","dommage bouclier","dommage coque","dommage au sol",
    "port�e","fiabilit�"};
   //Le nom des diff�rentes caract�ristiques des armes.

 public static final String[] CARAC_SPECIALES_COMPOSANTS={"propulsion","port�e scanner de syst�mes",
    "propulsion intragalactique","propulsion intergalactique","capacit� bouclier magn�tique","lanceur de mines",
    "d�tection de mines","potentiel navire usine","brouillage radar","capacit� rayon tracteur","capacit� cargo",
    "capacit� ville spatiale","capacit� colonisation","port�e scanner de flottes","capacit� dragueur mines"};
   //Le nom des diff�rentes caract�ristiques sp�ciales des composants de vaisseaux.

 public static final String[] CARAC_SPECIALES_BATIMENTS={"construction de vaisseaux","extraction de minerai",
  "retraitement de minerai","facilit�s de construction","pr�sence population non n�cessaire",
  "capacit� r�paration vaisseaux","bouclier magn�tique","capacit� production marchandises","port�e radar",
  "capacit� extraction avanc�e"};
   //Le nom des diff�rentes caract�ristiques sp�ciales des batiments.

 public static final String[] DOMAINES_BUDGET={"recherche","services sp�ciaux","contre-espionnage"};
   //Les diff�rentes possibilit�s pour le choix du budget d'un syst�me.

 public static final String[] RACES={"humain","zorglub","golo","yozda","jondo�shi",
                                     "nomade","drewin","tonk","golub","zooush",};
   //Les diff�rentes races.

 public static final String[] COMPETENCES_LEADER={"ma�trise de la vitesse","ma�trise de l'attaque",
  "ma�trise de la d�fense","ma�trise du moral","ma�trise du marchandage","inspiration fanatique","entretien flotte",
  "entretien h�ros","immortalit�","voyageur","voyage intragalactique","voyage intergalactique","ma�trise du savoir",
  "entretien syst�me","ma�trise de la finance"};
   //Description des diff�rentes comp�tences sp�ciales possibles des leaders(h�ros ou gouverneurs).

 public static final String[] CARACTERISTIQUES_LEADER={"vitesse","attaque","d�fense","moral","marchandage"};
   //Description des diff�rentes caract�ristques des leaders(h�ros ou gouverneurs).

 public static final String[] EXPERIENCE={"conscrit","r�serviste","soldat","v�t�ran","�lite"};
   //Les diff�rents niveaux d'exp�rience pour les �quipages de vaisseaux.

 public static final String[] MORAL={"suicidaire","d�faitiste","calamiteux","mauvais","m�diocre","moyen","assez bon",
         "bon","tr�s bon","excellent","extraordinaire","supr�me"};
   //Les diff�rents types de moral pour l'�quipage d'un vaisseau

 public static final String[] PUISSANCE={"insignifiante","ridicule","tr�s petite","petite","moyenne","assez grande",
         "grande","tr�s grande","gigantesque","titanesque","inimaginable"};
   //Les diff�rents types de grandeur pour une flotte

 public static final String[] DOMMAGES={"neuf","quasi-neuf","moyennement endommag�","s�rieusement endommag�",
         "catastrophique","en perdition"};
  //Les diff�rents niveaux de dommages pour une flotte

 public static final String[] REPUTATION={"sanguinaire","pirate","hors-la-loi","neutre","honn�te","respect�"};
  //Les diff�rents status possibles en fonction de la r�putation.

 public static final String[] GRADE={"chef de bande","hobereau","chevalier","baron","comte","duc","roi","empereur"};
  //Les diff�rents grades possibles en fonction du nombre de plan�tes poss�d�es.

 public static final String[] RELATIONS={"guerre ouverte","haineuse","catastrophique","d�testable","mauvaise",
         "neutre","loyale","bonne","amicale","alliance","amour fou"};
  //Les diff�rents types de relations entre races.

 public static final String[] DIRECTIVES={"attitude neutre","attaque du syst�me","attaque pr�ventive",
   "attaquer toute flotte rencontr�e","pillage du syst�me","attaque de la plan�te n�","pillage de plan�te n�",
   "�radication de la plan�te n�","attaque des flottes du commandant "};
  //diff�rentes directives.

 public static final String[] DOMAINES_PLAN_DE_VAISSEAU={"public","priv�"};
  //domaine public ou priv�...

 public static final String[] CHAMPS_BUDGET={"centaures du tour pr�cedent","revenus des syst�mes","revenus des alliances",
  "taxe d'entr�e dans alliance","dons centaures","vente de marchandises","licenciement lieutenant",
  "politiques d'extermination","perception de royalties","villes spatiales","pillage de plan�te","revenus divers",
  "vente flotte","","","","","","",
  "total des recettes","cr�ation alliance",
  "adh�sion alliance","dons centaures","dons technologie","dons syst�me","don plan�te","terraformation",
  "achat de marchandises","achat de lieutenant","changement de capitale","changement de politique",
  "pr�t flotte","don plan de vaisseau","cr�ation plan de vaisseau","don strat�gie de combat","r�alisation construction",
  "entretien flotte","entretien syst�me","budget technologique","budget services sp�ciaux",
  "budget contre-espionnage","entretien des lieutenants","entretien des technologies","r�paration des flottes",
  "achat flotte","divers","franchissement porte intra-galactique",
  "total des d�penses","total disponible"};
  //les diff�rents champs de budget.

 public static final String[] TYPE_ALLIANCE={"d�mocratique","autocratique","anarchique"};
  //les diff�rents types d'alliance possible.

 public static final String[] ALLIANCE_SECRET={"secr�te","non-secr�te"};
  //les adjectifs secret et non-secret pour les alliances.

 public static final String[] MODE_TRANSFERT={"normal","discret","anonyme"};
  //les diff�rents modes pour les transferts.

 public static final String[] STRATEGIE_CIBLE={"aucune","chasseur","bombardier","cargo"};
  //les diff�rentes cible pr�f�rentielles dans les strat�gies.

 public static final String[] STRATEGIE_AGRESSIVITE={"pillage","fuyard","prudent","normal","combatif","rage"};
  //les diff�rents types d'agressivit� dans les strat�gies.

 public static final String[] ORDRES={"Adh�rer � une alliance","Valider l'adh�sion � une alliance",
  "Voter pour �lire le dirigeant d'une alliance","Voter pour exclure un membre d'une alliance","Quitter une alliance",
  "Signer un pacte","Rompre un pacte","Affecter un h�ros","Affecter un gouverneur","Licencier un lieutenant",
  "Enroler un lieutenant","Changer la capitale","Orienter les recherches","Services sp�ciaux",
  "Annuler construction","Construction","Programmer des constructions","D�programmer des constructions",
  "Modifier une politique","Modifier un budget","Modifier la taxation d'un syst�me","Modifier la taxation d'une plan�te",
  "Terraformer un syst�me","Terraformer une plan�te","D�truire des b�timents","D�charger des cargos","Charger des cargos",
  "Coloniser","Larguer des mines","Construire � partir d'une flotte","Utiliser une porte galactique","Diviser une flotte",
  "D�placer une flotte","Pister une flotte","Fusionner une flotte","Donner des centaures",
  "Donner une technologie","Donner un syst�me","Donner une plan�te","Pr�ter une flotte",
  "Vendre une flotte","Donner une strat�gie de combat",
  "Donner un plan de vaisseau","Cr�er un plan de vaisseau","Cr�er une alliance","Cr�er une strat�gie de combat",
  "Abandonner une technologie","Modifier le taux de taxation de vos postes commerciaux",
  "Renommer un syst�me","Renommer une plan�te","Renommer une flotte","Renommer un lieutenant","Renommer une alliance",
  "Site d'un commandant","Site d'une alliance","Ecrire un article"};
  //les diff�rents ordres possibles.

 public static final String[] OUI_NON={"oui","non"};
  //oui ou non ?!

 public static final String ALLIANCE_CONCEPTEUR_INCONNU="inconnu";
  //le nom pour les concepteurs d'alliances inconnus.

 public static final String PLANETE_MARCHANDISE_INCULTE="aucune";
  //Si la plan�te ne produit naturellement aucune marchandise.

 public static final String NON_EXISTENCE_DIRIGEANT_ALLIANCE="aucun";
  //le nom pour les dirigeants des alliances non dirig�es..

 public static final String PLAN_DE_VAISSEAU_CONCEPTEUR_INCONNU="inconnu";
  //le nom pour les concepteurs de plans de vaisseaux inconnus.

 public static final String PLAN_DE_VAISSEAU_MARQUE_INCONNUE="inconnue";
  //le nom pour les marques de plans de vaisseaux inconnues.

 public static final String MINERAI="minerai";
  //le nom pour decrire le minerai.

 public static final String DE_TYPE=" de type ";
  //Sert � faite la liaison pour le nom comple de la technologie. Exemple: mine de type I.

 public static final String POSTE_COMMERCIAL="poste commercial du commandant ";
  //le nom pour d�crire un poste commercial;

 public static final String RESERVE_LEADER="en r�serve";
  //la description de la position d'un leader "en r�serve";

 public static final String POSITION_GOUVERNEUR="gouverneur du syst�me ";
  //la description de la position d'un gouverneur.

 public static final String POSITION_HEROS="commandant de la flotte num�ro ";
  //la description de la position d'un h�ros.

 public static final String DESCRIPTION_FLOTTE1="flotte num�ro ";
 public static final String DESCRIPTION_FLOTTE2=" du commandant ";
  //les phrases n�cessaires pour la description d'une flotte.

 public static final String TECHNOLOGIE_AUCUN_PARENT="aucune technologie n�cessaire";
  //Pour les technologies "de base".

 public static final String DENOMINATION_FLOTTE_DE_DEPART="Flotte de d�part";
  //Le nom de la flotte de d�part.

 public static final String RETOUR_DE_PRET="Retour de pr�t";
  //Le nom de la flotte de retour de pr�t.

 public static final String SECTEUR="secteur ";
  //Le nom pour les secteurs de galaxie.

 public static final String RETOUR_SITE="Retour vers le site d'Oc�ane";
  //La phrase cl� du programme !

 }



