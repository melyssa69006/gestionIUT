package GestionIUT;
public class Secretariat {
    
    /**
    * creation de 3 tableaux Enseignant, Etudiant et Administratif
    */
    private Enseignant[] enseignantsActuels = new Enseignant[0];
    private Etudiant[] etudiantsActuels = new Etudiant[0];
    private Administratif[] administratifsActuels = new Administratif[0];

    
    /**
    * ajouterEnseignant() permet d'ajouter un Enseignant à la liste
    */
    public void ajouterEnseignant(Enseignant e) {
        Enseignant[] tmp = new Enseignant[enseignantsActuels.length + 1];
        for (int i = 0; i < enseignantsActuels.length; i++) {
            tmp[i] = enseignantsActuels[i];
        }
        tmp[enseignantsActuels.length] = e;
        enseignantsActuels = tmp;
        System.out.println("Enseignant ajouté dans la BDD!\n");
    }
    
    /**
    * ajouterEtudiant() permet d'ajouter un Etudiant à la liste
    */
    public void ajouterEtudiant(Etudiant e) {
        Etudiant[] tmp = new Etudiant[etudiantsActuels.length + 1];
        for (int i = 0; i < etudiantsActuels.length; i++) {
            tmp[i] = etudiantsActuels[i];
        }
        tmp[etudiantsActuels.length] = e;
        etudiantsActuels = tmp;
        System.out.println("Etudiant ajouté dans la BDD!\n");
    }
    
     /**
    * ajouterAdministratif() permet d'ajouter un agent administratif à la liste
    */
    public void ajouterAdministratif(Administratif a) {
        Administratif[] tmp = new Administratif[administratifsActuels.length + 1];
        for (int i = 0; i < administratifsActuels.length; i++) {
            tmp[i] = administratifsActuels[i];
        }
        tmp[administratifsActuels.length] = a;
        administratifsActuels = tmp;
        System.out.println("Administratif ajouté dans la BDD!\n");
    }

    /**
    * trouverEnseignant() permet de rechercher un enseignant grâce à son numEns
    */
    public Enseignant trouverEnseignant(int numEns) {
        for (int i = 0; i < enseignantsActuels.length; i++) {
            if (enseignantsActuels[i].getNumPersonnel() == numEns) {
                return enseignantsActuels[i];
            }
        }
        return null;
    }

    /**
    * supprimerEnseignant() permet d'ajouter un Enseignant à la liste
    */
    public void supprimerEnseignant(Enseignant e) {
        Enseignant[] tmp = new Enseignant[enseignantsActuels.length - 1];
        int j = 0;
        for (int i = 0; i < enseignantsActuels.length; i++) {
            if (enseignantsActuels[i] != e) {
                tmp[j] = enseignantsActuels[i];
                j++;
            }
        }
        enseignantsActuels = tmp;
        System.out.println("Enseignant supprimé !");
    }
    /**
     * supprimerEnseignant2() permet de supprimer un enseignant grâce à son numEnseignant
     */
    public void supprimerEnseignant2(int numEnseignant) {
        if (enseignantsActuels.length == 0) {
            System.out.println("Aucun enseignant dans la BDD !");
        } else {
            for (int i = 0; i < enseignantsActuels.length; i++) {
                if (enseignantsActuels[i].getNumPersonnel() == (numEnseignant)) {
                    supprimerEnseignant(enseignantsActuels[i]);
                }
            }
        }
    }
    
    /**
     * trouverEtudiant() permet de trouver un étudiant grâce à son numero etudiant numEtu
     */
    public Etudiant trouverEtudiant(int numEtu) {
        for (int i = 0; i < etudiantsActuels.length; i++) {
            if (etudiantsActuels[i].getNumEtudiant() == numEtu) {
                return etudiantsActuels[i];
            }
        }
        return null;
    }
    
    /*
    *supprimereEtudiant() permet de supprimer un etudiant 
    */
    public void supprimerEtudiant(Etudiant e) {
        Etudiant[] tmp = new Etudiant[etudiantsActuels.length - 1];
        int j = 0;
        for (int i = 0; i < etudiantsActuels.length; i++) {
            if (etudiantsActuels[i] != e) {
                tmp[j] = etudiantsActuels[i];
                j++;
            }
        }
        etudiantsActuels = tmp;
        System.out.println("Etudiant supprimé !");
    }

    /*
    *supprimereEtudiant2() permet de supprimer un etudiant grâce à son numEtudiant 
    */
    public void supprimerEtudiant2(int numEtudiant) {
        if (etudiantsActuels.length == 0) {
            System.out.println("Aucun étudiant dans la BDD !");
        } else {
            for (int i = 0; i < etudiantsActuels.length; i++) {
                if (etudiantsActuels[i].getNumEtudiant() == (numEtudiant)) {
                    supprimerEtudiant(etudiantsActuels[i]);
                }
            }
        }
    }

