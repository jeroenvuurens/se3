package cashregister;

import opgaven.*;


/**
 *
 * @author Jeroen
 */
public class CashRegisterTest {

    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        Item item = new Item("Spaghetti", 1.99);
        cr.addItem(item);
        item = new Item("Spaghettisaus", 2.99);
        cr.addItem(item);
        System.out.println(cr.items);
    }
}
