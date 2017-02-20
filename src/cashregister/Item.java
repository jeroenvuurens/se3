package cashregister;

public class Item {

   private String name;
   private double price;
   
   public Item(String name, double price) {
       this.name = name;
       this.price = price;
   }
    
   public double getPrice() {
       return price;
   }
   
   public String toString() {
       return name + "\t\t" + price;
   }
           
    public static void main(String[] args) {
        Item item = new Item("Spaghetti", 1.99);
        System.out.println(item);
        System.out.println(item.getPrice());
    }
}
