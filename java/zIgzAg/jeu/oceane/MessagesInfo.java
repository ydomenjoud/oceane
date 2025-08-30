// v2.03 24/02/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.



package zIgzAg.jeu.oceane;
/*
 * @author  Julien Buret
 * @version 2.03, 24/02/01
 */

public class MessagesInfo extends MessagesAbstraits{

 public static final String MAIL_TITRE_RAPPORT="[Oc�ane] Rapport du tour {0}";
 public static final String MAIL_CORPS_NOUVEAU_RAPPORT="Bonjour,je suis une IA qui r�pond au doux nom de Xyur06-Tr.\n\nVous vous �tes inscrit � Oc�ane, un jeu qui a comme adresse internet "+Chemin.RACINE_SITE+" .\n\nVotre rapport se trouve ici : {2} \n\nVous aurez besoin de:\n  1)votre login: {0}\n  2)votre mot de passe: {1}\n\n Conservez les pr�cieusement!\n\n           (....) \n\n Humm... Un autre �v�nement requiert mon attention et je dois vous quitter, momentan�ment!\n\n Ah oui! Si vous voulez pour une raison ou une autre vous d�sinscrire, allez sur la page "+Chemin.SITE_REGISTRE+" .\n\nA bient�t et bonne chance!\n\nXyur06-Tr";
 public static final String MAIL_CORPS_RAPPORT="Bonjour,je suis une IA qui r�pond au doux nom de Xyur06-Tr.\n\nAttention, les images n�cessaires au rapport ne sont fournies que lors du premier tour. Si vous avez effac� vos images n�cessaires pour visualiser votre rapport avec les images, vous pouvez les t�l�chargez � cette adresse :  http://jeu.oceane.free.fr/telecha/images.zip et les d�zipper dans le m�me r�pertoire dans lequel vous d�zippez le rapport. \n\n Rappel Oc�ane:  "+Chemin.RACINE_SITE+" .\n\nVotre rapport se trouve ici : {2} \n\nVous aurez besoin de:\n  1)votre login: {0}\n  2)votre mot de passe: {1}\n\n Conservez les pr�cieusement!\n\n           (....) \n\n Humm... Un autre �v�nement requiert mon attention et je dois vous quitter, momentan�ment!\n\n Ah oui! Si vous voulez pour une raison ou une autre vous d�sinscrire, allez sur la page "+Chemin.SITE_REGISTRE+" .\n\nA bient�t et bonne chance!\n\nXyur06-Tr";

 public static final String HEROS_MORT_0000="Au cours de ce combat, votre lieutenant {0} vient de r�chapper de justesse � la mort.";
 public static final String HEROS_MORT_0001="Au cours de ce combat, votre lieutenant {0} a trouv� la mort. Un clone de lui est disponible aux Ench�res Galactiques.";
 public static final String HEROS_MORT_0002="Le lieutenant {0} du commandant {1} vient trouver la mort lors d'un combat �pique. Un nouveau clone est disponible aux Ench�res Galactiques.";

 public static final String HEROS_AUGMENTATION_NIVEAU_0000="Votre lieutenant {0} vient d'augmenter d'un niveau. Il gagne un point dans sa caract�ristique {1} et un niveau en ce qui concerne la comp�tence {2}.";

 public static final String ELIMINATION_COMMANDANT_0000="Nous apprenons avec tristesse que le commandant {0} vient de dispara�tre. Toutes ses fiefs sont maintenant neutres.";
 public static final String APPARITION_COMMANDANT_0000="On nous signale l'apparition d'un nouveau commandant! {0} vient en effet de conqu�rir son premier syst�me. Nul doute que ses proches voisins lui souhaiteront la bienvenue!";

 public static final String RETOUR_PRET_FLOTTE_0000="Certains vaisseaux que vous aviez pr�t�s au commandant {0} viennent de se remettre sous votre commandement.";
 public static final String RETOUR_PRET_FLOTTE_0001="Certains vaisseaux que le commandant {0} vous avait pr�t�s viennent de regagner leur affectation d'origine.";

 public static final String SYSTEME_EXTERMINATION_0000="Votre politique d'extermination sur le syst�me {0} vous as rapport� cette semaine {1} centaures.";

 public static final String EVENEMENT_0000=
  "Le fond d'aide aux d�sh�rit�s de la <i>Banque Galactique</i> vous vient en aide. Vous recevez {0} centaures.";


 public static final String EVENEMENT_POPULATION_POSITIF_0=
  "La plan�te {1} de votre syst�me {0} connait un extraordinaire boom des naissances. Sa population augmente de {2} millions.";
 public static final String EVENEMENT_POPULATION_POSITIF_1=
  "La plan�te {1} de votre syst�me {0} assiste � un afflux massif de r�fugi�s. Sa population augmente de {2} millions.";
 public static final String EVENEMENT_POPULATION_POSITIF_2=
  "La plan�te {1} de votre syst�me {0} vient de d�couvrir sur son sol des minerais pr�cieux. On assiste � une v�ritable ru�e vers l'or. Sa population augmente de {2} millions.";
 public static final String EVENEMENT_POPULATION_POSITIF_3=
  "Un proph�te c�l�bre vient de s'�tablir sur la plan�te {1} de votre syst�me {0}. La masse de ses adorateurs le suit. La population de la plan�te augmente de {2} millions.";
 public static final String EVENEMENT_POPULATION_NEGATIF_0=
  "La plan�te {1} de votre syst�me {0} subit une �pid�mie d�vastatrice. Sa population diminue de {2} millions.";
 public static final String EVENEMENT_POPULATION_NEGATIF_1=
  "La plan�te {1} de votre syst�me {0} traverse une grave crise �conomique. Sa population diminue de {2} millions.";
 public static final String EVENEMENT_POPULATION_NEGATIF_2=
  "La plan�te {1} de votre syst�me {0} vient de subir une collision avec un m�t�orite g�ant. Sa population diminue de {2} millions.";
 public static final String EVENEMENT_POPULATION_NEGATIF_3=
  "Un proph�te c�l�bre vient de maudir la plan�te {1} de votre syst�me {0}. Les gens fuient. La population de la plan�te diminue de {2} millions.";

 public static final String COMBAT_FLOTTE_0000=
  "Votre flotte {0} vient de combattre contre la flotte {1} du commandant {2}. Cela a donn� le r�sultat suivant:<BR>";
 public static final String COMBAT_FLOTTE_0001=
  "Votre flotte est d�truite.";
 public static final String COMBAT_FLOTTE_0002=
  "Votre flotte a subit {0} dommage(s) et a perdu {1} vaisseau(x).";
 public static final String COMBAT_FLOTTE_0003=
  "La flotte ennemie est d�truite.";
 public static final String COMBAT_FLOTTE_0004=
  "La flotte ennemie a subit {0} dommage(s) et a perdu {1} vaisseau(x).";
 public static final String COMBAT_FLOTTE_0005=
  "<HR><BIG>Tour de combat num�ro {3} entre votre flotte {2} et la flotte {1} du commandant {0}</BIG><BR>";
 public static final String COMBAT_FLOTTE_0006=
  "Pour voir le d�tail du combat";
 public static final String COMBAT_FLOTTE_0007=
  "R�sultat du combat:<BR>";