    /*
    *trouverAdministratif() permet de trouver un agent administratif grâce au numAdmin 
    */
    public Administratif trouverAdministratif(int numAdmin) {
        for (int i = 0; i < administratifsActuels.length; i++) {
            if (administratifsActuels[i].getNumPersonnel() == numAdmin) {
                return administratifsActuels[i];
            }
        }
        return null;
    }

    /*
    *supprimerAdministratif() permet de supprimer un agent administratif a 
    */
    public void supprimerAdministratif(Administratif a) {
        Administratif[] tmp = new Administratif[administratifsActuels.length - 1];
        int j = 0;
        for (int i = 0; i < administratifsActuels.length; i++) {
            if (administratifsActuels[i] != a) {
                tmp[j] = administratifsActuels[i];
                j++;
            }
        }
        administratifsActuels = tmp;
        System.out.println("Administratif supprimé !");
    }
    
    /*
    *supprimerAdministratif() permet de supprimer un agent administratif grâce à son numAdministratif 
    */
    public void supprimerAdministratif2(int numAdministratif) {
        if (administratifsActuels.length == 0) {
            System.out.println("Aucun administratif dans la BDD !");
        } else {
            for (int i = 0; i < administratifsActuels.length; i++) {
                if (administratifsActuels[i].getNumPersonnel() == (numAdministratif)) {
                    supprimerAdministratif(administratifsActuels[i]);
                }
            }
        }
    }
    
    /*
    *afficheEnseignantRetenus() permet d'afficher le nom, prenom
    *et le nombre d'absences injustifiees des enseignants ayant une retenue de salaire
    */
    public void afficherEnseignantsRetenue() {
        System.out.println("----------Enseignants avec une retenue de salaire----------\n");
        for (int i = 0; i < enseignantsActuels.length; i++) {
            if (enseignantsActuels[i].retenueSalaire()) {
                System.out.println(enseignantsActuels[i].getNom() + " " + enseignantsActuels[i].getPrenom() + "\tabsences non justifiées : " + enseignantsActuels[i].getNbAbsencesInjustifiees() + "\n");
            }
        }
    }

    /*
    *afficherEtudiantsNonValides() permet d'afficher les étudiants n'ayant pas valider l'annee.
    *Affiche le nom, le prenom et le nombre d'absences injustifiees
    */
    public void afficherEtudiantsNonValides() {
        System.out.println("----------Etudiants ne validant pas leur année----------\n");
        for (int i = 0; i < etudiantsActuels.length; i++) {
            if (!etudiantsActuels[i].valideAnnee()) {
                System.out.println(etudiantsActuels[i].getNom() + " " + etudiantsActuels[i].getPrenom() + "\tabsences non justifiées : " + etudiantsActuels[i].getNbAbsencesInjustifiees() + "\n");
            }
        }
    }
    
    /*
    *afficherAdministratifsRetenue() permet d'afficher les agents administratifs ayant une retenue de salaire.
    *Affiche le nom, le prenom et le nombre d'absences injustifiees
    */
    public void afficherAdministratifsRetenue() {
        System.out.println("----------Administratifs avec une retenue de salaire----------\n");
        for (int i = 0; i < administratifsActuels.length; i++) {
            if (administratifsActuels[i].retenueSalaire()) {
                System.out.println(administratifsActuels[i].getNom() + " " + administratifsActuels[i].getPrenom() + "\tabsences non justifiées : " + administratifsActuels[i].getNbAbsencesInjustifiees() + "\n");
            }
        }
    }
    
    /*
    *afficherEnseignantsSansRetenue() permet d'afficher les enseignants n'ayant pas de retenue de salaire.
    *Affiche le nom, le prenom et le nombre d'absences injustifiees
    */
    public void afficherEnseignantsSansRetenue() {
        System.out.println("----------Enseignants sans retenue de salaire----------\n");
        for (int i = 0; i < enseignantsActuels.length; i++) {
            if (!enseignantsActuels[i].retenueSalaire()) {
                System.out.println(enseignantsActuels[i].getNom() + " " + enseignantsActuels[i].getPrenom() + "\tabsences non justifiées : " + enseignantsActuels[i].getNbAbsencesInjustifiees() + "\n");
            }
        }
    }

        /*
    *afficherEtudiantsValides() permet d'afficher les étudiants ayant validé l'annee.
    *Affiche le nom, le prenom et le nombre d'absences injustifiees
    */
    public void afficherEtudiantsValides() {
        System.out.println("----------Etudiants validant leur année (pour l'instant)----------\n");
        for (int i = 0; i < etudiantsActuels.length; i++) {
            if (etudiantsActuels[i].valideAnnee()) {
                System.out.println(etudiantsActuels[i].getNom() + " " + etudiantsActuels[i].getPrenom() + "\tabsences non justifiées : " + etudiantsActuels[i].getNbAbsencesInjustifiees() + "\n");
            }
        }
    }

