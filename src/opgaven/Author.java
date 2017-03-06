package opgaven;


/**
 *
 * @author Jeroen
 */
public class Author {
    private String name;
    private int aantalBoeken;
    
    public Author(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    protected void addBook() {
        aantalBoeken++;
    }
    
    public int getAantalBoeken() {
        return aantalBoeken;
    }
}
