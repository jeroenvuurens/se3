package opgaven;

/**
 *
 * @author Jeroen
 */
public class CashRegister {

    private int itemCount;
    private double totalPrice;
    
    public CashRegister() {
        System.out.println("Ik ben een Kassa");
    }
    
    public CashRegister(int itemCount) {
        this.itemCount = itemCount;
    }
    
    public void clear() {
        itemCount = 0;
        totalPrice = 0;
    }
    
    public double getTotal() {
        return totalPrice;
    }
    
    public int getCount() {
        return itemCount;
    }
    
    public void addItem(double price) {
        itemCount++;
        totalPrice += price;
    }
}
