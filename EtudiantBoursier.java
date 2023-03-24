package GestionIUT;

public class EtudiantBoursier extends Etudiant { // classe EtudiantBoursier hérite de la classe Etudiant
    private double montantBourse; // @param montant de la bourse de l'étudiant boursier
    
    @Override
    public String toString(){
        return super.toString()+ "mongtant de la bourse:"+ montantBourse;
    }

    EtudiantBoursier() { // redéfinition du constructeur Etudiant qui ne prend pas d'arguments
        super();
        montantBourse=0; // @param initialisation du montant de la bourse montantBourse à 0
    }
    EtudiantBoursier(String nom, String prenom) { // redéfinition du constructeur qui prend en compte les attibuts noms et prénoms 
        super(nom,prenom); // appel du constructeur de la classe Etudiant 
    }
    EtudiantBoursier(String nom, String prenom, int absencesInjustifiees,double montantBourse) { // redéfinition du constructeur qui prend en compte les attibuts noms, prénom et montant de la bourse  
        super(nom, prenom,absencesInjustifiees); // appel du constructeur de la classe Etudiant
        this.montantBourse = montantBourse; // initialisation du montant de la bourse @montantBourse
    }
    
    /**
    * constructeur (redefinition) qui prend en argument nom,prenom,absencesInjustifiees et monyanBourse
    * montantBourse prend par defaut la valeur donnee
    **/
    EtudiantBoursier(String nom, String prenom, int absencesInjustifiees){
        super(nom,prenom,absencesInjustifiees);
        this.montantBourse=montantBourse;
        
    }
    /**
    * accesseur qui retourne la variable @param montanBourse
    **/
    public double getMontantBourse() {
        return montantBourse;
    }
    
    /**
    * mutateur qui permet la modification du montant de la bourse @montantBourse
    **/
    public void setMontantBourse(double montantBourse) { 
        this.montantBourse = montantBourse;
    }
    public void rembourserCrous(){ // méthode rembourserCrous. Si l'année n'est pas validé, alors il doit rembourser le Crous 
        if (!valideAnnee()) {
            montantBourse=-montantBourse;
            
        }
    }
}