    /*
    *afficherAdministratifsSansRetenue() permet d'afficher les agents administratifs n'ayant pas de retenue de salaire.
    *Affiche le nom, le prenom et le nombre d'absences injustifiees
    */
    public void afficherAdministratifsSansRetenue() {
        System.out.println("----------Administratifs sans retenue de salaire----------\n");
        for (int i = 0; i < administratifsActuels.length; i++) {
            if (!administratifsActuels[i].retenueSalaire()) {
                System.out.println(administratifsActuels[i].getNom() + " " + administratifsActuels[i].getPrenom() + "\tabsences non justifiées : " + administratifsActuels[i].getNbAbsencesInjustifiees() + "\n");
            }
        }
    }


    //afficher les informations de tous les enseignants
    public void afficherInfoEnseignants() {
        System.out.println("----------Informations sur tout les enseignants----------\n");
        for (int i = 0; i < enseignantsActuels.length; i++) {
            System.out.println("------Enseignant n°" + (i + 1) + "------");
            System.out.println("Nom : " + enseignantsActuels[i].getNom());
            System.out.println("Prenom : " + enseignantsActuels[i].getPrenom());
            System.out.println("Absences non justifiées : " + enseignantsActuels[i].getNbAbsencesInjustifiees());
            System.out.println("Num bureau : " + enseignantsActuels[i].getNumBureau());
            System.out.println("Num personnel : " + enseignantsActuels[i].getNumPersonnel());
            System.out.println("Prime : " + enseignantsActuels[i].getPrime() + "€");
            System.out.println("Nb heures travailées : " + enseignantsActuels[i].getvolumeHoraire() + "h");
            System.out.println("Paie par rapport aux heures deja travailées : " + enseignantsActuels[i].getPaieEns() + "€");
            //si l'enseignant est titulaire on affiche le nombre d'heures supp et paye supplémentaire
            if (enseignantsActuels[i] instanceof EnseignantTitulaire) {
                System.out.println("Cet enseignant est titulaire.");
                System.out.println("Nombre d'heures supplémentaires : " + ((EnseignantTitulaire) enseignantsActuels[i]).getVolumeHoraireStatuaire() + "h");
                System.out.println("Paie supplémentaire : " + ((EnseignantTitulaire) enseignantsActuels[i]).getSalaireSup() + "€");
                float salaireTotal = enseignantsActuels[i].getPaieEns() + ((EnseignantTitulaire) enseignantsActuels[i]).getSalaireSup();
                System.out.println("Salaire total : " + salaireTotal + "€\n");

            } else if (enseignantsActuels[i] instanceof EnseignantVacataire) {
                System.out.println("Cet enseignant est vacataire.");
            }
        }
    }

    //afficher les informations de tous les étudiants
    public void afficherInfoEtudiants() {
        System.out.println("----------Informations sur tout les etudiants----------\n");
        for (int i = 0; i < etudiantsActuels.length; i++) {
            System.out.println("------Etudiant n°" + (i + 1) + "------");
            System.out.println("Nom : " + etudiantsActuels[i].getNom());
            System.out.println("Prenom : " + etudiantsActuels[i].getPrenom());
            System.out.println("Absences non justifiées : " + etudiantsActuels[i].getNbAbsencesInjustifiees());
            System.out.println("Num étudiant : " + etudiantsActuels[i].getNumEtudiant());
            //si l'étudiant est boursier, on affiche le montant de la bourse
            if (etudiantsActuels[i] instanceof EtudiantBoursier) {
                if (((EtudiantBoursier) etudiantsActuels[i]).getMontantBourse() > 0)
                    System.out.println("L'étudiant est boursier, il reçoit une bourse de " + ((EtudiantBoursier) etudiantsActuels[i]).getMontantBourse() + "€.\n");
                else
                    System.out.println("L'étudiant est boursier mais il n'est pas assidu, il doit " + Math.abs(((EtudiantBoursier) etudiantsActuels[i]).getMontantBourse()) + "€ au Crous.\n");
            }
        }
    }

    //affiche les informations de tous les agents administratifs
    public void afficherInfoAdministratifs() {
        System.out.println("----------Informations sur tout les administratifs----------\n");
        for (int i = 0; i < administratifsActuels.length; i++) {
            System.out.println("------Administratif n°" + (i + 1) + "------");
            System.out.println("Nom : " + administratifsActuels[i].getNom());
            System.out.println("Prenom : " + administratifsActuels[i].getPrenom());
            System.out.println("Absences non justifiées : " + administratifsActuels[i].getNbAbsencesInjustifiees());
            System.out.println("Num bureau : " + administratifsActuels[i].getNumBureau());
            System.out.println("Num personnel : " + administratifsActuels[i].getNumPersonnel());
            System.out.println("Salaire : " + administratifsActuels[i].getSalaire() + "€");
            System.out.println("Prime : " + administratifsActuels[i].getPrime() + "€");
        }


    }
}