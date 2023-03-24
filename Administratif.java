package GestionIUT;

public class Administratif extends Personnel {
    private float salaire;
    
    /*
    *constructeur sans arguments, salaire à 0 par defaut
    */
    Administratif(){
        super();
        salaire=0;
    }
    
    /*
    *constructeur avec pour argument nom et prenom (redefinition de nom et prenom),
    *salaire=0 par defaut
    */
    Administratif(String nom, String prenom){
        super(nom, prenom);
        salaire=0;
    }

    
    /*constructeur avec pour argument nom et prenom, prime et salaire (redefinition),
    salaire prend pour valeur celle qu'on lui donne
    */
    Administratif(String nom, String prenom, float prime, float salaire){
        super(nom, prenom, prime);
        this.salaire=salaire;
    }
    
    Administratif (String nom, String prenom, float salaire){
        super(nom,prenom);
        this.salaire=salaire;
  
    
}

    /*constructeur avec pour argument nom et prenom, prime, salaire et numBureau (redefinition),
    salaire prend pour valeur celle qu'on lui donne
    */
    Administratif(String nom, String prenom, float salaire, float prime, int numBureau){
        super(nom,prenom, prime, numBureau);
        this.salaire=salaire;
    }
    
    /**
    * accesseur qui retourne la variable @param salaire
    **/
    public float getSalaire() {return salaire;}
    
    /**
    * mutateur modifie @param salaire
    **/
    public void setSalaire(float salaire) {this.salaire=salaire;}
    
}

