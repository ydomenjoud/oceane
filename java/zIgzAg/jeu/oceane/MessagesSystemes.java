// v2.02 24/02/01
// Copyright 2001 Julien Buret All Rights Reserved.
// Use is subject to license terms.



package zIgzAg.jeu.oceane;
/*
 * @author  Julien Buret
 * @version 2.02, 24/02/01
 */

public class MessagesSystemes extends MessagesAbstraits{

 public static final String ER_FLOTTE_0000=
  "Erreur lors de la cr�ation d'une flotte de d�part : valeur trop �lev�.";

 public static final String ER_ORDRE_0000=
  "Entier n�gatif lors de r�ception ordre, m�thode {0}, entier {1}.";
 public static final String ER_ORDRE_0001=
  "String non transformable en entier lors de r�ception ordre, m�thode {0}, string {1}.";
  public static final String ER_ORDRE_0002=
  "Nombre d'ordres trop grand, m�thode {0}.";
 public static final String ER_POSITION_0000=
  "String non transformable en position : {0}.";

 public static final String ER_COMMANDANT_ALLIANCE_0000=
  "Impossible de voter pour �lire un dirigeant de l'alliance num�ro {0}. Non-appartenance � l'alliance.";
 public static final String ER_COMMANDANT_ALLIANCE_0001=
  "Impossible de voter pour �lire un dirigeant de l'alliance num�ro {0}. Alliance de type non conforme.";
 public static final String ER_COMMANDANT_ALLIANCE_0002=
  "Impossible d'adh�rer � l'alliance num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_ALLIANCE_0003=
  "Impossible de voter pour �lire le commandant num�ro {0} � la t�te d'une alliance. Commandant non-existant.";
 public static final String ER_COMMANDANT_ALLIANCE_0004=
  "Impossible de voter pour �lire le commandant num�ro {0} � la t�te de l'alliance num�ro {1}. Ce commandant n'est pas adh�rent de cette alliance.";
 public static final String ER_COMMANDANT_ALLIANCE_0005=
  "Impossible d'exclure un commandant de l'alliance num�ro {0}. Non-appartenance � l'alliance.";
 public static final String ER_COMMANDANT_ALLIANCE_0006=
  "Impossible de quitter l'alliance num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_ALLIANCE_0008=
  "Impossible d'exclure le commandant num�ro {0} d'une alliance. Commandant non-existant.";
 public static final String ER_COMMANDANT_ALLIANCE_0009=
  "Impossible d'exclure le commandant num�ro {0} de l'alliance num�ro {1}. Ce commandant n'est pas adh�rent de cette alliance.";
 public static final String ER_COMMANDANT_ALLIANCE_0010=
  "Impossible d'exclure un commandant de l'alliance num�ro {0}. Alliance de type non conforme.";
 public static final String ER_COMMANDANT_ALLIANCE_0011=
  "Impossible de cr�er une alliance : technologie n�cessaire non connue.";
 public static final String ER_COMMANDANT_ALLIANCE_0012=
  "Impossible de renommer l'alliance {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_ALLIANCE_0013=
  "Impossible de changer le site de l'alliance {0} : elle n'existe pas.";


 public static final String ER_COMMANDANT_PACTE_0000=
   "Pacte non-existant. Impossible de rompre le pacte de non-agression avec le commandant num�ro {0}.";
 public static final String ER_COMMANDANT_PACTE_0001=
   "Pacte d�j� existant. Impossible de passer un pacte de non-agression avec le commandant num�ro {0}.";

 public static final String ER_COMMANDANT_DON_CENTAURES_0000=
   "Impossible de donner des centaures au commandant num�ro {0} : il n'existe pas.";

 public static final String ER_COMMANDANT_DON_TECHNOLOGIE_0000=
   "Impossible de donner la technologie {0} au commandant num�ro {1} : ce dernier n'existe pas.";
 public static final String ER_COMMANDANT_DON_TECHNOLOGIE_0001=
   "Impossible de donner la technologie {0} au commandant num�ro {1} : la technologie n'est pas connue du donneur.";

 public static final String ER_COMMANDANT_ELIMINER_TECHNOLOGIE_0000=
   "Impossible d'�liminer la technologie {0} : elle n'est pas connue du commandant.";

 public static final String ER_COMMANDANT_DON_FLOTTE_0000=
   "Impossible de donner la flotte num�ro {0} au commandant num�ro {1} : ce dernier n'existe pas.";
 public static final String ER_COMMANDANT_DON_FLOTTE_0001=
   "Impossible de donner la flotte num�ro {0} au commandant num�ro {1} : vous n'avez pas de flottes de ce num�ro.";
 public static final String ER_COMMANDANT_DON_FLOTTE_0002=
   "Impossible de donner la flotte num�ro {0} au commandant num�ro {1} : le commandant n'est pas jou� par un humain.";


