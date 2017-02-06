package opgaven;


/**
 *
 * @author Jeroen
 */
public class Opdracht41a {

    public static void main(String[] args) {
        
        int sum = 0;
        
        for ( int i = 2; i <= 100 ; i++ ) {
            if ( i % 2 == 0 ) 
                sum += i;
        }
        
        sum = 0;
        
        for ( int i = 2; i <= 100 ; i += 2 ) {
            // += is hetzelfde als sum = sum + i
            sum += i;
        }
        
        System.out.println("som: " + sum);
        
    }
    
}
