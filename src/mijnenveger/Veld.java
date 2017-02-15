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
 
        legMijnen();
    }
 
    public void toonVeld() {
        for (int rij = 0; rij < veld.length; rij++) {
            printRijMijnen(veld[rij]);
        }
    }
 
    private void printRijMijnen(boolean[] rij) {
        for (boolean bom : rij) {
            System.out.print(bom ? '*' : '-');
        }
        System.out.println();
    }
    
    private void legMijnen() {
        veld = new boolean[aantalRijen][aantalRijen];
        Random random = new Random();
        while (aantalMijnen > 0) {
            int rij = random.nextInt(aantalRijen);
            int kolom = random.nextInt(aantalRijen);
            if (!veld[rij][kolom]) {
                veld[rij][kolom] = true;
                aantalMijnen--;
            }
        }
    }
 
    public static void main(String[] args) {
        Veld veld = new Veld(10, 5);
        veld.toonVeld();
 
    } 
    
}
