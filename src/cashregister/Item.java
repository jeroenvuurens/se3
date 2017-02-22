package cashregister;

public class Item implements Comparable<Item> {

   private String name;
   private double price;
   
   public Item(String name, double price) {
       this.name = name;
       this.price = price;
   }
    
    @Override
    public int compareTo(Item o) {
       if (this.getPrice() < o.getPrice())
           return -1;
       if (this.getPrice() > o.getPrice())
           return 1;
       return 0;
    }
    
   public double getPrice() {
       return price;
   }
   
   protected String getName() {
       return name;
   }
   
   public String toString() {
       return String.format("%s  %32.2f", 
                getName(), getPrice());
   }
           
    public static void main(String[] args) {
        Item item = new Item("Spaghetti", 1.99);
        System.out.println(item);
        System.out.println(item.getPrice());
    }
}