 public static final String COMBAT_SYSTEME_0000=
  "Votre flotte {0} vient de prendre la plan�te {1} du syst�me {2} appartenant au commandant {3}.";
 public static final String COMBAT_SYSTEME_0001=
  "La flotte {0} du commandant {3} vient de prendre votre plan�te {1} du syst�me {2}.";
 public static final String COMBAT_SYSTEME_0002=
  "Votre flotte {0} vient d'�chouer dans son attaque sur la plan�te {1} du syst�me {2} appartenant au commandant {3}.";
 public static final String COMBAT_SYSTEME_0003=
  "Votre plan�te {1} du syst�me {2} vient de repousser l'attaque de la flotte {0} du commandant {3}.";
 public static final String COMBAT_SYSTEME_0004=
  "<HR><BIG>Tour de combat num�ro {4} entre votre plan�te {2} du syst�me {3} et la flotte {1} du commandant {0}</BIG><BR>";
 public static final String COMBAT_SYSTEME_0005=
  "<HR><BIG>Tour de combat num�ro {4} entre votre flotte {1} et la plan�te {2} du syst�me {3} du commandant {0}</BIG><BR>";
 public static final String COMBAT_SYSTEME_0006=
  "Combat entre votre flotte {0} et certaines plan�tes du syst�me {1}. Vous avez pris {2} plan�te(s).";
 public static final String COMBAT_SYSTEME_0007=
  "Combat entre la flotte {0} du commandant {2} et certaines de vos plan�tes du syst�me {1}. Vous avez perdu {3} plan�te(s).";
 public static final String COMBAT_SYSTEME_0008=
  "Votre flotte {0} n'a pu combattre car les plan�tes cibles appartiennent � des commandants pr�sents dans vos alliances ou avec lesquels vous avez des pactes de non-agression.";
 public static final String COMBAT_SYSTEME_0009=
  "Combat entre votre flotte {0} et certaines plan�tes du syst�me {1}. Vous avez pill� {2} plan�te(s).";
 public static final String COMBAT_SYSTEME_0010=
  "Votre flotte {0} vient de piller la plan�te {1} du syst�me {2} appartenant au commandant {3}.";
 public static final String COMBAT_SYSTEME_0011=
  "La flotte {0} du commandant {3} vient de piller votre plan�te {1} du syst�me {2}.";
 public static final String COMBAT_SYSTEME_0012=
  "Votre flotte {0} vient d'�radiquer la plan�te {1} du syst�me {2} appartenant au commandant {3}.";
 public static final String COMBAT_SYSTEME_0013=
  "La flotte {0} du commandant {3} vient d'�radiquer votre plan�te {1} du syst�me {2}.";
 public static final String COMBAT_SYSTEME_0014=
  "Votre flotte {0} n'a pu combattre car la plan�tes cible appartient � un commandant pr�sent dans vos alliances ou avec lesquel vous avez un pacte de non-agression.";
 public static final String COMBAT_SYSTEME_0015=
  "Votre flotte {0} n'a pu combattre car elle n'a pas la puissance minimale requise pour attaquer une plan�te.";

 public static final String ER_COMMANDANT_ALLIANCE_0000=
  "Impossible de cr�er l'alliance {0}. Vous ne disposez que de {1} centaures en ce moment : ce n'est pas suffisant!";
 public static final String ER_COMMANDANT_ALLIANCE_0001=
  "Impossible de cr�er l'alliance {0}. Vous �tes d�j� membre du nombre maximal d'alliances permis.";
 public static final String ER_COMMANDANT_ALLIANCE_0002=
  "Impossible d'adh�rer � l'alliance {0}. Vous ne disposez que de {1} centaures en ce moment : ce n'est pas suffisant pour payer la taxe d'entr�e!";
 public static final String ER_COMMANDANT_ALLIANCE_0003=
  "Impossible d'adh�rer � l'alliance {0}. Vous �tes d�j� membre du nombre maximal d'alliances permis.";
 public static final String ER_COMMANDANT_ALLIANCE_0004=
  "Impossible de cr�er l'alliance {0}. Vous �tes d�j� dirigeant d'une autre alliance.";
 public static final String ER_COMMANDANT_ALLIANCE_0005=
  "Impossible de quitter l'alliance {0}. Vous n'appartenez pas � cette alliance.";
 public static final String ER_COMMANDANT_ALLIANCE_0006=
   "Vous ne pouvez renommer l'alliance {0} car vous ne la dirigez pas.";
 public static final String ER_COMMANDANT_ALLIANCE_0007=
  "Vous ne pouvez changer l'adresse electronique de l'alliance {0} car vous ne la dirigez pas.";
 public static final String EV_COMMANDANT_ALLIANCE_0000=
  "Vous venez de cr�er l'alliance {0}.";
 public static final String EV_COMMANDANT_ALLIANCE_0001=
  "Vous venez d'adh�rer � l'alliance {0} en aquittant la taxe d'entr�e de {1} centaures.";
 public static final String EV_COMMANDANT_ALLIANCE_0002=
  "Vous venez de quitter l'alliance {0}.";
 public static final String EV_COMMANDANT_ALLIANCE_0003=
  "Votre adh�sion � l'alliance {0} n'a pu s'effectuer car le dirigeant de cette alliance n'a pas valid� votre adh�sion.";
 public static final String EV_COMMANDANT_ALLIANCE_0004=
  "Vous venez de voter en faveur du commandant {1} pour l'�lire � la t�te de l'alliance {0} .";
 public static final String EV_COMMANDANT_ALLIANCE_0005=
  "Vous venez d'�tre exclu de l'alliance {0}.";
 public static final String EV_COMMANDANT_ALLIANCE_0006=
  "Vous venez de voter l'exclusion du commandant {1} de l'alliance {0}.";

 public static final String PUBLIC_ALLIANCE_0000=
  "L'alliance {0} vient d'�tre dissoute faute de membres.";
 public static final String PUBLIC_ACHETER_COMMANDANT_0000=
  "Le commandant {0} vient d'acqu�rir les services du lieutenant {1} pour {2} centaures.";
 public static final String PUBLIC_TECHNOLOGIE_0000=
  "La technologie {0} vient de devenir publique.";

 public static final String EV_ALLIANCE_0000=
  "Le commandant {0} vient d'adh�rer � l'alliance.<BR>";
 public static final String EV_ALLIANCE_0001=
  "Le commandant {0} vient de quitter l'alliance.<BR>";
 public static final String EV_ALLIANCE_0002=
  "Votes en vue de l'�lection d'un nouveau dirigeant : <BR>";
 public static final String EV_ALLIANCE_0003=
  "Le commandant {0} vient d'�tre �lu comme dirigeant de l'alliance {1} avec {2} voix sur {3} possibles.<BR>";
 public static final String EV_ALLIANCE_0004=
  "Le commandant {0} vient d'�tre exclu de l'alliance.<BR>";
 public static final String EV_ALLIANCE_0005=
  "Le commandant {0} vient d'�tre exclu de l'alliance par {1} voix {2} possibles.<BR>";
 public static final String EV_ALLIANCE_0006=
  "L'exclusion du commandant {0} n'a recueilli que {1} voix sur {2} possibles et n'est donc pas effective.<BR>";
 public static final String EV_ALLIANCE_0007=
  "L'alliance est renomm� par son dirigeant avec pour nouveau nom {0}.<BR>";
 public static final String EV_ALLIANCE_0008=
  "Le site de l'alliance a comme nouvelle adresse {0}.<BR>";
 public static final String EV_ALLIANCE_0009=
  "Le commandant {0} n'a pu �tre �lu car il est d�j� dirigeant d'une alliance. L'�lection est donc annul�e.<BR>";
 public static final String EV_ALLIANCE_0010=
  "Le commandant {0} n'a pu �tre �lu comme dirigeant de l'alliance {1} car il n'a recueilli que {2} voix sur {3} possibles.<BR>";

