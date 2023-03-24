package GestionIUT ;

/*
 * @author melyssa
 */

public class Personne {    //class Personne (classe mère d'étudiants et personnel)
    String nom; //prénom et nom de la personne
    private String prenom; //prénom et nom de la personne
    private int absencesInjustifiees; //nombre d'absences injustifiées de la personne
    //constructeur
    Personne() { 
        nom="null"; //initialisation du @param nom par defaut null
        prenom="null"; //initialisation du @prenom par defaut null
        absencesInjustifiees=0; // @param absencesInjustifiees initialisés à 0 par defaut à 0
    }
    /**
    * constructeur avec @param nom et prenom en argument + initialisation  de @param absencesInjustifiees à 0
    **/
    Personne(String nom, String prenom) { 
        this.nom = nom;
        this.prenom = prenom;
        absencesInjustifiees = 0;
    }
    //constructeur (surdefinition) qui prend en compte le nom, le prénom et les absences injustifiées
    Personne (String nom, String prenom, int absencesInjustifiees) { 
        this.nom= nom; //initialisation du @param nom
        this.prenom= prenom; //initialisation du @prenom
        this.absencesInjustifiees=absencesInjustifiees; // @param absencesInjustifiees initialisés à 0
    }
    /**
    * accesseur @return le @param nom
    **/
    public String getNom() {
        return nom;
    }
    /**
    * accesseur @return le @param prenom
    **/
    public String getPrenom() {
        return prenom;
    }
    /**
    * accesseur @return le @param prenom
    **/
    public int getNbAbsencesInjustifiees() {
        return absencesInjustifiees;
    }
    /**
    * mutateur modifie @param nom 
    **/
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
    * mutateur modifie @param prenom
    **/
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    /**
    * mutateur modifie @param absencesInjustifiees
    **/
    public void setAbsencesInjustifiees(int nbabsences) {
        this.absencesInjustifiees = nbabsences;
    }
    /**
    * méthode qui permet d'obtenir le nomre d'absences injustifiees en lui soustrayant le nombre d'absences justifiees
    **/
    public void justifierAbsences(int nbabsences) {
        absencesInjustifiees-=nbabsences;
    }
    /**
    * méthode pour ajouter des absences injustifiees. 
    * le nombre d'absence en paramètre représente le nombre d'absences à ajouter
    **/
    public void incrAbsencesInjustifiees(int nbabsences) {this.absencesInjustifiees+=nbabsences;}
    /**
    * méthode toString qui retourne les @param nom, prenom et absencesInjustifiees
    **/
    @Override
    public String toString(){
        return "nom:"+ nom+"prenom:"+prenom+"absencesInjustifiees"+absencesInjustifiees;}
    
}




