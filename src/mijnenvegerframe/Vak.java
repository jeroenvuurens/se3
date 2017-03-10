package mijnenvegerframe;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;

public class Vak extends JButton {

    private boolean geopend;
    private ArrayList<Vak> buren = new ArrayList();

    public Vak() {
        this.addActionListener(new ClickListener());
    }
    
    public void addBuurman(Vak buurman) {
        buren.add(buurman);
    }

    // als vakje nog niet geopend
    // en 0 mijnen om vakje
    // open buren van vakje
    public boolean open() {
        if (!geopend) {
            geopend = true;
            if (telMijnenBuren() == 0) {
                for (Vak b : buren) {
                    b.open();
                }
            }
        }
        return geopend;
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
            setText(telMijnenBuren() + "");
        }
        
    }
}
