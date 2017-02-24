package mijnenveger;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Jeroen
 */
public class Veld {

    private int aantalRijen;
    private int aantalMijnen;
    private Vak[][] veld;

    public Veld(int aantalRijen, int aantalMijnen) {
        this.aantalRijen = aantalRijen;
        this.aantalMijnen = aantalMijnen;

        maakVeld();
    }

    public void toonVeld() {
        for (int rij = 0; rij < veld.length; rij++) {
            printRijMijnen(veld[rij]);
        }
    }

    private void printRijMijnen(Vak[] rij) {
        for (Vak vak : rij) {
            System.out.print(vak);
        }
        System.out.println();
    }

    private void maakVeld() {
        veld = new Vak[aantalRijen][aantalRijen];
        for (int rij = 0; rij < aantalRijen; rij++) {
            for (int kolom = 0; kolom < aantalRijen; kolom++) {
                veld[rij][kolom] = new Vak();
            }
        }
        legMijnen();
        zetBuren();
    }

    private void zetBuren() {
        for (int rij = 0; rij < aantalRijen; rij++) {
            for (int kolom = 0; kolom < aantalRijen; kolom++) {
                ArrayList<Vak> buren = geefBuren(rij, kolom);
                for (Vak b : buren) {
                    veld[rij][kolom].addBuurman(b);
                }
            }
        }
    }

    private ArrayList<Vak> geefBuren(int rij, int kolom) {
        ArrayList<Vak> buren = new ArrayList();
        if (rij > 0) // boven
        {
            buren.add(veld[rij - 1][kolom]);
        }
        if (rij > 0 && kolom > 0) // links boven
        {
            buren.add(veld[rij - 1][kolom - 1]);
        }
        if (kolom > 0) // links
        {
            buren.add(veld[rij][kolom - 1]);
        }
        if (rij < aantalRijen - 1 && kolom > 0) // links onder
        {
            buren.add(veld[rij + 1][kolom - 1]);
        }
        if (rij < aantalRijen - 1) // onder
        {
            buren.add(veld[rij + 1][kolom]);
        }
        if (rij < aantalRijen - 1 && kolom < aantalRijen - 1) // rechts onder
        {
            buren.add(veld[rij + 1][kolom + 1]);
        }
        if (kolom < aantalRijen - 1) // rechts
        {
            buren.add(veld[rij][kolom + 1]);
        }
        if (rij > 0 && kolom < aantalRijen - 1) // rechts boven
        {
            buren.add(veld[rij - 1][kolom + 1]);
        }
        return buren;
    }

    private void legMijnen() {
        Random random = new Random(0);
        while (aantalMijnen > 0) {
            int rij = random.nextInt(aantalRijen);
            int kolom = random.nextInt(aantalRijen);
            if (!(veld[rij][kolom] instanceof Mijn)) {
                veld[rij][kolom] = new Mijn();
                aantalMijnen--;
            }
        }
    }

    public static void main(String[] args) {
        Veld veld = new Veld(5, 5);
        veld.veld[2][4].open();
        System.out.println(veld.veld[0][4].getClass());
        veld.toonVeld();
        //System.out.println(veld.geefBuren(4, 4));

    }

}
