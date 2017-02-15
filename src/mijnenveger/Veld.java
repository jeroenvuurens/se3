package mijnenveger;

import java.util.Random;


/**
 *
 * @author Jeroen
 */
public class Veld {

    private int aantalRijen;
    private int aantalMijnen;
    private boolean[][] veld;
 
    public Veld(int aantalRijen, int aantalMijnen) {
        this.aantalRijen = aantalRijen;
        this.aantalMijnen = aantalMijnen;
 
        veld = new boolean[aantalRijen][aantalRijen];
 
    }
 
    public void toonVeld() {
        for (int rij = 0; rij < veld.length; rij++) {
            printRijMijnen(veld[rij]);
        }
    }
 
    public static void printRijMijnen(boolean[] rij) {
        for (boolean bom : rij) {
            System.out.print(bom ? '*' : '-');
        }
        System.out.println();
    }
 
    public static void main(String[] args) {
        Veld veld = new Veld(10, 5);
        veld.toonVeld();
 
    } 
    
}
