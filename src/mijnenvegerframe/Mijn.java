package mijnenvegerframe;


/**
 *
 * @author Jeroen
 */
public class Mijn extends Vak {

    public Mijn(Veld veld) {
        super(veld);
    }

    // roep gameOver aan van veld
    @Override
    public void open() {
        this.setText("X");
        Veld veld = this.getVeld();
        veld.gameOver();
    }
    
    public String toString() {
        return "*";
    }
    
}
