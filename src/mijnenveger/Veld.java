package mijnenveger;

import java.util.Random;


/**
 *
 * @author Jeroen
 */
public class Veld {

    private int aantalRijen;
    private int aantalMijnen;
    private Vak[][] veld;
 
    public Veld(int aantalRijen, int aantalMijnen) {
        this.aantalRijen = aantalRijen;
        this.aantalMijnen = aantalMijnen;
 
        maakVeld();
    }
 
    public void toonVeld() {
        for (int rij = 0; rij < veld.length; rij++) {
            printRijMijnen(veld[rij]);
        }
    }
 
    private void printRijMijnen(Vak[] rij) {
        for (Vak vak : rij) {
            System.out.print(vak);
        }
        System.out.println();
    }
  
    private void maakVeld() {
        veld = new Vak[aantalRijen][aantalRijen];
        for (int rij = 0; rij < aantalRijen; rij++)
            for (int kolom = 0; kolom < aantalRijen; kolom++)
                veld[rij][kolom] = new Vak();
        legMijnen();
    }

    
    private void legMijnen() {
        Random random = new Random(0);
        while (aantalMijnen > 0) {
            int rij = random.nextInt(aantalRijen);
            int kolom = random.nextInt(aantalRijen);
            if (! (veld[rij][kolom] instanceof Mijn) ) {
                veld[rij][kolom] = new Mijn();
                aantalMijnen--;
            }
        }
    }
 
    public static void main(String[] args) {
        Veld veld = new Veld(10, 5);
        veld.veld[0][9].open();
        System.out.println(veld.veld[0][9].getClass());
        veld.toonVeld();
 
    } 
    
}
