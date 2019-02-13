import java.util.ArrayList;

public class Borrower {

    private ArrayList<Books> colectionOfBooks;

    public Borrower(){
        this.colectionOfBooks = new ArrayList<>();
    }

    public int getColectionOfBooks(){
        return this.colectionOfBooks.size();
    }
    public void addBook(Books book){
        this.colectionOfBooks.add(book);

    }
//    public void borrowBook(Library library, Books book){
//       library.removeBook???
//    }
}
