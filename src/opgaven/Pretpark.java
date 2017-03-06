package opgaven;

public class Pretpark {

    public Pretpark() {}
    
    public static double berekenPrijs(int leeftijd, double prijs) {
        if (leeftijd < 5)
            return 0.0;
        if (leeftijd < 13)
            return prijs / 2;
        if (leeftijd > 65)
            return prijs * 0.75;
        return prijs;
    }
}
