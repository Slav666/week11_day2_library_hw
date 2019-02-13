import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    Borrower slav;
    Books book1;
    Books book2;
    Library library;


    @Before
    public void before() {
        slav = new Borrower();
        library = new Library(2);
        book1 = new Books("Home", "Bob", "Drama");
        book2 = new Books("Codeclan", "Slav", "Drama");
        library.addBook(book1);
        library.addBook(book1);
    }

    @Test
    public void borrowerHasBooks(){
        assertEquals(0, slav.getColectionOfBooks());
    }
    @Test
    public void borrowerAddBook(){
        slav.addBook(book1);
        assertEquals(1, slav.getColectionOfBooks());
    }
//    @Test
//    public void borrowBook(){
//        slav.borrowBook(Library book1);
//        assertEquals(1, slav.getColectionOfBooks());
//        assertEquals(1, library.getNumberOfBooks());
//    }

}
