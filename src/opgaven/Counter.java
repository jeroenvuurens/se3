package opgaven;

/**
 *
 * @author Jeroen
 */
public class Counter {

    private int value;
    private int limit = Integer.MAX_VALUE;
    
    public void count() {
        if (value < limit)
            value++;
        else
            System.out.println("Limit Exceeded");
    }
    
    public int getValue() {
        return value;
    }
    
    public void undo() {
        if (value > 0)
            value--;
    }
    
    public void setLimit(int limit) {
        this.limit = limit;
    }
    
    public static void main(String[] args) {
        Counter counter1 = new Counter();
        Counter counter2 = new Counter();
        counter1.setLimit(8);
        for (int i = 0; i < 10; i++)
            counter1.count();
        counter1.undo();
        counter2.undo();
        System.out.println(counter1.getValue());
        System.out.println(counter2.getValue());
    }
}
