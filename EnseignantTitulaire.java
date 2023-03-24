package GestionIUT;

/**
 * Classe EnseignantTitulaire héritée de Enseignant
 */
public class EnseignantTitulaire extends Enseignant {
    private float volumeHoraireStatuaire; 
    private float salaireSup=0;
    
    /**
     * redefinition du constructeur de Enseignant (sans arguments) + 
     * initialisation du volumeHoraireStatuaire à 0 par defaut 
     */
    public EnseignantTitulaire() {
        super();
        volumeHoraireStatuaire=0;
    }

    /**
     * redefinition du constructeur de Enseignant(avec les arguments nom et prenom)
     * + initialisation du volumeHoraireStatuaire à 0 par defaut 
     */
    public EnseignantTitulaire(String nom, String prenom) {
        super(nom, prenom);
        volumeHoraireStatuaire=0;
    }
    
    public EnseignantTitulaire (String nom, String prenom, float volumeHoraireStatuaire){
        super(nom,prenom);
        this.volumeHoraireStatuaire=volumeHoraireStatuaire;
    }

    /**
     * redefinition du constructeur de Enseignant+ initialisation du volumeHoraireStatuaire à 0 par defaut 
     */
    public EnseignantTitulaire(String nom, String prenom, float salaire, float prime) {
        super(nom, prenom, prime);
        volumeHoraireStatuaire=0;
    }

    /**
     * redefinition du constructeur de Enseignant (arguments: nom, prenom, salire, prime et numBureau)
     * volumeHoraireStatuaire à 0 par défaut
     */
    public EnseignantTitulaire(String nom, String prenom, float salaire, float prime, int numBureau) {
        super(nom, prenom, prime, numBureau);
        volumeHoraireStatuaire=0;
    }

    /**
     * redefinition du constructeur de Enseignant (arguments: nom, prenom, salire, prime, 
     * numBureau et volumeHoraireStatuaire)
     * volumeHoraireStatuaire doit être compris entre 64 et 384 sinon message d'erreur, 
     * sinon volumeHoraireStatuaire prend la valeur donnée 
     */
    public EnseignantTitulaire(String nom, String prenom, float prime, int numBureau, float volumeHoraire, float volumeHoraireStatuaire) {
        super(nom, prenom, prime, numBureau, volumeHoraire);
        if (volumeHoraireStatuaire<64 || volumeHoraireStatuaire>384) {
            System.out.println("Le volume horaire statuaire doit être compris entre 64 et 384 heures.");
            this.volumeHoraireStatuaire=0;
        }
        else {
            this.volumeHoraireStatuaire=volumeHoraireStatuaire;
        }
    }

    /**
    * accesseur @return le @param volumeHoraireStaturaire
    **/
    public float getVolumeHoraireStatuaire() { return volumeHoraireStatuaire; }
    
    /**
    * accesseur @return le @param salaireSup
    **/
    public float getSalaireSup() { return salaireSup;}
    
    /**
    * mutateur modifie @param le volumeHoraireStatuaire
    **/
    public void setVolumeHoraireStatuaire (float volumeHoraireStatuaire) {
        this.volumeHoraireStatuaire=volumeHoraireStatuaire;
    }

    /**
    * payerHeuresSupplementaires donne le montant des heures sup
    **/
    public void payerHeuresSupplementaires() {
        if (getvolumeHoraire()>=192 && getvolumeHoraire()>volumeHoraireStatuaire) {
            salaireSup+=volumeHoraireStatuaire*getTarifHoraire();
        }
    }

}

