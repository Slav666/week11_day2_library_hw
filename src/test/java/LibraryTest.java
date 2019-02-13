import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Books book1;
    Books book2;
    Books book3;



    @Before
    public void before(){

        library = new Library(2);
        book1 = new Books ("Home", "Bob", "Drama");
        book2 = new Books ("Codeclan", "Slav", "Drama");
        book3 = new Books ("Life", "Raul", "Fantasy");


    }

    @Test
    public void libraryBookColection(){
        assertEquals(0, library.getNumberOfBooks());
    }
    @Test
    public void CanAddBookToColection(){
        this.library.addBook(book1);
        assertEquals(1, library.getNumberOfBooks());
    }
    @Test
    public void checkLibraryHasCapacity(){
        assertEquals(2, library.getCapacity());
    }
    @Test
    public void checkCanAddBookOverCapacity(){
       library.addBook(book1);
       library.addBook(book2);
       library.addBook(book3);
       assertEquals(2, library.getNumberOfBooks());
    }
}