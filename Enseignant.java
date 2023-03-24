package GestionIUT;


/**
 * @author melyssa
 */

/**
 *classe Enseignant héritée de Personnel 
 */
public class Enseignant extends Personnel {
    private float volumeHoraire; // @param volumeHoraire d'un personnel
    private final float tarifHoraire=42; 
    private float paieEns; // @param paye des Enseignants 

    /**
     * redéfinition du constructeur de la classe Personne sans argument 
     * Initialisation de @param volumeHoraire et paieEns
     */
    Enseignant() {
        super();
        volumeHoraire=0;
        paieEns=volumeHoraire*tarifHoraire;

    }
    /**
     * redéfinition du constructeur de la classe Personne (avec les arguments nom et prenom) 
     * Initialisation de @param volumeHoraire et paieEns qui prend la valeur de volumeHoraire*tarifhoraire
     */
    Enseignant(String nom, String prenom) {
        super(nom, prenom);
        volumeHoraire=0;
        paieEns=volumeHoraire*tarifHoraire;

    }

    Enseignant(String nom, String prenom, float prime) {
        super(nom, prenom,prime);
        volumeHoraire=0;
        paieEns=volumeHoraire*tarifHoraire;

    }

    Enseignant(String nom, String prenom, float prime, int numBureau) {
        super(nom, prenom, prime, numBureau);
        volumeHoraire=0;
        paieEns=volumeHoraire*tarifHoraire;

    }

    Enseignant(String nom, String prenom, float prime, int numBureau, float volumeHoraire) {
        super(nom, prenom, prime, numBureau);
        this.volumeHoraire=volumeHoraire;
        paieEns=volumeHoraire*tarifHoraire;
    }

    /**
    * @return acceseur qui retourne la @parm volumHoraire
    **/
    public float getvolumeHoraire() { return volumeHoraire; }
    
    /**
    * @return acceseur qui retourne la @parm tarifHoraire
    **/
    public float getTarifHoraire() {return tarifHoraire;}
    
    /**
    * @return acceseur qui retourne la @parm paieEns
    **/
    public float getPaieEns() {return paieEns;}

    /**
     * mutateur qui modifie le @parm volumeHoraire
    **/
    public void setVolumeHoraire(float volumeHoraire) { this.volumeHoraire=volumeHoraire; }




}