 public static final String EV_COMMANDANT_PACTE_0000=
   "{0} vient de rompre son pacte de non-agression avec vous.";
 public static final String EV_COMMANDANT_PACTE_0001=
   "Vous venez de rompre le pacte de non-agression avec le commandant {0}.";
 public static final String EV_COMMANDANT_PACTE_0002=
   "Vous venez de signer un pacte de non-agression avec le commandant num�ro {0}.";
 public static final String EV_COMMANDANT_PACTE_0003=
   "Vous n'avez pas pu signer un pacte de non-agression avec le commandant num�ro {0} car il ne l'a pas demand� de son cot�.";

 public static final String ER_COMMANDANT_DON_CENTAURES_0000=
   "Vous n'avez pas pu transmettre {0} centaures au commandant num�ro {1} : vous n'�tes pas assez riche en ce moment!";
 public static final String EV_COMMANDANT_DON_CENTAURES_0000=
   "Le commandant {0} a transmis {2} centaures au commandant {1} cette semaine.";
 public static final String EV_COMMANDANT_DON_CENTAURES_0001=
   "Dans votre insondable bont�, vous avez transmis {1} centaures au commandant {0}.";
 public static final String EV_COMMANDANT_DON_CENTAURES_0002=
   "Vous avez recu {0} centaures d'un bienfaiteur g�n�reux qui souhaite rester anonyme.";
 public static final String EV_COMMANDANT_DON_CENTAURES_0003=
   "Le commandant {0} vous as transmis {1} centaures.";

 public static final String ER_COMMANDANT_DON_TECHNOLOGIE_0000=
   "Impossible de transmettre la technologie {0} au commandant num�ro {1} : vous ne disposez pas d'assez de centaures en ce moment.";
 public static final String ER_COMMANDANT_DON_TECHNOLOGIE_0001=
   "Impossible de transmettre la technologie {0} au commandant num�ro {1} : ce commandant conna�t d�j� cette technologie!";
 public static final String EV_COMMANDANT_DON_TECHNOLOGIE_0000=
   "Dans votre insondable bont�, vous avez transmis la technologie {1} au commandant {0}.";
 public static final String EV_COMMANDANT_DON_TECHNOLOGIE_0001=
   "Le commandant {0} vous as transmis la technologie {1}.";
 public static final String EV_COMMANDANT_DON_TECHNOLOGIE_0002=
   "Le commandant {0} as transmis la technologie {2} au commandant {1}.";
 public static final String EV_COMMANDANT_DON_TECHNOLOGIE_0003=
   "Un commandant qui souhaite garder l'anonymat vous as transmis la technologie {0}.";

 public static final String EV_COMMANDANT_ELIMINER_TECHNOLOGIE_0000=
   "Vous venez d'abandonner toute connaissance sur la technologie {0}.";

 public static final String ER_COMMANDANT_DON_FLOTTE_0000=
   "Impossible de transmettre votre flotte {0} au commandant num�ro {1} : vous ne disposez pas d'assez de centaures en ce moment.";
 public static final String ER_COMMANDANT_DON_FLOTTE_0001=
   "Impossible de donner la flotte num�ro {0} au commandant num�ro {1} : le flotte contient des vaisseaux en location.";
 public static final String EV_COMMANDANT_DON_FLOTTE_0000=
  "Dans votre insondable bont�, vous avez lou� votre flotte num�ro {1} au commandant {0} pour {2} tours.";
 public static final String EV_COMMANDANT_DON_FLOTTE_0001=
  "Le commandant {0} vous a lou� sa flotte num�ro {1} pour {2} tours.";
 public static final String EV_COMMANDANT_DON_FLOTTE_0002=
  "Le commandant qui souhaite garder l'anonymat vous a lou� sa flotte num�ro {0} pour {1} tours.";
 public static final String EV_COMMANDANT_DON_FLOTTE_0003=
  "Le commandant {0} a lou� une de ses flottes au commandant {1} cette semaine.";

 public static final String ER_COMMANDANT_VENTE_FLOTTE_0000=
   "Impossible de vendre votre flotte {0} au commandant num�ro {1} : ce commandant ne dispose pas d'assez de centaures en ce moment.";
 public static final String ER_COMMANDANT_VENTE_FLOTTE_0003=
   "Impossible de vendre la flotte num�ro {0} au commandant num�ro {1} : le flotte contient des vaisseaux en location.";

 public static final String EV_COMMANDANT_VENTE_FLOTTE_0000=
  "Dans votre insondable bont�, vous avez vendu votre flotte num�ro {1} au commandant {0}.";
 public static final String EV_COMMANDANT_VENTE_FLOTTE_0001=
  "Le commandant {0} vous a vendu sa flotte num�ro {1} pour {2} centaures.";
 public static final String EV_COMMANDANT_VENTE_FLOTTE_0003=
  "Le commandant {0} a vendu une de ses flottes au commandant {1} cette semaine.";

 public static final String ER_COMMANDANT_DON_SYSTEME_0000=
   "Impossible de transmettre le systeme {0} au commandant num�ro {1} : vous ne disposez pas d'assez de centaures en ce moment.";
 public static final String EV_COMMANDANT_DON_SYSTEME_0000=
   "Dans votre insondable bont�, vous avez transmis le syst�me {1} au commandant {0}.";
 public static final String EV_COMMANDANT_DON_SYSTEME_0001=
   "Le commandant {0} vous as transmis le syst�me {1}.";
 public static final String EV_COMMANDANT_DON_SYSTEME_0002=
   "Le commandant {0} as transmis les plan�tes de son syst�me {2} au commandant {1} cette semaine.";
 public static final String EV_COMMANDANT_DON_SYSTEME_0003=
   "Un commandant qui souhaite garder l'anonymat vous as transmis le syst�me {0}.";

 public static final String ER_COMMANDANT_DON_PLANETE_0000=
   "Impossible de transmettre la plan�te {1} du systeme {0} au commandant num�ro {2} : vous ne disposez pas d'assez de centaures en ce moment.";
 public static final String ER_COMMANDANT_DON_PLANETE_0001=
   "Impossible de transmettre la plan�te num�ro {2} du systeme {0} au commandant num�ro {1} : cette plan�te n'existe pas.";
 public static final String ER_COMMANDANT_DON_PLANETE_0002=
   "Impossible de donner la plan�te {1} du syst�me {0} : cette plan�te ne vous appartient pas.";
 public static final String EV_COMMANDANT_DON_PLANETE_0000=
   "Dans votre insondable bont�, vous avez transmis la plan�te {2} du syst�me {1} au commandant {0}.";
 public static final String EV_COMMANDANT_DON_PLANETE_0001=
   "Le commandant {0} vous as transmis la plan�te {2} du syst�me {1}.";
 public static final String EV_COMMANDANT_DON_PLANETE_0002=
   "Le commandant {0} as transmis une plan�te du syst�me {2} au commandant {1} cette semaine.";
 public static final String EV_COMMANDANT_DON_PLANETE_0003=
   "Un commandant qui souhaite garder l'anonymat vous as transmis la plan�te {1} du syst�me {0}.";

 public static final String ER_COMMANDANT_MISE_EN_CHANTIER_0000=
   "Impossible de mettre en chantier une construction  sur la plan�te num�ro {1} du syst�me {0} : cette plan�te n'existe pas.";
 public static final String EV_COMMANDANT_MISE_EN_CHANTIER_0000=
   "Vous venez de mettre en chantier {2} construction(s) de type {1} sur le syst�me {0}.";

