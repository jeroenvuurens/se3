package cashregister;

import java.util.ArrayList;
import opgaven.*;

/**
 *
 * @author Jeroen
 */
public class CashRegister {

    private ArrayList<Item> items = new ArrayList();

    public CashRegister() {
        System.out.println("Ik ben een Kassa");
    }

//    public CashRegister(int itemCount) {
//        this.itemCount = itemCount;
//    }
//    
//    public void clear() {
//        itemCount = 0;
//        totalPrice = 0;
//    }
//    
    public double getTotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            Item item = items.get(i);
            total += item.getPrice();
        }
        return total;
    }
    
    public int getCount() {
        return items.size();
    }
    
    public void printReceipt() {
        for (Item item : items) {
            System.out.println(item);
        }
    }
    
    public void addItem(Item item) {
        items.add(item);
    }

    public static void main(String[] args) {
        CashRegister cr = new CashRegister();
        Item item = new Item("Spaghetti", 1.99);
        cr.addItem(item);
        item = new Fruit("Appel", 2.99, 100);
        cr.addItem(item);
        cr.printReceipt();
        System.out.println("\t\t\t" + cr.getTotal());
    }

}
