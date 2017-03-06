package opgaven;

import java.util.ArrayList;


/**
 *
 * @author Jeroen
 */
public class Book {
    private String title;
    private ArrayList<Author> authors;
    
    public Book(String title) {
    }
    
    /**
     * Voeg author toe aan authors
     * @param author 
     */
    public void addAuthor(Author author) {
        
    }
    
    /**
     * @return number of authors of book
     */
    public int countAuthors() {
        return 0;
    }
    
    /**
     * @param author
     * @return true if author is in authors of book
     */
    public boolean isAuthorOf(Author author) {
        return false;
    }
}