 public static final String EV_COMMANDANT_ANNULER_CONSTRUCTION_0000=
  "Vous venez d'annuler tous vos projets de constructions en cours sur le syst�me {0}.";

 public static final String EV_COMMANDANT_PROGRAMMER_CONSTRUCTION_0000=
  "Vous venez de lancer un programme de construction de type {1} sur le syst�me {0}.";

 public static final String EV_COMMANDANT_ANNULER_PROGRAMME_CONSTRUCTION_0000=
  "Vous venez d'annuler votre programme de construction sur le syst�me {0}.";

 public static final String EV_COMMANDANT_MODIFIER_POLITIQUE_0000=
   "Vous venez de commencer � mettre en oeuvre une politique de type {1} sur votre syst�me {0}.";

 public static final String ER_COMMANDANT_MODIFIER_BUDGET_0000=
   "Impossible de modifier le budget du syst�me {0} : le total des affectations du nouveau budget est sup�rieur � 100.";
 public static final String EV_COMMANDANT_MODIFIER_BUDGET_0000=
   "Un nouveau budget a �t� adopt� � votre instigation sur votre syst�me {0}.";

 public static final String ER_COMMANDANT_MODIFIER_TAXATION_0000=
   "Impossible de modifier la taxation sur la plan�te num�ro {1} du syst�me {0} : cette plan�te n'existe pas.";
 public static final String ER_COMMANDANT_MODIFIER_TAXATION_0001=
   "Impossible de modifier la taxation de la plan�te {1} du syst�me {0} : cette plan�te ne vous appartient pas.";
 public static final String EV_COMMANDANT_MODIFIER_TAXATION_0000=
   "Un nouvelle taxation de niveau {1} est en vigueur sur toutes vos plan�tes de votre syst�me {0}.";
 public static final String EV_COMMANDANT_MODIFIER_TAXATION_0001=
   "Un nouvelle taxation de niveau {2} est en vigueur sur la plan�te {1} de votre syst�me {0}.";

 public static final String ER_COMMANDANT_TERRAFORMER_0000=
   "Impossible de terraformer le syst�me {0} : vous n'avez pas assez de centaures en ce moment.";
 public static final String ER_COMMANDANT_TERRAFORMER_0001=
   "Impossible de terraformer la plan�te {1} du syst�me {0} : vous n'avez pas assez de centaures en ce moment.";
 public static final String ER_COMMANDANT_TERRAFORMER_0002=
   "Impossible de terraformer la plan�te num�ro {1} du syst�me {0} : cette plan�te n'existe pas.";
 public static final String ER_COMMANDANT_TERRAFORMER_0003=
   "Impossible de terraformer la plan�te {1} du syst�me {0} : cette plan�te ne vous appartient pas.";
 public static final String ER_COMMANDANT_TERRAFORMER_0004=
   "Impossible de terraformer le syst�me {0} : Il l'a d�j� �t� ce tour-ci.";
 public static final String ER_COMMANDANT_TERRAFORMER_0005=
   "Impossible de terraformer la plan�te {1} du syst�me {0} : elle l'a d�j� �t� ce tour-ci.";
 public static final String EV_COMMANDANT_TERRAFORMER_0000=
   "Toutes vos plan�tes de votre syst�me {0} ont �t� terraform�es pour un co�t total de {1} centaures.";
 public static final String EV_COMMANDANT_TERRAFORMER_0001=
   "Votre plan�te {1} de votre syst�me {0} a �t� terraform�e pour un co�t total de {2} centaures.";

 public static final String ER_COMMANDANT_DETRUIRE_BATIMENT_0000=
   "Impossible de d�truire des {1} sur le syst�me {0} : Ce type de b�timent n'est pas pr�sent sur ce syst�me.";
 public static final String ER_COMMANDANT_DETRUIRE_BATIMENT_0001=
   "Impossible de d�truire des {1} sur la plan�te {2} du syst�me {0} : Ce type de b�timent n'est pas pr�sent sur cette plan�te.";
 public static final String ER_COMMANDANT_DETRUIRE_BATIMENT_0002=
   "Impossible de d�truire des b�timents sur la plan�te num�ro {1} du syst�me {0} : cette plan�te n'existe pas.";
 public static final String ER_COMMANDANT_DETRUIRE_BATIMENT_0003=
   "Impossible de d�truire des b�timents sur la plan�te {1} du syst�me {0} : cette plan�te ne vous appartient pas.";
 public static final String EV_COMMANDANT_DETRUIRE_BATIMENT_0000=
   "{2} {1} ont �t� recycl�s sur le syst�me {0} conform�ment � vos ordres.";
 public static final String EV_COMMANDANT_DETRUIRE_BATIMENT_0001=
   "Seuls {2} {1} sur {3} demand�s ont pu �tre recycl�s sur le syst�me {0}.";
 public static final String EV_COMMANDANT_DETRUIRE_BATIMENT_0002=
   "{3} {1} ont �t� recycl�s sur la plan�te {2} du syst�me {0} conform�ment � vos ordres.";
 public static final String EV_COMMANDANT_DETRUIRE_BATIMENT_0003=
   "Seuls {3} {1} sur {4} demand�s ont pu �tre recycl�s sur la plan�te {2} du syst�me {0}.";


 public static final String ER_COMMANDANT_AFFECTER_RECHERCHE_0000=
   "Vous ne pouvez mettre en place votre nouveau plan de recherche : il est impossible de chercher plus de trois technologies en m�me temps!";
 public static final String ER_COMMANDANT_AFFECTER_RECHERCHE_0001=
   "Vous ne pouvez mettre en place votre nouveau plan de recherche : le total des affectations de votre nouveau plan est sup�rieur � 100!";
 public static final String EV_COMMANDANT_AFFECTER_RECHERCHE_0000=
   "Vous venez de mettre en place la recherche de la technologie {0} en y affectant {1}% de votre capacit� scientifique.";

 public static final String ER_COMMANDANT_MISSION_SPECIALE_0000=
   "Impossible pour vos services secrets d'effectuer une mission sp�ciale � la position {0} : il n'y a pas de syst�me ici.";
 public static final String ER_COMMANDANT_MISSION_SPECIALE_0001=
   "Impossible pour vos services secrets d'effectuer une mission sp�ciale sur la plan�te num�ro {1} du syst�me {0} : cette plan�te n'existe pas.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0000=
   "Vos services secrets viennent d'�chouer dans leur mission {2} sur la plan�te {1} du syst�me {0}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0001=
   "Un rapport de vos services de contre-espionnage : les services secrets du commandant {3} viennent d'�chouer dans leur mission {2} sur votre plan�te {1} du syst�me {0}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0002=
   "Vos services secrets vous informent que le commandant {0} ne poss�de pas de technologie inconnues de vos scientifiques.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0003=
   "Vos services secrets vous informent qu'ils viennent de se procurer la technologie {0}, en &quot;s'inspirant&quot; des connaissances du commandant {1}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0004=
   "Les services secrets du commandant {1} viennent de vous voler la technologie {0}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0005=
   "Vos services secrets viennent de vous faire parvenir un rapport sur le syst�me {0}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0006=
   "Vos services secrets viennent de saboter et de d�truire tous les b�timents de la plan�te {1} du syst�me {0}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0007=
   "Vos services de contre-espionnage vous informent que les services secrets du commandant {2} viennent de saboter et de d�truire tous les b�timents de votre plan�te {1} du syst�me {0}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0008=
   "Vos services de contre-espionnage vous informent qu'un service secret dont ils n'ont pas r�ussi � d�terminer l'identit� vient de saboter et de d�truire tous les b�timents de votre plan�te {1} du syst�me {0}.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0009=
   "Vos services secrets viennent d'effectuer une mission de propagande sur votre plan�te {1} du syst�me {0}, ce qui augmente de {2} sa stabilit�.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0010=
   "Vos services secrets viennent d'effectuer une mission de propagande sur la plan�te {1} du syst�me {0}, ce qui diminue de {2} sa stabilit�.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0011=
   "Vos services de contre-espionnage vous informent que les services secrets du commandant {2} viennent d'effectuer une mission de propagande sur votre plan�te {1} du syst�me {0}, ce qui diminue de {3} sa stabilit�.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0012=
   "Vos services de contre-espionnage vous informent qu'un service secret dont ils n'ont pas r�ussi � d�terminer l'identit� vient d'effectuer une mission de propagande sur votre plan�te {1} du syst�me {0}, ce qui diminue de {2} sa stabilit�.";
 public static final String EV_COMMANDANT_MISSION_SPECIALE_0013=
   "La plan�te {1} du syst�me {0} vient de se r�volter et d�cide de se mettre sous votre protection.";