 public static final String ER_COMMANDANT_VENTE_FLOTTE_0000=
   "Impossible de vendre la flotte num�ro {0} au commandant num�ro {1} : ce dernier n'existe pas.";
 public static final String ER_COMMANDANT_VENTE_FLOTTE_0001=
   "Impossible de vendre la flotte num�ro {0} au commandant num�ro {1} : vous n'avez pas de flottes de ce num�ro.";
 public static final String ER_COMMANDANT_VENTE_FLOTTE_0002=
   "Impossible de vendre la flotte num�ro {0} au commandant num�ro {1} : le commandant n'est pas jou� par un humain.";


 public static final String ER_COMMANDANT_DON_SYSTEME_0000=
   "Impossible de donner un syst�me au commandant num�ro {0} : ce dernier n'existe pas.";
 public static final String ER_COMMANDANT_DON_SYSTEME_0001=
   "Impossible de donner le syst�me {0} : il n'existe pas.";

 public static final String ER_COMMANDANT_DON_PLANETE_0000=
   "Impossible de donner une plan�te au commandant num�ro {0} : ce dernier n'existe pas.";
 public static final String ER_COMMANDANT_DON_PLANETE_0001=
   "Impossible de donner une plan�te du syst�me {0} : le syst�me n'existe pas.";

 public static final String ER_COMMANDANT_ANNULER_CONSTRUCTION_0000=
  "Impossible d'annuler les constructions sur le syst�me {0} : le commandant ne le poss�de pas.";

 public static final String ER_COMMANDANT_MISE_EN_CHANTIER_0000=
   "Impossible de mettre en chantier une construction sur le syst�me {0} : le commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_MISE_EN_CHANTIER_0001=
   "Impossible de mettre en chantier la construction {0} : le commandant ne peut pas le faire.";
 public static final String ER_COMMANDANT_MISE_EN_CHANTIER_0002=
   "Impossible de mettre en chantier une construction  sur le syst�me {0} : votre gouverneur qui le dirige y verrait une atteinte � ses pr�rogatives.";

 public static final String ER_COMMANDANT_PROGRAMMER_CONSTRUCTION_0000=
   "Impossible de programmer une construction sur le syst�me {0} : le commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_PROGRAMMER_CONSTRUCTION_0001=
   "Impossible de programmer la construction {0} : le commandant ne peut la construire.";
 public static final String ER_COMMANDANT_PROGRAMMER_CONSTRUCTION_0002=
   "Impossible de programmer la construction {0} : la technologie n�cessaire n'est pas connue.";

 public static final String ER_COMMANDANT_ANNULER_PROGRAMME_CONSTRUCTION_0000=
   "Impossible d'annuler un programme de construction sur le syst�me {0} : le commandant ne le poss�de pas.";

 public static final String ER_COMMANDANT_MODIFIER_POLITIQUE_0000=
   "Impossible de modifier la politique du syst�me {0} : le commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_MODIFIER_POLITIQUE_0001=
   "Impossible de modifier la politique du syst�me {0} : la politique demand�e n'existe pas.";

 public static final String ER_COMMANDANT_MODIFIER_BUDGET_0000=
   "Impossible de modifier le budget du syst�me {0} : le commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_MODIFIER_BUDGET_0001=
   "Impossible de modifier la budget du syst�me {0} : le domaine de budget demand� n'existe pas.";

 public static final String ER_COMMANDANT_MODIFIER_TAXATION_0000=
   "Impossible de modifier la taxation du syst�me {0} : le commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_MODIFIER_TAXATION_0001=
   "Impossible de modifier la taxation du syst�me {0} : elle est trop �lev�e.";
 public static final String ER_COMMANDANT_MODIFIER_TAXATION_0002=
   "Impossible de modifier la taxation d'une plan�te du syst�me {0} : le commandant ne poss�de pas ce syst�me.";
 public static final String ER_COMMANDANT_MODIFIER_TAXATION_0003=
   "Impossible de modifier la taxation d'une plan�te du syst�me {0} : la taxation est trop �lev�e.";
 public static final String ER_COMMANDANT_MODIFIER_TAXATION_0004=
   "Impossible de modifier la taxation d'une plan�te d'un syst�me : technologie n�cessaire non connue.";

