package GestionIUT;

public class MainTest {
    public static void main(String[] args) {

        //on crée le secretariat pour gérér les étudiants et les enseignants
        Secretariat s1 = new Secretariat();

        EtudiantBoursier etudiant1 = new EtudiantBoursier("Santana Delacruz", "Luca", 4, 1000);
        Etudiant etudiant2 = new Etudiant("Voyeur", "Pedro", 2);
        etudiant1.incrAbsencesInjustifiees(2);

        //on ajoute les etudiants dans la base de données du secretariat
        s1.ajouterEtudiant(etudiant1);
        s1.ajouterEtudiant(etudiant2);

        //nouvel enseignant titulaire
        //String nom, String prenom, float prime, int numBureau, float volumeHoraire, float volumeHoraireStatuaire
        EnseignantTitulaire enseignant1 = new EnseignantTitulaire("Merguez", "Antoine", 300, 1, 170, 30);
        EnseignantTitulaire enseignant2 = new EnseignantTitulaire("Boudineau", "Jenifer", 300, 1, 250, 80);
        enseignant1.setVolumeHoraireStatuaire(150);

        enseignant1.payerHeuresSupplementaires();
        enseignant2.payerHeuresSupplementaires();

        //on donne 10 absences injustifiées à l'enseignant 1
        enseignant1.incrAbsencesInjustifiees(10);

        //on ajoute les enseignants dans la base de données du secretariat
        s1.ajouterEnseignant(enseignant1);
        s1.ajouterEnseignant(enseignant2);


        //on affiche les enseignant et les etudiant du secretariat
        s1.afficherInfoEtudiants();
        s1.afficherInfoEnseignants();

        //on affiche les enseignants qui auront une retenue de salaire
        s1.afficherEnseignantsRetenue();

        //on affiche les étudiants qui n'auront pas leur année
        s1.afficherEtudiantsNonValides();

        //on affiche les enseignants qui n'ont pas de retenue de salaire
        s1.afficherEnseignantsSansRetenue();

        //on affiche les étudiants qui ont leur année (pour le moment)
        s1.afficherEtudiantsValides();

        //on supprime l'enseignant 1 et l'étudiant 2 du secretariat
        s1.supprimerEnseignant(enseignant1);
        s1.supprimerEtudiant2(0);

        //on affiche les infos des enseignants et des etudiant pour voir si l'enseignant 1 et l'etudiant 2 ont disparu
        s1.afficherInfoEnseignants();
        s1.afficherInfoEtudiants();



    }
}
