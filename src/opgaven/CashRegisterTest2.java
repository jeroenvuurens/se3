package opgaven;


/**
 *
 * @author Jeroen
 */
public class CashRegisterTest2 {

    public static void main(String[] args) {
        CashRegister cr = new CashRegister(100);
        CashRegister kopie = cr;
        System.out.println(kopie.getCount());
        System.out.println(kopie.getTotal());
        cr.addItem(1.99);
        cr.addItem(2.99);
        System.out.println(cr.getCount());
        System.out.println(cr.getTotal());
        System.out.println(kopie.getCount());
        System.out.println(kopie.getTotal());
    }
}