 public static final String ER_COMMANDANT_TERRAFORMER_0000=
   "Impossible de terraformer le syst�me {0} : le commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_TERRAFORMER_0001=
   "Impossible de terraformer une plan�te du syst�me {0} : le commandant ne poss�de pas ce syst�me.";
 public static final String ER_COMMANDANT_TERRAFORMER_0002=
   "Impossible de terraformer une plan�te : technologie n�cessaire non connue.";

 public static final String ER_COMMANDANT_DETRUIRE_BATIMENT_0000=
   "Impossible de d�truire des b�timents sur le syst�me {0} : le commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_DETRUIRE_BATIMENT_0001=
   "Impossible de d�truire des b�timents de code {1} sur le syst�me {0} : ce type de b�timent n'existe pas.";
 public static final String ER_COMMANDANT_DETRUIRE_BATIMENT_0002=
   "Impossible de d�truire des b�timents : technologie n�cessaire non connue.";

 public static final String ER_COMMANDANT_AFFECTER_RECHERCHE_0000=
   "Impossible de chercher la technologie {0} : le commandant ne peut chercher cette technologie.";

 public static final String ER_COMMANDANT_MISSION_SPECIALE_0000=
   "Impossible pour les services secrets d'effectuer une mission sp�ciale d'un type qui n'existe pas.";

 public static final String ER_COMMANDANT_DEPLACER_FLOTTE_0000=
   "Erreur dans le d�placement d'une flotte. Directive non-existante : {0}-{1}.";
 public static final String ER_COMMANDANT_DEPLACER_FLOTTE_0001=
   "Impossible de d�placer la flotte num�ro {0} : elle n'existe pas.";

 public static final String ER_COMMANDANT_CHARGER_CARGO_0000=
   "Impossible de charger un cargo de la flotte num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_CHARGER_CARGO_0001=
   "Impossible de charger un cargo � partir d'une plan�te appartenant au joueur num�ro {0} : ce dernier n'existe pas.";
 public static final String ER_COMMANDANT_CHARGER_CARGO_0002=
   "Impossible de charger un cargo � partir d'un syst�me sur la case {0} : il n'y a pas de syst�me ici.";
 public static final String ER_COMMANDANT_CHARGER_CARGO_0004=
   "Impossible de charger un cargo avec quelque chose de code {0} : ce code n'existe pas.";

 public static final String ER_COMMANDANT_DECHARGER_CARGO_0000=
   "Impossible de d�charger un cargo de la flotte num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0001=
   "Impossible de d�charger un cargo sur une plan�te appartenant au joueur num�ro {0} : ce dernier n'existe pas.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0002=
   "Impossible de d�charger un cargo sur un syst�me de la case {0} : il n'y a pas de syst�me ici.";
 public static final String ER_COMMANDANT_DECHARGER_CARGO_0004=
   "Impossible de d�charger un cargo de quelque chose de code {0} : ce code n'existe pas.";

 public static final String ER_COMMANDANT_FUSIONNER_FLOTTE_0000=
   "Erreur dans la fusion d'une flotte. Directive non-existante : {0}-{1}.";

 public static final String ER_COMMANDANT_DIVISER_FLOTTE_0000=
   "Impossible de diviser une flotte : le vaisseau {0} n'existe pas, ou le nombre {1} est n�gatif.";

 public static final String ER_COMMANDANT_PISTER_FLOTTE_0000=
   "Impossible de pister une flotte avec la flotte num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_PISTER_FLOTTE_0001=
   "Impossible de pister une flotte du commandant num�ro {0} : celui-ci n'existe pas.";

 public static final String ER_COMMANDANT_LANCER_MINES_0000=
   "Impossible de lancer des mines avec la flotte num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_LANCER_MINES_0001=
   "Impossible de lancer des mines avec la flotte num�ro {0} : elle ne poss�de pas de vaisseaux lanceurs de mines.";

 public static final String ER_COMMANDANT_COLONISER_PLANETE_0000=
   "Impossible de coloniser une plan�te avec la flotte num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_COLONISER_PLANETE_0001=
   "Impossible de coloniser une plan�te avec la flotte num�ro {0} : cette flotte ne survole pas de syst�me.";
 public static final String ER_COMMANDANT_COLONISER_PLANETE_0002=
   "Impossible de coloniser la plan�te {2} du syst�me {0} avec la flotte num�ro {1} : cette plan�te n'existe pas.";
 public static final String ER_COMMANDANT_COLONISER_PLANETE_0003=
   "Impossible de coloniser une plan�te avec la flotte num�ro {0} : cette flotte ne contient pas de colonisateur.";

