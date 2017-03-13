package mijnenvegerframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Vak extends JButton {

    private boolean geopend;
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
    
    // extra check gamerOver
    public void open() {
        if (!geopend) {
            setText(telMijnenBuren() + "");
            geopend = true;
            if (telMijnenBuren() == 0) {
                for (int i = 0; i < buren.size(); i++) {
                    buren.get(i).open();
                }
            }
        }
    }

    @Override
    public String toString() {
        if (!geopend) {
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
            open();
        }

    }
}
