package mijnenvegerframe;

/**
 *
 * @author Jeroen
 */
public class Mijn extends Vak {

    public Mijn(Veld veld) {
        super(veld);
    }

    @Override
    public void open() {
        if (!this.getVeld().getGameOver()) {
            this.setText("X");
            Veld veld = this.getVeld();
            veld.gameOver();
        }
    }

    public String toString() {
        return "*";
    }

}