 public static final String EV_COMMANDANT_DEPLACER_FLOTTE_0000=
   "Votre flotte {0} se d�place vers {1} en directive {2}.";

 public static final String ER_COMMANDANT_CHARGER_CARGO_0001=
   "Impossible de charger quelque chose dans le vaisseau cargo num�ro {1} de la flotte {0} : ce vaisseau cargo n'existe pas.";
 public static final String ER_COMMANDANT_CHARGER_CARGO_0002=
   "Impossible de charger quelque chose appartenant au commandant {1} � partir du syst�me {0}  : ce commandant ne poss�de pas de plan�tes sur ce syst�me.";
 public static final String ER_COMMANDANT_CHARGER_CARGO_0003=
   "Impossible de charger avec votre flotte {0} autre chose que des marchandises dans un syst�me �tranger.";
 public static final String ER_COMMANDANT_CHARGER_CARGO_0004=
   "Impossible de charger avec votre flotte {0} : le propri�taire du poste ou du syst�me n'est pas pr�cis�.";
 public static final String ER_COMMANDANT_CHARGER_CARGO_0005=
   "Impossible de charger un cargo � partir de la plan�te num�ro {1} du syst�me {0} : elle n'existe pas.";
 public static final String EV_COMMANDANT_CHARGER_CARGO_0000=
   "Vous venez de charger {3} {1} � partir du syst�me {0} dans votre flotte {2}.";
 public static final String EV_COMMANDANT_CHARGER_CARGO_0001=
   "Vous n'avez pas pu charger un seul {1} demand� � partir du syst�me {0} dans votre flotte {2}, soit parce que votre flotte n'a pas de cargo assez grand, soit parce qu'il n'y avait pas ce que vous demandiez sur ce syst�me.";

 public static final String ER_COMMANDANT_DECHARGER_CARGO_0000=
   "Impossible de d�charger quelque chose sur la plan�te {1} du syst�me {0} appartenant au commandant {2} : cette plan�te n'appartient pas � ce commandant.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0001=
   "Impossible de d�charger quelque chose � partir du vaisseau cargo num�ro {1} de la flotte {0} : ce vaisseau cargo n'existe pas.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0002=
   "Impossible de d�charger quelque chose sur une plan�te du commandant {1} sur le syst�me {0}  : ce commandant ne poss�de pas de plan�tes sur ce syst�me.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0003=
   "Impossible de d�charger {3} {1} avec la flotte {2} sur le syst�me {0}  : cette flotte ne poss�de pas de chargement de ce type.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0004=
   "Impossible de d�charger avec votre flotte {0} : le propri�taire du poste ou du syst�me n'est pas pr�cis�.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0005=
   "Impossible de d�charger un cargo sur la plan�te num�ro {1} du syst�me {0} : elle n'existe pas.";
 public static final String EV_COMMANDANT_DECHARGER_CARGO_0000=
   "Vous venez de d�charger {3} {1} dans le syst�me {0} � partir de votre flotte {2}.";
 public static final String EV_COMMANDANT_DECHARGER_CARGO_0001=
   "Vous n'avez pas pu d�charger un seul {1} demand� � partir de votre flotte {2}, parce que votre flotte ne contient pas ce que vous avez demand� de d�charger.";
 public static final String EV_COMMANDANT_DECHARGER_CARGO_0002=
   "Le commandant {3} vient de d�charger {4} {1} dans votre syst�me {0} � partir de sa flotte {2}.";


 public static final String ER_COMMANDANT_VENTE_MARCHANDISE_0000=
   "Vous ne pouvez acheter {2} marchandise(s) de type {0} sur le syst�me {1} : vos fonds sont insuffisants.";
 public static final String ER_COMMANDANT_VENTE_MARCHANDISE_0001=
   "Vous ne pouvez acheter {3} marchandise(s) de type {0} au commandant {2} sur le syst�me {1} : cette marchandise n'est pas pr�sente dans son poste commercial.";
public static final String ER_COMMANDANT_VENTE_MARCHANDISE_0002=
   "Vous ne pouvez acheter {3} marchandise(s) de type {0} au commandant {2} sur le syst�me {1} : Il est impossible d'acheter une marchandise que l'on a pr�alablement vendu dans un m�me poste la m�me semaine.";
 public static final String EV_COMMANDANT_VENTE_MARCHANDISE_0000=
   "Le commandant {0} vient d'acheter {3} marchandise(s) de type {1} dans votre poste commercial du syst�me {2}. Vos gains: {4} centaures (taxes comprises).";
 public static final String EV_COMMANDANT_VENTE_MARCHANDISE_0001=
   "Vous venez d'acheter dans le poste commercial du syst�me {2} appartenant au commandant {0}, {3} marchandise(s) de type {1}. Co�t: {4} centaures (taxes comprises).";
 public static final String EV_COMMANDANT_VENTE_MARCHANDISE_0002=
   "Vous venez de charger � partir de votre poste commercial du syst�me {1} {2} marchandise(s) de type {0}.";

 public static final String ER_COMMANDANT_ACHAT_MARCHANDISE_0000=
   "Vous ne pouvez vendre {2} marchandise(s) de type {0} sur le syst�me {1} : la Banque Galactique bloque la transaction, les fonds du commandant acheteur �tant insuffisants.";
 public static final String EV_COMMANDANT_ACHAT_MARCHANDISE_0000=
   "Le commandant {0} vient de vendre {3} marchandise(s) de type {1} dans votre poste commercial du syst�me {2}. Vous devez d�bourser: {4} centaures (taxes comprises).";
 public static final String EV_COMMANDANT_ACHAT_MARCHANDISE_0001=
   "Vous venez de vendre {3} marchandise(s) de type {1} dans le poste commercial du syst�me {2} appartenant au commandant {0}. Vos gains: {4} centaures (taxes comprises).";
 public static final String EV_COMMANDANT_ACHAT_MARCHANDISE_0002=
   "Vous venez de d�charger dans votre poste commercial du syst�me {1} {2} marchandise(s) de type {0}.";

 public static final String ER_COMMANDANT_DIVISER_FLOTTE_0000=
   "Impossible de diviser la flotte num�ro {0} : elle n'existe pas.";
 public static final String EV_COMMANDANT_DIVISER_FLOTTE_0000=
   "Vous venez de diviser votre flotte {0}.";

