package GestionIUT;
/**
* classe Personnel héritée de Personne 
*/
public class Personnel extends Personne {
    private float prime; // prime des enseignants et des administratifs
    private int numBureau; //-1 si aucun bureau assigné
    private final int numPersonnel; // numéro personnel
    private static int cpt=0;
    
    /**
     * redefinition du constructeur sans arguments de Personne. Initialisation de @param nnumPersonnel
     */
    Personnel() {
        super();
        numPersonnel=cpt++;
    }
    
    /**
     * redefinition du constructeur (avec les arguments nom et prenom) de Personne. Initialisation de @param numPersonnel
     */
    Personnel(String nom, String prenom) {
        super(nom,prenom);
        numPersonnel=cpt++;
    }
    
    /**
     * redefinition du constructeur
     * (avec les arguments nom, prenom) de Personne. Initialisation 
     * des @param salaire, prime et numPersonnel
     */
    Personnel(String nom, String prenom,float prime) {
        super(nom,prenom);
        this.prime=prime;
        numBureau=-1;
        numPersonnel=cpt++;
    }
    
    /**
     * redefinition du constructeur
     * (avec les arguments nom, prenom) de Personne. Initialisation 
     * des @param salaire, primen ,numBureau
     */
    Personnel(String nom, String prenom, float prime, int numBureau) {
        super(nom,prenom);
        this.prime=prime;
        this.numBureau=numBureau;
        numPersonnel=cpt++;
    }
    
    /**
    * @return acceseur qui retourne la @parm prime
     **/
    public float getPrime() {return prime;}
    

    /**
    * @return acceseur qui retourne la @parm numBureau
    **/
    public int getNumBureau() {return numBureau;}

    /**
    * @return acceseur qui retourne la @parm numPersonnel
    **/
    public int getNumPersonnel() {return numPersonnel;}
    

    /**
     * mutateur qui modifie le @parm prime
    **/
    public void setPrime(float prime) {this.prime=prime;}
    

    /**
     * mutateur qui modifie le @parm numBureau
    **/
    public void setNumBureau(int numBureau) {this.numBureau=numBureau;}
    

    /**
     * retenueSalaire permet de savoir si on doit effectuer un retunue sur salaire 
     * si nommbre d'absences injustifiees est superieur à 5 absences 
    **/
    public boolean retenueSalaire() {
        if(getNbAbsencesInjustifiees()>5) {
            return true;
        }
        else {
            return false;
        }
        
    /**
     * méthode toString() @return le nom, le prenom, le numPersonnel, numBureau et la prime
    ( redéfinition de la toString() de la classe Personne
     */
    
    }
}


