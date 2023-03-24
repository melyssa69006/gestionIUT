package GestionIUT;


/*
*EnseignantVacataire est une classe qui hérite de la classe Enseignant 
 */
public class EnseignantVacataire extends Enseignant {

    /*
        *Constructeur (redefinition) sans argument  
        *volumeHoraire égal à 0 par défaut
     */
    EnseignantVacataire() {
        super();
        setVolumeHoraire(0);
    }

    /*
        *Constructeur (redefinition) qui prend en argument nom et prenom 
        *volumeHoraire égal à 0 par défaut
     */
    EnseignantVacataire(String nom, String prenom) {
        super(nom, prenom);
        setVolumeHoraire(0);
    }

    /*
        *Constructeur (redefinition) qui prend en argument nom, prenom et la prime 
        *volumeHoraire égal à 0 par défaut
     */
    EnseignantVacataire(String nom, String prenom, float prime) {
        super(nom, prenom, prime);
        setVolumeHoraire(0);
    }

    /*
        *Constructeur (redefinition) qui prend en argument nom, prenom, prime et numBureau  
        *volumeHoraire égal à 0 par défaut
     */
    EnseignantVacataire(String nom, String prenom, float prime, int numBureau) {
        super(nom, prenom, prime, numBureau);
        setVolumeHoraire(0);
    }

    /*
        *Constructeur (redefinition) qui prend en argument nom, prenom, prime, numBureau et volumeHoraire 
        *volumeHoraire égal à la valeur par défaut
     */
    EnseignantVacataire(String nom, String prenom, float prime, int numBureau, float volumeHoraire) {
        super(nom, prenom, prime, numBureau);
        setVolumeHoraire(volumeHoraire);
    }
}
