import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;

public class BooksTest {

    Books books;

    @Before
    public void before(){
    books = new Books("The Witcher", "Sapkowski", "Fantasy");

}

    @Test
    public void CheckBookHasTitle(){
    assertEquals("The Witcher", books.bookHasTitle());
}
    @Test
    public void checkBookHasAuthor(){
        assertEquals("Sapkowski", books.bookHasAuthor());
    }
    @Test
    public void checkBookGenre(){
        assertEquals("Fantasy", books.bookHasGenre());
    }
}

