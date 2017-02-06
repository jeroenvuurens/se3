package opgaven;


/**
 *
 * @author Jeroen
 */
public class Medailles {

    public static void main(String[] args) {
        int COUNTRIES = 4;
        int MEDALS = 3;
        int[][] count = {
            {1,0,1},
            {1,1,0},
            {0,0,1},
            {1,6,0}
        };
        
        int aantal = 0;
        for (int j = 0; j < MEDALS; j++) {
            aantal += count[3][j];
        }
        System.out.println(aantal);
        
        
    }
}
