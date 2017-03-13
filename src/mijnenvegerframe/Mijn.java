package mijnenvegerframe;


/**
 *
 * @author Jeroen
 */
public class Mijn extends Vak {

    // roep gameOver aan van veld
    public boolean open() {
        System.out.println("Boem!");
        return false;
    }
    
    public String toString() {
        return "*";
    }
    
}
