package opgaven;


/**
 *
 * @author Jeroen
 */
public class Sterren {

    public static void main(String[] args) {
        printSterren(8);
        printSterren(2);
        
        int[] sterren = { 4, 5, 9, 2 };
        for (int s : sterren ) {
            printSterren(s);
        }
        
    }
    
    public static void printSterren(int sterren) {
        for (int i = 0; i < sterren ; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
