package opgaven;

import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Jeroen
 */
public class ArrayLists {

    
    public static void main(String[] args) {
        ArrayList<Integer> nummers = new ArrayList();
        nummers.add(10);
        nummers.add(20);
        nummers.add(30);
        ArrayList<Integer> kopie = new ArrayList(nummers);
        kopie.addAll(nummers);
        Collections.sort(kopie);
        nummers.set(0, 5);   // nummers[0] = 5
        nummers.remove(1);
        nummers.remove(new Integer(30));
        System.out.println("waarde [0]=" + kopie.get(0));
        System.out.println("lengte " + kopie.size());
        for (int i = 0; i < kopie.size(); i++) {
            System.out.println(kopie.get(i));
        }
    }
}
