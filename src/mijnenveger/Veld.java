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
        System.out.println(aantalBommen(veld, 0, 0));
    }
    
    // maak onderstaande functie
    // een 2D array met voor elke (rij, kolom) het aantal
    // bommen in naastgelegen velden
    public static int[][] bomaantallen(boolean[][] veld) {
        return null;
    }
    
    public static void printAantallen(int[][] aantallen) {
        
    }
    
    public static int aantalBommen(boolean[][] veld, int rij, int kolom) {
        int aantal = 0;
        for (int i = rij -1; i <= rij + 1; i++){
            for (int j = kolom -1; j <= kolom + 1; j++){
                if(i >= 0 && i <= 4 && j >= 0 && j <= 4 && !(i == rij && j == kolom)){
                    if (veld[i][j])
                    {
                        aantal++;
                    }
                }
            }
        }
        return aantal;
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