 public static final String ER_COMMANDANT_AFFECTER_HEROS_0000=
   "Impossible d'affecter un h�ros sur la flotte num�ro {0} : elle n'existe pas.";
 public static final String ER_COMMANDANT_AFFECTER_HEROS_0001=
   "Impossible d'affecter le h�ros {0} sur une flotte : il n'appartient pas au commandant.";

 public static final String ER_COMMANDANT_AFFECTER_GOUVERNEUR_0000=
   "Impossible d'affecter un gouverneur sur le syst�me {0} : il n'appartient pas au commandant.";
 public static final String ER_COMMANDANT_AFFECTER_GOUVERNEUR_0001=
   "Impossible d'affecter le gouverneur {0} sur un syst�me : ce gouverneur n'appartient pas au commandant.";

 public static final String ER_COMMANDANT_LICENCIER_LIEUTENANT_0000=
   "Impossible de licencier le lieutenant {0} : il n'appartient pas au commandant.";

 public static final String ER_COMMANDANT_RENOMMER_LIEUTENANT_0000=
   "Impossible de renommer le lieutenant {0} : il n'appartient pas au commandant.";
 public static final String ER_COMMANDANT_RENOMMER_LIEUTENANT_0001=
   "Impossible de renommer le lieutenant {0} : il a d�j� �t� nomm�.";

 public static final String ER_COMMANDANT_CHANGER_CAPITALE_0000=
   "Impossible de changer la capitale en {0} : ce syst�me n'appartient pas au commandant.";

 public static final String ER_COMMANDANT_DON_PLAN_0000=
   "Impossible de donner le plan {0} : ce commandant ne le poss�de pas.";
 public static final String ER_COMMANDANT_DON_PLAN_0001=
   "Impossible de donner un plan au commandant {0} : ce commandant n'existe pas.";

 public static final String ER_COMMANDANT_CREER_PLAN_0000=
   "Impossible de creer un plan : le montant des royalties, {0}%, n'est pas dans les bornes admissibles.";

 public static final String ER_COMMANDANT_CONSTRUCTION_FLOTTE_0000=
   "Impossible de construire des vaisseaux {0} avec une flotte : le commandant ne poss�de pas ce plan.";
 public static final String ER_COMMANDANT_CONSTRUCTION_FLOTTE_0001=
   "Impossible de construire quelque chose avec la flotte {0} : cette flotte ne poss�de pas la capacit� n�cessaire.";

 public static final String ER_PLAN_DE_VAISSEAU_0001=
   "Composant non-existant. Impossible de produire le plan de vaisseau {0} avec le composant de code {1}.";

 public static final String ER_COMMANDANT_DON_STRATEGIE_0000=
   "Impossible de donner la strat�gie {0} : ce commandant ne la poss�de pas.";
 public static final String ER_COMMANDANT_DON_STRATEGIE_0001=
   "Impossible de donner une strat�gie au commandant {0} : ce commandant n'existe pas.";

 public static final String ER_COMMANDANT_UTILISER_PORTE_GALACTIQUE_0000=
   "Impossible de changer de galaxie : flotte non-existante {0}.";
 public static final String ER_COMMANDANT_UTILISER_PORTE_GALACTIQUE_0001=
   "Impossible de changer de galaxie : galaxie non-existante {0}.";

 public static final String ER_COMMANDANT_UTILISER_PORTE_INTRAGALACTIQUE_0000=
   "Impossible d'utiliser une porte intragalactique : flotte {0} non-existante.";
 public static final String ER_COMMANDANT_UTILISER_PORTE_INTRAGALACTIQUE_0001=
   "Impossible d'utiliser une porte intragalactique : flotte {0} non pr�sente sur une porte.";

 public static final String ER_COMMANDANT_TAUX_POSTE_0000=
   "Impossible fixer les taux des postes : taux trop �lev� : {0}.";

 public static final String ER_STRATEGIE_COMBAT_0000=
   "Impossible de cr�er une strat�gie. Taux d'agressivit� non dans les bornes admises : {0}.";
 public static final String ER_STRATEGIE_COMBAT_0001=
   "Impossible de cr�er une strat�gie.  Cible principale non dans les bornes admises : {0}.";
 public static final String ER_STRATEGIE_COMBAT_0002=
   "Impossible de sp�cifier un vaisseau lors d'une cr�ation de strat�gie.  Vaisseau non connu par le commandant : {0}.";
 public static final String ER_STRATEGIE_COMBAT_0003=
   "Impossible de sp�cifier un vaisseau lors d'une cr�ation de strat�gie.  Pour le vaisseau {0}, position non dans les bornes admises : {1}-{2}.";



 }