 public static final String ER_COMMANDANT_FUSIONNER_FLOTTE_0000=
   "Impossible de fusionner la flotte num�ro {0} et la flotte num�ro {1} : la flotte num�ro {0} n'existe pas.";
 public static final String ER_COMMANDANT_FUSIONNER_FLOTTE_0001=
   "Impossible de fusionner la flotte num�ro {0} et la flotte num�ro {1} : elles ont le m�me num�ro!";
 public static final String ER_COMMANDANT_FUSIONNER_FLOTTE_0002=
   "Impossible de fusionner la flotte {0} et la flotte {1} : elles ne sont pas au m�me endroit!";
 public static final String EV_COMMANDANT_FUSIONNER_FLOTTE_0000=
   "Vous venez de fusionner votre flotte {0} et votre flotte {1}.";

 public static final String ER_COMMANDANT_PISTER_FLOTTE_0000=
   "Impossible de pister la flotte num�ro {1} du commandant {0} : cette flotte est hors d'atteinte.";
 public static final String EV_COMMANDANT_PISTER_FLOTTE_0000=
   "Votre flotte {0} vient de pister avec succ�s la flotte num�ro {2} du commandant {1}.";
 public static final String EV_COMMANDANT_PISTER_FLOTTE_0001=
   "Votre flotte {0} vient d'�chouer dans sa mission de pistage de la flotte num�ro {2} du commandant {1}.";

 public static final String EV_COMMANDANT_LANCER_MINES_0000=
   "Votre flotte {0} vient de lancer un total de {1} mines anti-mati�re sur la case o� elle se trouve.";

 public static final String ER_COMMANDANT_COLONISER_PLANETE_0000=
   "Impossible de coloniser la plan�te {2} du syst�me {0} avec la flotte {1}: cette plan�te ne vous appartient pas.";
 public static final String ER_COMMANDANT_COLONISER_PLANETE_0001=
   "Impossible de coloniser la plan�te {2} du syst�me {0} avec la flotte num�ro {1} : cette plan�te n'existe pas.";
 public static final String EV_COMMANDANT_COLONISER_PLANETE_0000=
   "Votre flotte {1} vient coloniser la plan�te {2} du syst�me {0} pour les {3} : le vaisseau colonisateur est d�truit.";
 public static final String EV_COMMANDANT_COLONISER_PLANETE_0001=
   "Votre flotte {1} n'a pu coloniser la plan�te {2} du syst�me {0} pour les {3} : la plan�te est inhabitable pour eux ou est d�j� colonis�e.";

 public static final String EV_COMMANDANT_AFFECTER_HEROS_0000=
   "Votre h�ros {0} vient d'�tre affect� sur votre flotte {1}.";

 public static final String EV_COMMANDANT_AFFECTER_GOUVERNEUR_0000=
   "Votre gouverneur {0} vient d'�tre affect� sur votre syst�me {1}.";

 public static final String EV_COMMANDANT_LICENCIER_LIEUTENANT_0000=
   "Vous venez de vous s�parer de votre lieutenant {0}, ce qui vous a rapport� la somme de {1} centaures.";

 public static final String ER_COMMANDANT_ACHETER_LIEUTENANT_0000=
   "Impossible d'acheter le lieutenant {0}, vous n'avez pas assez de centaures actuellement!";
 public static final String EV_COMMANDANT_ACHETER_LIEUTENANT_0000=
   "Vous venez d'acheter le lieutenant {0}, ce qui vous a cout� la somme de {1} centaures.";
 public static final String EV_COMMANDANT_ACHETER_LIEUTENANT_0001=
   "Vous n'avez pas pu acheter le lieutenant {0}, pour la somme de {1} centaures, car ce lieutenant demande plus de centaures.";

 public static final String ER_COMMANDANT_RENOMMER_LIEUTENANT_0000=
   "Impossible de donner le nom {1} au lieutenant {0} : vous poss�dez d�j� un lieutenant ayant ce nom.";

 public static final String ER_COMMANDANT_CHANGER_CAPITALE_0000=
   "Impossible de changer la capitale en {0} : vous n'avez pas assez de centaures actuellement.";
 public static final String EV_COMMANDANT_CHANGER_CAPITALE_0000=
   "Vous venez de d�placer votre capitale en {0}.";

 public static final String ER_COMMANDANT_DON_PLAN_0000=
   "Impossible de donner le plan du vaisseau {1} au commandant {0} : ce commandant poss�de d�j� ce plan!";
 public static final String ER_COMMANDANT_DON_PLAN_0001=
   "Impossible de donner le plan du vaisseau {1} au commandant {0} : vous n'avez pas assez de centaures actuellement!";
 public static final String EV_COMMANDANT_DON_PLAN_0000=
   "Vous venez de donner le plan du vaisseau {1} au commandant {0}.";
 public static final String EV_COMMANDANT_DON_PLAN_0001=
   "Le commandant {0} vient de vous transmettre le plan du vaisseau {1}.";
 public static final String EV_COMMANDANT_DON_PLAN_0002=
   "Le commandant qui souhaite rester anonyme vient de vous transmettre le plan du vaisseau {0}.";
 public static final String EV_COMMANDANT_DON_PLAN_0003=
   "Le commandant {0} vient de transmettre un plan de vaisseau au commandant {1}.";

 public static final String ER_COMMANDANT_CREER_PLAN_0000=
   "Impossible de cr�er le plan du vaisseau de nom {0} : Vous n'avez pas assez de centaures en ce moment!";
 public static final String EV_COMMANDANT_CREER_PLAN_0000=
   "Vous venez de cr�er le plan du vaisseau de nom {0}.";

 public static final String ER_COMMANDANT_CREER_STRATEGIE_0000=
   "Impossible de cr�er la strat�gie de nom {0} : Vous avez d�j� une strat�gie de ce nom!";
 public static final String EV_COMMANDANT_CREER_STRATEGIE_0000=
   "Vous venez de cr�er la strat�gie de combat de nom {0}.";

 public static final String ER_COMMANDANT_DON_STRATEGIE_0000=
   "Impossible de donner la strat�gie de combat {1} au commandant {0} : ce commandant poss�de d�j� une strat�gie de ce nom!";
 public static final String ER_COMMANDANT_DON_STRATEGIE_0001=
   "Impossible de donner la strat�gie de combat {1} au commandant {0} : vous n'avez pas assez de centaures actuellement!";
 public static final String EV_COMMANDANT_DON_STRATEGIE_0000=
   "Vous venez de donner la strat�gie de combat {1} au commandant {0}.";
 public static final String EV_COMMANDANT_DON_STRATEGIE_0001=
   "Le commandant {0} vient de vous transmettre la strat�gie de combat {1}.";
 public static final String EV_COMMANDANT_DON_STRATEGIE_0002=
   "Le commandant qui souhaite rester anonyme vient de vous transmettre la strat�gie de combat {0}.";
 public static final String EV_COMMANDANT_DON_STRATEGIE_0003=
   "Le commandant {0} vient de transmettre une strat�gie de combat au commandant {1}.";

 public static final String ER_COMMANDANT_RENOMMER_SYSTEME_0000=
   "Impossible de renommer le syst�me {0} : Il est n�cessaire que toutes les plan�tes de ce syst�me vous appartiennent.";
 public static final String EV_COMMANDANT_RENOMMER_SYSTEME_0000=
   "Vous venez de renommer votre syst�me {0}.";

 public static final String ER_COMMANDANT_RENOMMER_PLANETE_0000=
   "Impossible de renommer la plan�te num�ro {1} du syst�me {0} : cette plan�te n'existe pas.";
 public static final String ER_COMMANDANT_RENOMMER_PLANETE_0001=
   "Impossible de renommer la plan�te {1} du syst�me {0} : cette plan�te ne vous appartient pas.";
 public static final String EV_COMMANDANT_RENOMMER_PLANETE_0000=
   "Vous venez de renommer votre plan�te {1} du syst�me {0} : son nouveau nom est {2}.";

