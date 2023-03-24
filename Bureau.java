package GestionIUT;

public class Bureau {
    private final int numBureau; //@param numBureau: le numéro du bureau
    private int nbOccupants; //@param nbOccupants: le nombre de personne qui occupents un bureau
    private Personnel[] occupants; //@param occupants d'un bureau
    static public int cpt=0; //@param compteur, on veut des numéros de bureaux différents
    
    Bureau() { 
        numBureau=cpt++;
        nbOccupants=0;
        occupants=new Personnel[3];
    }
    public void ajouterOccupant(Personnel p) { // cette méthode permet de gérer le nombre de personne dans un bureau (3personnes au max)
        if(nbOccupants+1>3) {
            System.out.println("Le bureau est plein, veuillez en choisir un autre.");
        }
        else {
            occupants[nbOccupants++]=p;
        }
    }
}
