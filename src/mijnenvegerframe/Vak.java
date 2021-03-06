package mijnenvegerframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Vak extends JButton {

    private boolean isGeopend;
    private boolean isGemarkeerd;
    private ArrayList<Vak> buren = new ArrayList();
    private Veld veld;

    // veld registereren
    public Vak(Veld veld) {
        this.veld = veld;
        this.addActionListener(new ClickListener());
    }

    public void addBuurman(Vak buurman) {
        buren.add(buurman);
    }

    protected Veld getVeld() {
        return veld;
    }

    public boolean getIsGeopend() {
        return isGeopend;
    }
    
    // check of spel gewonnen is
    public void open() {
        if (!isGeopend && !veld.getGameOver() && !isGemarkeerd) {
            setText(telMijnenBuren() + "");
            isGeopend = true;
            if (telMijnenBuren() == 0) {
                for (int i = 0; i < buren.size(); i++) {
                    buren.get(i).open();
                }
            }
            this.veld.checkGewonnen();
        }
    }

    // markeer als M
    // of onmarkeer indien gemarkeerd was
    public void markeer() {
        if (!veld.getGameOver()) {
            if (isGemarkeerd) {
                setText("");
            } else {
                setText("M");
            }
            isGemarkeerd = !isGemarkeerd;
        }
    }

    @Override
    public String toString() {
        if (!isGeopend) {
            return "-";
        }
        return telMijnenBuren() + "";
    }

    private int telMijnenBuren() {
        int aantalMijnen = 0;
        for (int i = 0; i < buren.size(); i++) {
            Vak buurman = buren.get(i);
            if (buurman instanceof Mijn) {
                aantalMijnen++;
            }
        }
        return aantalMijnen;
    }

//    public static void main(String[] args) {
//        Vak vak1 = new Vak();
//        Vak vak2 = new Mijn();
//        Vak vak3 = new Mijn();
//        //vak3.legMijn();
//        vak1.addBuurman(vak2);
//        vak1.addBuurman(vak3);
//        System.out.println(vak1); // -
//        vak1.open();
//        System.out.println(vak1); // 1
//        vak2.open();
//    }
    class ClickListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            int modifiers = e.getModifiers();
            if ((modifiers & ActionEvent.SHIFT_MASK) != 0) {
                markeer();
            } else {
                open();
            }
        }

    }
}
