package mijnenveger;

import java.util.ArrayList;

public class Vak {

    private boolean geopend;
    private boolean isMijn;
    private ArrayList<Vak> buren = new ArrayList();

    public void addBuurman(Vak buurman) {
        buren.add(buurman);
    }
    
    public void legMijn() {
        isMijn = true;
    }

    public boolean open() {
        geopend = true;
        if (isMijn) {
            System.out.println("BOOOOM");
        }
        return geopend;
    }

    public String toString() {
        if (!geopend) {
            return "-";
        }
        if (isMijn) {
            return "*";
        }
        return telMijnenBuren() + "";
    }
    
    private int telMijnenBuren() {
        int aantalMijnen = 0;
        for (int i = 0; i < buren.size(); i++) {
            Vak buurman = buren.get(i);
            if (buurman.isMijn) {
                aantalMijnen++;
            }
        }
        return aantalMijnen;   
    }

    public static void main(String[] args) {
        Vak vak1 = new Vak();
        Vak vak2 = new Vak();
        Vak vak3 = new Vak();
        vak1.legMijn();
        //vak3.legMijn();
        vak1.addBuurman(vak2);
        vak1.addBuurman(vak3);
        System.out.println(vak1); // -
        vak1.open();
        System.out.println(vak1); // 1
    }

}
