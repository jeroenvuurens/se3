package mijnenveger;

import java.util.Random;


/**
 *
 * @author Jeroen
 */
public class Veld {

    public static void main(String[] args) {
        boolean[][] veld = new boolean[5][5];
        Random random = new Random();
        //random.setSeed(0);
        
        int aantalbommen = 4;
        while (aantalbommen > 0) {
            int rij = random.nextInt(5);
            int kolom = random.nextInt(5);
            if ( !veld[rij][kolom] ) {
                veld[rij][kolom] = true;
                aantalbommen--;
            }
        }
        
        printVeld(veld);
    }
    
    // maak onderstaande functie
    public static int aantalBommen(int[][] veld, int rij, int kolom) {
        return 0;
    }
    
    public static void printVeld(boolean[][] veld) {
        for (int rij = 0; rij < veld.length; rij++) {
            printRij(veld[rij]);
        }
    }
    
    public static void printRij(boolean[] rij) {
        for (boolean bom : rij) {
            System.out.print(bom?'*':'-');
        }
        System.out.println();
    }
    
}
