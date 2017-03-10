package mijnenvegerframe;

import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Jeroen
 */
public class Veld extends JFrame {

    private int aantalRijen;
    private int aantalMijnen;
    private Vak[][] vak;
    private JPanel panel;
    private final int SIZE = 30;

    public Veld(int aantalRijen, int aantalMijnen) {
        this.aantalRijen = aantalRijen;
        this.aantalMijnen = aantalMijnen;

        maakVeld();
        initComponents();
    }

    private void plaatsRij(int rij) {
        for (int i = 0; i < this.aantalRijen; i++) {
            panel.add(vak[rij][i]);
            vak[rij][i].setSize(SIZE, SIZE);
            vak[rij][i].setLocation(SIZE * i, SIZE * rij);
        }
    }

    private void initComponents() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(200, 200);
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);

        for (int i = 0; i < this.aantalRijen; i++)
            plaatsRij(i);
        // set size op JFrame
        // panel op JFRame zetten
        // vakken op panel zetten
    }

    public void toonVeld() {
        for (int rij = 0; rij < vak.length; rij++) {
            printRijMijnen(vak[rij]);
        }
    }

    private void printRijMijnen(Vak[] rij) {
        for (Vak vak : rij) {
            System.out.print(vak);
        }
        System.out.println();
    }

    private void maakVeld() {
        vak = new Vak[aantalRijen][aantalRijen];
        for (int rij = 0; rij < aantalRijen; rij++) {
            for (int kolom = 0; kolom < aantalRijen; kolom++) {
                vak[rij][kolom] = new Vak();
            }
        }
        legMijnen(aantalMijnen);
        zetBuren();
    }

//    private boolean gewonnen() {
//        
//    }
    private void zetBuren() {
        for (int rij = 0; rij < aantalRijen; rij++) {
            for (int kolom = 0; kolom < aantalRijen; kolom++) {
                ArrayList<Vak> buren = geefBuren(rij, kolom);
                for (Vak b : buren) {
                    vak[rij][kolom].addBuurman(b);
                }
            }
        }
    }

    private ArrayList<Vak> geefBuren(int rij, int kolom) {
        ArrayList<Vak> buren = new ArrayList();
        if (rij > 0) // boven
        {
            buren.add(vak[rij - 1][kolom]);
        }
        if (rij > 0 && kolom > 0) // links boven
        {
            buren.add(vak[rij - 1][kolom - 1]);
        }
        if (kolom > 0) // links
        {
            buren.add(vak[rij][kolom - 1]);
        }
        if (rij < aantalRijen - 1 && kolom > 0) // links onder
        {
            buren.add(vak[rij + 1][kolom - 1]);
        }
        if (rij < aantalRijen - 1) // onder
        {
            buren.add(vak[rij + 1][kolom]);
        }
        if (rij < aantalRijen - 1 && kolom < aantalRijen - 1) // rechts onder
        {
            buren.add(vak[rij + 1][kolom + 1]);
        }
        if (kolom < aantalRijen - 1) // rechts
        {
            buren.add(vak[rij][kolom + 1]);
        }
        if (rij > 0 && kolom < aantalRijen - 1) // rechts boven
        {
            buren.add(vak[rij - 1][kolom + 1]);
        }
        return buren;
    }

    private void legMijnen(int aantalMijnen) {
        Random random = new Random(0);
        while (aantalMijnen > 0) {
            int rij = random.nextInt(aantalRijen);
            int kolom = random.nextInt(aantalRijen);
            if (!(vak[rij][kolom] instanceof Mijn)) {
                vak[rij][kolom] = new Mijn();
                aantalMijnen--;
            }
        }
    }

    public static void main(String[] args) {
        Veld veld = new Veld(6, 5);
//        veld.vak[0][0].open();
//        veld.vak[3][4].open();
//        System.out.println(veld.vak[0][4].getClass());
//        veld.toonVeld();
        //System.out.println(veld.geefBuren(4, 4));
        veld.setVisible(true);

    }

}
