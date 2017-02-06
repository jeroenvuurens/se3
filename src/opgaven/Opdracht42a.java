package opgaven;

import java.util.Scanner;

/**
 *
 * @author Jeroen
 */
public class Opdracht42a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //System.out.println(scanner.nextInt() + 10);
        
        int laagst = Integer.MAX_VALUE;
        for (int i = 0; i < 5 ; i++ ) {
            int getal = scanner.nextInt();
            if ( getal < laagst ) {
                laagst = getal;
            } 
        }
        System.out.println("laagst " + laagst);
    }
}
