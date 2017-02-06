package opgaven;

/**
 *
 * @author Jeroen
 */
public class Kleiner5 {

    public static void main(String[] args) {
        int[] getal = {6, 4, 2, 10, 1};

        for (int i = 0; i < getal.length ; i++ )  {
            if (getal[i] < 5) {
                System.out.println(getal[i]);
            }
        }
        
        for ( int g : getal )  {
            if (g < 5) {
                System.out.println(g);
            }
        }

    }
}
