package opgaven;

/**
 *
 * @author Jeroen
 */
public class Car {

    private int efficientie;
    private double gasLevel;
    
    public Car(int efficientie) {
        this.efficientie = efficientie;
    }
    
    public double getGasLevel() {
        return gasLevel;
    }
    
    public void addGas(double gas) {
        this.gasLevel += gas;
    }
    
    public void drive(int miles) {
        gasLevel -= miles / (double)efficientie;
    }
    
    public static void main(String[] args) {
        Car myHybrid = new Car(50);
        myHybrid.addGas(20);
        myHybrid.drive(99);
        System.out.println(myHybrid.getGasLevel());
    }
}