 public static final String ER_COMMANDANT_CONSTRUCTION_FLOTTE_0000=
   "Impossible de construire quelque chose avec votre flotte num�ro {0} : cette flotte n'existe pas.";
 public static final String EV_COMMANDANT_CONSTRUCTION_FLOTTE_0000=
   "Vous venez d'assigner � votre flotte num�ro {1} un programme de construction de vaisseaux de type {0}.";

 public static final String ER_COMMANDANT_RENOMMER_FLOTTE_0000=
   "Impossible de renommer votre flotte num�ro {0} : cette flotte n'existe pas.";
 public static final String EV_COMMANDANT_RENOMMER_FLOTTE_0000=
   "Vous venez de renommer votre flotte num�ro {1} avec pour nouveau nom {0}.";

 public static final String ER_COMMANDANT_UTILISER_PORTE_GALACTIQUE_0000=
   "Votre flotte num�ro {0} ne peut changer de galaxie : elle ne poss�de pas la capacit� intergalactique...";
 public static final String EV_COMMANDANT_UTILISER_PORTE_GALACTIQUE_0000=
   "Votre flotte num�ro {0} vient de changer de galaxie.";

 public static final String ER_COMMANDANT_UTILISER_PORTE_INTRAGALACTIQUE_0000=
   "Votre flotte num�ro {0} ne peut utiliser une porte intragalactique : vous ne poss�dez pas assez de centaures";
 public static final String EV_COMMANDANT_UTILISER_PORTE_INTRAGALACTIQUE_0000=
   "Votre flotte num�ro {0} vient d'utiliser une porte intragalactique.";


 public static final String EV_COMMANDANT_TAUX_POSTE_0000=
   "Vous venez de fixer le taux de taxation de vos postes commerciaux � {0}%.";

 public static final String EV_COMMANDANT_FIN_DE_TOUR_0000=
   "Vos services d'Intendance vous signalent {1} plan�te(s) en r�volte dans votre syst�me {0}.";

 public static final String EV_COMMANDANT_RECHERCHE_0000=
   "Vous venez de d�couvrir la technologie {0}.";

 public static final String EV_COMMANDANT_CONSTRUCTION_0000=
   "Votre syst�me {0} ne peut r�aliser ce tour-ci le projet de construction de {2} construction(s) de type {1} car vous n'avez pas assez de centaures.";
  public static final String EV_COMMANDANT_CONSTRUCTION_0001=
   "Votre syst�me {0} ne peut r�aliser ce tour-ci le projet de construction de {2} construction(s) de type {1} car il ne contient pas assez de minerai.";
 public static final String EV_COMMANDANT_CONSTRUCTION_0002=
   "Votre syst�me {0} ne peut r�aliser ce tour-ci le projet de construction de {3} construction(s) de type {1} car son poste commercial ne contient pas assez de marchandises de type {2}.";
 public static final String EV_COMMANDANT_CONSTRUCTION_0003=
   "Votre syst�me {0} vient de produire {2} construction(s) de type {1}.";
 public static final String EV_COMMANDANT_CONSTRUCTION_0004=
   "Votre flotte {0} ne peut produire des constructions de type {1} : son potentiel de construction n'est pas assez �lev�.";
 public static final String EV_COMMANDANT_CONSTRUCTION_0005=
   "Votre flotte {0} vient de produire {2} vaisseau(x) de type {1}. Ces vaisseaux sont maintenant dans cette flotte";
 public static final String EV_COMMANDANT_CONSTRUCTION_0006=
   "Votre flotte {0} ne peut produire des constructions de type {1} : vous n'avez pas assez de centaures en ce moment.";
 public static final String EV_COMMANDANT_CONSTRUCTION_0007=
   "Votre syst�me {0} ne peut r�aliser ce tour-ci le projet de construction de {2} construction(s) de type {1} car ce syst�me ne poss�de pas le chantier naval n�cessaire � la production de vaisseaux.";
 public static final String EV_COMMANDANT_CONSTRUCTION_0008=
   "Votre flotte {0} vient de produire {3} vaisseau(x) de type {1} et {4} vaisseau(x) de type {2}. Ces vaisseaux sont maintenant dans cette flotte";
 public static final String EV_COMMANDANT_CONSTRUCTION_0009=
   "Certains vaisseaux n'ont pas pu �tre construit par manque de centaures.";


 public static final String EV_COMMANDANT_GESTION_FLOTTE_0000=
   "Votre flotte {0} ne peut �tre r�par�e ce tour-ci car vous n'avez pas assez de centaures.";
 public static final String EV_COMMANDANT_GESTION_FLOTTE_0001=
   "Votre flotte {0} vient d'�tre r�par�e par votre syst�me {1} de {2} points de dommages.";
 public static final String EV_COMMANDANT_GESTION_FLOTTE_0002=
   "Votre flotte {0} vient d'�tre r�par�e par le syst�me {1} de votre alli� le commandant {2} de {3} points de dommages.";
 public static final String EV_COMMANDANT_GESTION_FLOTTE_0003=
   "Votre syst�me {1} vient de r�parer la flotte {0} de votre alli� le commandant {2} pour {3} points de dommages.";
 public static final String EV_COMMANDANT_GESTION_FLOTTE_0004=
   "Votre flotte {0} ne peut �tre r�par�e ce tour-ci car le commandant {1} n'a pas assez de centaures.";

 public static final String EV_DEBRIS_COLLISION_0000=
   "Votre flotte {0} vient de subir {1} point(s) de dommage suite � une collision avec des mines anti-mati�res.";
 public static final String EV_DEBRIS_COLLISION_0001=
   "Votre flotte {0} vient d'�tre d�truite suite aux dommages recus.";
 public static final String EV_DEBRIS_COLLISION_0002=
   "Votre flotte {0} vous signale la pr�sence de mines anti-mati�res sur la case o� elle se trouve. Heureusement, aucun dommage n'est � d�plorer.";
 public static final String EV_DEBRIS_COLLISION_0003=
   "Votre flotte {0} vient de d�sactiver {1} mine(s) anti-mati�re(s) sur la case o� elle se trouve.";
 public static final String EV_DEBRIS_COLLISION_0004=
   "Votre flotte {0} vient de r�cup�rer {1} tonne(s) de debris de vaisseaux d'une ancienne bataille sur la case o� elle se trouve. Cela diminue le danger de naviguer � cet endroit!";
 public static final String EV_DEBRIS_COLLISION_0005=
   "Votre flotte {0} vient de subir {1} point(s) de dommage suite � une collision avec des d�bris de vaisseaux d'une ancienne bataille.";
 public static final String EV_DEBRIS_COLLISION_0006=
   "Votre flotte {0} vous signale la pr�sence de d�bris de vaisseaux d'une ancienne bataille sur la case o� elle se trouve. Heureusement, aucun dommage n'est � d�plorer.";
 public static final String EV_DEBRIS_COLLISION_0007=
   "Evaluation du danger : {0} (A partir de 500, le niveau de risque commence � devenir important).";

 public static final String ER_PLAN_DE_VAISSEAU_0000=
   "Impossible de produire le plan du vaisseau de nom {0}, ce nom de vaisseau existe d�j�.";
 public static final String ER_PLAN_DE_VAISSEAU_0001=
   "Composant non-existant. Impossible de produire le plan de vaisseau {0} avec le composant de code {1}.";
 public static final String ER_PLAN_DE_VAISSEAU_0002=
   "Impossible de produire le plan de vaisseau {0}. Le plan de vaisseau comporte plus de 10 boucliers.";
 public static final String ER_PLAN_DE_VAISSEAU_0003=
   "Impossible de produire le plan de vaisseau {0}. Le plan de vaisseau comporte plus d'un module de construction.";

