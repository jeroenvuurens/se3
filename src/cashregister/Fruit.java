package cashregister;


/**
 *
 * @author Jeroen
 */
public class Fruit extends Item {

    private int grams;
    
    public Fruit(String name, double price, int grams) {
        super(name, price);
        this.grams = grams;
    }
    
    @Override
    public double getPrice() {
        return super.getPrice() * grams / 1000;
    }
    
    public String toString() {
        return String.format("%s %24d %6.2f", 
                getName(), grams, getPrice());
    }
    
    public static void main(String[] args) {
        Fruit appel = new Fruit("Appel", 1.99, 100);
        System.out.println(appel);
    }
}
