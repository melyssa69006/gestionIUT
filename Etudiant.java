package GestionIUT;

/*
 * @author melyssa
 */

/*
*classe Etudiant qui hérite de Personne
*/
public class Etudiant extends Personne {
    private final int numEtudiant;
    private static int cpt=0;
    
    /*
    *redéfinition du constructeur de Personne sans arguments avec initialisation de @param numEtudiant
    */
    Etudiant() {
        super();
        numEtudiant=cpt++;
    }
    /*
    *redéfinition du constructeur de Personne avec les arguments nom et
    *prenom avec intitialisation de numEtudiant (cpt -> cle primaire)
    */
    Etudiant (String nom, String prenom) {
        super(nom,prenom);
        numEtudiant=cpt++;
    }
    /*
    *redéfinition du constructeur de Personne avec les arguments nom, prenom et absencesInjustifiees avec intitialisation de numEtudiant (cpt -> cle primaire)
    */
    Etudiant (String nom, String prenom, int absencesInjustifiees) {
        super(nom,prenom,absencesInjustifiees);
        numEtudiant=cpt++;
    }
    /**
    * accesseur @return le @param numEtudiant
    **/
    public int getNumEtudiant() {
        return numEtudiant;
    }
    /**
    * valideAnnee () permet de vérifier si un étudiant valise son année 
    * (avec @param absencesInjustifiees) 
    **/
    public boolean valideAnnee() {
        if(getNbAbsencesInjustifiees()>=5) {
            return false;
        }
        else {
            return true;
        }
    }
    /**
    * méthode toString() @return le nom, le prenom et le numéro étudiant de l'étudiant
    * ( redéfinition de la toString() de la classe Personne
    **/
    @Override
    public String toString(){
        return super.toString()+ "numEtudiant:"+numEtudiant;}
    
}
