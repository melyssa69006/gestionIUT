package GestionIUT;

public class MainInteractif {
    /*
    *class MainInteractif qui permet l'interaction avec l'utilisateur 
    *1er switch : l'utilisateur tape le numéro de sa demande (par exemple, 1 pour ajouter un étudiant)
    */

    public static void main(String[] args) {
        int sousMenu=0;
        boolean arret = false;
        int nbMaxOccupants=3;
        Secretariat s1 = new Secretariat();
        while (!arret) {
            System.out.println("---Accueil---\n");
            System.out.println("1. Ajout étudiant \t 2. Supprimer étudiant \t 3. Modifications étudiant \t 4. Listes étudiant\n");
            System.out.println("5. Ajout enseignant\t 6. Supprimer enseignant 7. Modifications enseignant 8. Listes enseignant\n");
            System.out.println("9. Ajout administratif 10. Supprimer administratif 11. Modifications administratif 12. Listes administratif\n");
            System.out.println("\t\t\t\t\t\t\t\t\t\t13. Quitter \n");
            System.out.println("Veuillez saisir votre choix : ");
            sousMenu = Clavier.lireInt();
            switch(sousMenu) {
                case 1:
                    System.out.println("Ajout étudiant");
                    String nomAddEtu, prenomAddEtu;
                    boolean boursier;

                    System.out.print("Veuillez saisir le nom de l'etudiant : ");
                    nomAddEtu = Clavier.lireString();
                    System.out.print("\nVeuillez saisir le prenom de l'etudiant : ");
                    prenomAddEtu = Clavier.lireString();

                    System.out.print("\nL'etudiant est-il boursier ? (o/n)");

                    boursier = (Clavier.lireString().equals("o"));

                    if(boursier){
                        double montantBourse;
                        System.out.print("\nVeuillez saisir le montant de sa bourse : ");
                        montantBourse = Clavier.lireDouble();
                        s1.ajouterEtudiant(new EtudiantBoursier(nomAddEtu, prenomAddEtu, (int) montantBourse));
                    }
                    else{
                        s1.ajouterEtudiant(new Etudiant(nomAddEtu, prenomAddEtu));
                    }
                    break;
                case 2:
                    System.out.println("Supprimer étudiant");
                    int numEtu;
                    System.out.print("Veuillez saisir l'identifiant de l'etudiant : ");
                    numEtu = Clavier.lireInt();
                    s1.supprimerEtudiant2(numEtu);
                    break;
                case 3:
                    System.out.println("Modifications étudiant");
                    int numEtuModif,choixModif;
                    System.out.print("Veuillez saisir l'identifiant de l'etudiant que vous souhaitez modifier : ");
                    numEtuModif = Clavier.lireInt();
                    System.out.println("Que souhaitez-vous modifier ?\n");
                    System.out.println("1. Nom \t 2. Prenom \t 3. Absences injustifiées \t 4. Montant bourse\t 5. Justifier absence(s)\t 6. Annuler");
                    choixModif = Clavier.lireInt();
                    switch(choixModif){
                        case 1:
                            System.out.print("Veuillez saisir le nouveau nom de l'etudiant : ");
                            String newNomEtu = Clavier.lireString();
                            s1.trouverEtudiant(numEtuModif).setNom(newNomEtu);
                            System.out.println("Le nom de l'etudiant a bien été modifié");
                            break;
                        case 2:
                            System.out.print("Veuillez saisir le nouveau prenom de l'etudiant : ");
                            String newPrenomEtu = Clavier.lireString();
                            s1.trouverEtudiant(numEtuModif).setPrenom(newPrenomEtu);
                            System.out.println("Le prénom de l'etudiant a bien été modifié");
                            break;
                        case 3:
                            System.out.print("Veuillez saisir le nouveau nombre d'absences injustifiées de l'etudiant : ");
                            int newNbAbsEtu = Clavier.lireInt();
                            s1.trouverEtudiant(numEtuModif).setAbsencesInjustifiees(newNbAbsEtu);
                            System.out.println("Le nombre d'absences injustifiées de l'etudiant a bien été modifié");
                            break;
                        case 4:
                            System.out.print("Veuillez saisir le nouveau montant de la bourse de l'etudiant : ");
                            double newMontantBourseEtu = Clavier.lireDouble();
                            ((EtudiantBoursier)s1.trouverEtudiant(numEtuModif)).setMontantBourse(newMontantBourseEtu);
                            System.out.println("Le montant de la bourse de l'etudiant a bien été modifié");
                            break;
                        case 5:
                            System.out.print("Veuillez saisir le nombre d'absences injustifiées que vous souhaitez justifier : ");
                            int nbAbsJustif = Clavier.lireInt();
                            s1.trouverEtudiant(numEtuModif).justifierAbsences(nbAbsJustif);
                            System.out.println("Les absences injustifiées de l'etudiant ont bien été justifiées");
                            break;
                        case 6:
                            System.out.println("Annulation ...");
                            break;
                        default:
                            System.out.println("Choix invalide");
                            break;
                    }

                    break;

                case 4:
                    System.out.println("Listes étudiant");
                    s1.afficherInfoEtudiants();
                    s1.afficherEtudiantsValides();
                    s1.afficherEtudiantsNonValides();
                    break;
                case 5:
                    System.out.println("Ajout enseignant");
                    String nomAddEns, prenomAddEns;
                    int statutEns,numBureau;
                    System.out.print("Veuillez saisir le nom de l'enseignant : ");
                    nomAddEns = Clavier.lireString();
                    System.out.print("\nVeuillez saisir le prenom de l'enseignant : ");
                    prenomAddEns = Clavier.lireString();
                    System.out.print("\nVeuillez saisir le statut de l'enseignant (1 pour titulaire, 2 pour vacataire) : ");
                    statutEns = Clavier.lireInt();
                    if(statutEns == 1){
                        float volumeHoraireStatuaire;
                        System.out.print("\nVeuillez saisir le volume horaire statuaire de l'enseignant : ");
                        volumeHoraireStatuaire = Clavier.lireFloat();
                        s1.ajouterEnseignant(new EnseignantTitulaire(nomAddEns, prenomAddEns,volumeHoraireStatuaire));
                    }
                    if (statutEns == 2){
                        s1.ajouterEnseignant(new EnseignantVacataire(nomAddEns, prenomAddEns));
                    }
                    if(statutEns != 1 && statutEns != 2){
                        System.out.println("Statut invalide. Veuillez recommencer l'opération.");
                    }
                    break;
                case 6:
                    System.out.println("Supprimer enseignant");
                    int numEns;
                    System.out.print("Veuillez saisir l'identifiant de l'enseignant : ");
                    numEns = Clavier.lireInt();
                    s1.supprimerEnseignant2(numEns);
                    break;
                case 7:
                    System.out.println("Modifications enseignant");
                    int numEnsModif,choixModifEns;
                    System.out.print("Veuillez saisir l'identifiant de l'enseignant que vous souhaitez modifier : ");
                    numEnsModif = Clavier.lireInt();
                    System.out.println("Que souhaitez-vous modifier ?\n");
                    System.out.println("1. Nom \t 2. Prenom \t 3. Volume horaire \t 4. Absences Injustifiées \t 5. Justifier absence(s) \t 6. Assigner un bureau\t 7. Assigner une prime \t 8. Annuler");
                    choixModifEns = Clavier.lireInt();
                    switch(choixModifEns) {
                        case 1:
                            System.out.print("Veuillez saisir le nouveau nom de l'enseignant : ");
                            String newNomEns = Clavier.lireString();
                            s1.trouverEnseignant(numEnsModif).setNom(newNomEns);
                            System.out.println("Le nom de l'enseignant a bien été modifié");
                            break;
                        case 2:
                            System.out.print("Veuillez saisir le nouveau prenom de l'enseignant : ");
                            String newPrenomEns = Clavier.lireString();
                            s1.trouverEnseignant(numEnsModif).setPrenom(newPrenomEns);
                            System.out.println("Le prénom de l'enseignant a bien été modifié");
                            break;
                        case 3:
                            System.out.print("Veuillez saisir le nouveau volume horaire de l'enseignant : ");
                            float newVolumeHoraireEns = Clavier.lireFloat();
                            s1.trouverEnseignant(numEnsModif).setVolumeHoraire(newVolumeHoraireEns);
                            System.out.println("Le volume horaire de l'enseignant a bien été modifié");
                            break;
                        case 4:
                            System.out.print("Veuillez saisir le nouveau nombre d'absences injustifiées de l'enseignant : ");
                            int newNbAbsEns = Clavier.lireInt();
                            s1.trouverEnseignant(numEnsModif).setAbsencesInjustifiees(newNbAbsEns);
                            System.out.println("Le nombre d'absences injustifiées de l'enseignant a bien été modifié");
                            break;
                        case 5:
                            System.out.print("Veuillez saisir le nombre d'absences injustifiées que vous souhaitez justifier : ");
                            int nbAbsJustif = Clavier.lireInt();
                            s1.trouverEnseignant(numEnsModif).justifierAbsences(nbAbsJustif);
                            System.out.println("Les absences injustifiées de l'enseignant ont bien été justifiées");
                            break;
                        case 6:
                            System.out.print("Veuillez saisir le numéro de bureau que vous souhaitez assigner à l'enseignant : ");
                            int numBureauAssign = Clavier.lireInt();
                            s1.trouverEnseignant(numEnsModif).setNumBureau(numBureauAssign);
                            System.out.println("Le numéro de bureau de l'enseignant a bien été modifié");
                            break;
                        case 7:
                            System.out.print("Veuillez saisir le montant de la prime que vous souhaitez assigner à l'enseignant : ");
                            float montantPrimeAssign = Clavier.lireFloat();
                            s1.trouverEnseignant(numEnsModif).setPrime(montantPrimeAssign);
                            System.out.println("Le montant de la prime de l'enseignant a bien été modifié");
                            break;
                        case 8:
                            System.out.println("Annulation ...");
                            break;
                        default:
                            System.out.println("Choix invalide");
                            break;
                    }
                case 8:
                    System.out.println("Listes enseignant");
                    s1.afficherInfoEnseignants();
                    s1.afficherEnseignantsSansRetenue();
                    s1.afficherEnseignantsRetenue();
                    break;
                case 9:
                    System.out.println("Ajout administratif");
                    String nomAddAdmin, prenomAddAdmin;
                    float salaireAddAdmin;
                    System.out.print("Veuillez saisir le nom de l'administratif : ");
                    nomAddAdmin = Clavier.lireString();
                    System.out.print("Veuillez saisir le prénom de l'administratif : ");
                    prenomAddAdmin = Clavier.lireString();
                    System.out.print("Veuillez saisir le salaire de l'administratif : ");
                    salaireAddAdmin = Clavier.lireFloat();
                    s1.ajouterAdministratif(new Administratif(nomAddAdmin, prenomAddAdmin, salaireAddAdmin));
                    break;
                case 10:
                    System.out.println("Supprimer administratif");
                    int numAdmin;
                    System.out.print("Veuillez saisir l'identifiant de l'administratif : ");
                    numAdmin = Clavier.lireInt();
                    s1.supprimerAdministratif2(numAdmin);
                    break;
                case 11:
                    System.out.println("Modifications administratif");
                    int numAdminModif,choixModifAdmin;
                    System.out.print("Veuillez saisir l'identifiant de l'administratif que vous souhaitez modifier : ");
                    numAdminModif = Clavier.lireInt();
                    System.out.println("Que souhaitez-vous modifier ?\n");
                    System.out.println("1. Nom \t 2. Prenom \t 3. Absences Injustifiées \t 4. Justifier absence(s) \t 5. Assigner un bureau\t 6. Assigner une prime \t 7. Annuler");
                    choixModifAdmin = Clavier.lireInt();
                    switch(choixModifAdmin) {
                        case 1:
                            System.out.print("Veuillez saisir le nouveau nom de l'administratif : ");
                            String newNomAdmin = Clavier.lireString();
                            s1.trouverAdministratif(numAdminModif).setNom(newNomAdmin);
                            System.out.println("Le nom de l'administratif a bien été modifié");
                            break;
                        case 2:
                            System.out.print("Veuillez saisir le nouveau prenom de l'administratif : ");
                            String newPrenomAdmin = Clavier.lireString();
                            s1.trouverAdministratif(numAdminModif).setPrenom(newPrenomAdmin);
                            System.out.println("Le prénom de l'administratif a bien été modifié");
                            break;
                        case 3:
                            System.out.print("Veuillez saisir le nouveau nombre d'absences injustifiées de l'administratif : ");
                            int newNbAbsAdmin = Clavier.lireInt();
                            s1.trouverAdministratif(numAdminModif).setAbsencesInjustifiees(newNbAbsAdmin);
                            System.out.println("Le nombre d'absences injustifiées de l'administratif a bien été modifié");
                            break;
                        case 4:
                            System.out.print("Veuillez saisir le nombre d'absences injustifiées que vous souhaitez justifier : ");
                            int nbAbsJustif = Clavier.lireInt();
                            s1.trouverAdministratif(numAdminModif).justifierAbsences(nbAbsJustif);
                            System.out.println("Les absences injustifiées de l'administratif ont bien été justifiées");
                            break;
                        case 5:
                            System.out.print("Veuillez saisir le numéro de bureau que vous souhaitez assigner à l'administratif : ");
                            int numBureauAssign = Clavier.lireInt();
                            s1.trouverAdministratif(numAdminModif).setNumBureau(numBureauAssign);
                            System.out.println("Le numéro de bureau de l'administratif a bien été modifié");
                            break;
                        case 6:
                            System.out.print("Veuillez saisir le montant de la prime que vous souhaitez assigner à l'administratif : ");
                            float montantPrimeAssign = Clavier.lireFloat();
                            s1.trouverAdministratif(numAdminModif).setPrime(montantPrimeAssign);
                        case 7:
                            System.out.println("Annulation ...");
                            break;
                        default:
                            System.out.println("Choix invalide");
                            break;
                    }
                case 12:
                    System.out.println("Listes administratif");
                    s1.afficherInfoAdministratifs();
                    s1.afficherAdministratifsSansRetenue();
                    s1.afficherAdministratifsRetenue();
                    break;
                case 13:
                    System.out.println("Sortie en cours ...");
                    arret = true;
                    break;
                default:
                    System.out.println("Choix invalide, veuillez recommencer.");
                    break;
            }
        }
    }

}