 public static final String ER_STRATEGIE_COMBAT_0000=
   "Impossible de sp�cifier le type de vaisseau {0} lors de la cr�ation de la strat�gie de combat. Les diff�rentes cibles ne sont pas correctement r�parties en ce qui concerne le vaisseau {0}.";

 public static final String ORDRE_adherer_alliance=
   "Adherer � l'alliance num�ro {0}.";
 public static final String ORDRE_valider_adhesion_alliance=
   "Valdier l'adhesion du commandant num�ro {0}.";
 public static final String ORDRE_nommer_dirigeant=
   "Voter pour nommer le dirigeant num�ro {1} � la t�te de l'alliance num�ro {0}.";
 public static final String ORDRE_exclure_alliance=
   "Exclure de l'alliance num�ro {0} le dirigeant num�ro {1}.";
 public static final String ORDRE_quitter_alliance=
   "Quitter l'alliance num�ro {0}.";
 public static final String ORDRE_signer_pacte=
   "Signer un pacte avec le commandant num�ro {0}.";
 public static final String ORDRE_rompre_pacte=
   "Rompre un pacte avec le commandant num�ro {0}.";
 public static final String ORDRE_affecter_heros=
   "Affecter le h�ros {0} sur la flotte num�ro {1}.";
 public static final String ORDRE_affecter_gouverneur=
   "Affecter le gouverneur {0} sur le syst�me {1}.";
 public static final String ORDRE_liberer_lieutenant=
   "Se s�parer du lieutenant {0}.";
 public static final String ORDRE_enroler_lieutenant=
   "Proposer {0} centaures au lieutenant {1}.";
 public static final String ORDRE_changer_capitale=
   "Changer ma capitale en {0}.";
 public static final String ORDRE_affecter_recherche=
   "Affecter {1}% des capacit�s de recherche � la technologie {0}.";
 public static final String ORDRE_abandonner_technologie=
   "Abandonner la technologie {0}.";
 public static final String ORDRE_services_speciaux=
   "Effectuer une mission sur le syst�me {0} de type {1} sur la plan�te {2}.";
 public static final String ORDRE_annuler_construction=
   "Annuler les constructions en cours sur le syst�me {0}.";
 public static final String ORDRE_construire=
   "Construire sur le syst�me {0} {2} {1} pour la plan�te {3}.";
 public static final String ORDRE_programmer_construction=
   "Programmer sur le syst�me {0} un programme de type {1}.";
 public static final String ORDRE_deprogrammer_construction=
   "Annuler le programme de construction sur le syst�me {0}.";
 public static final String ORDRE_modifier_politique=
   "Passer en politique {1} sur le syst�me {0}.";
 public static final String ORDRE_modifier_budget=
   "Faire passer le budget {1} sur le syst�me {0} � {2}%.";
 public static final String ORDRE_modifier_taxation_systeme=
   "Faire passer � {1} la taxation du syst�me {0}.";
 public static final String ORDRE_modifier_taxation_planete=
   "Faire passer � {1} la taxation du syst�me {0} de ma plan�te {2}.";
 public static final String ORDRE_terraformer_systeme=
   "Terraformer le syst�me {0}.";
 public static final String ORDRE_terraformer_planete=
   "Terraformer la plan�te {1} du syst�me {0}.";
 public static final String ORDRE_mettre_au_rebus=
   "D�truire {2} {1} sur le syst�me {0} � partir de la plan�te {3}.";
 public static final String ORDRE_creer_alliance=
   "Vous venez de cr�er l'alliance {0} qui sera de type {2}, secret {1} avec pour taxe d'entr�e {3} centaures.";
 public static final String ORDRE_renommer_alliance=
   "Renommer votre alliance comme {0}.";
 public static final String ORDRE_ecrire_adresse_alliance=
   "Adresse de votre alliance : {0}.";
 public static final String ORDRE_charger_cargo=
   "Charger le cargo {3} de la flotte {0} avec {2} {1} pour le poste {4} et la plan�te {5}.";
 public static final String ORDRE_decharger_cargo=
   "D�charger le cargo {3} de la flotte {0} avec {2} {1} pour le poste {4} et la plan�te {5}.";
 public static final String ORDRE_deplacer_flotte=
   "D�placer la flotte {0} vers la position {1}-{2}-{3} en directive {4} et strat�gie {5}.";
 public static final String ORDRE_pister=
   "Piste la flotte {1} avec ma flotte {0}.";
 public static final String ORDRE_utiliser_porte_galactique=
   "Passer dans la galaxie {1} avec ma flotte {0}.";
 public static final String ORDRE_utiliser_colonisateur=
   "Coloniser avec ma flotte {0}.";
 public static final String ORDRE_larguer_mines=
   "Lancer des mines avec ma flotte {0}.";
 public static final String ORDRE_construire_flotte=
   "Commencer un programme de construction {1} avec ma flotte {0}.";
 public static final String ORDRE_fusionner_flotte=
   "Fusionner ma flotte {0} et {1} en directive {2}.";
 public static final String ORDRE_diviser_flotte=
   "Diviser ma flotte {0}, nouveau nom {1}.";
 public static final String ORDRE_transferer_centaures=
   "Transf�rer {1} centaures pour le commandant {0} en mode {2}.";
 public static final String ORDRE_transferer_technologie=
   "Transf�rer la technologie {1} pour le commandant {0} en mode {2}.";
 public static final String ORDRE_transferer_systeme=
   "Transf�rer le syst�me {1} pour le commandant {0} en mode {2}.";
 public static final String ORDRE_transferer_planete=
   "Transf�rer la plan�te {2} du syst�me {1} pour le commandant {0} en mode {3}.";
 public static final String ORDRE_transferer_flotte=
   "Pr�ter la flotte {1} pour le commandant {0} et pour {2} tours.";
 public static final String ORDRE_vendre_flotte=
   "Vendre la flotte {1} pour le commandant {0}.";
 public static final String ORDRE_transferer_strategie=
   "Transf�rer la strat�gie {1} pour le commandant {0} en mode {2}.";
 public static final String ORDRE_fixer_taux_poste=
   "Fixer le taux de taxation de mes postes commerciaux � {0}%.";
 public static final String ORDRE_donner_plan=
   "Donner le plan {0} au commandant {1} en mode {2}.";
 public static final String ORDRE_creer_plan=
   "Cr�er le plan {0}, marque {1}, domaine {2}, royalties {3}%.";
 public static final String ORDRE_creer_strategie=
   "Cr�er la strat�gie {0}, agressivit� {1}, cible principale {2}.";
 public static final String ORDRE_renommer_systeme=
   "Renommer le syst�me {0}, nouveau nom {1}.";
 public static final String ORDRE_renommer_planete=
   "Renommer la plan�te {2} du syst�me {0}, nouveau nom {1}.";
 public static final String ORDRE_renommer_flotte=
   "Renommer la flotte {0}, nouveau nom {1}.";
 public static final String ORDRE_renommer_lieutenant=
   "Renommer mon lieutenant {0}, nouveau nom {1}.";
 public static final String ORDRE_ecrire_adresse_commandant=
   "Nouveau site du commandant {0}.";
 public static final String ORDRE_ecrire_article=
   "Ecrire article {0}.";

 }



