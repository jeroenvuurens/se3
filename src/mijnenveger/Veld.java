package mijnenveger;

import java.util.Random;


/**
 *
 * @author Jeroen
 */
public class Veld {

    public static void main(String[] args) {
        boolean[][] veld = new boolean[5][5];
        int aantalbommen = 4;
        Random random = new Random();
        
        int rij = random.nextInt(5);
        int kolom = random.nextInt(5);
        veld[rij][kolom] = true;
        printVeld(veld);
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
