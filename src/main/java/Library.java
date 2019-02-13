import java.util.ArrayList;

public class Library {

    private ArrayList<Books> numberOfBooks;
    private int capacity;

    public Library(Integer capacity){
        this.numberOfBooks = new ArrayList<>();
        this.capacity = capacity;
    }
    public int getNumberOfBooks(){
        return this.numberOfBooks.size();
    }

    public void addBook(Books book) {
        if (getCapacity() > getNumberOfBooks()) {
            this.numberOfBooks.add(book);
        }
    }
    public int getCapacity(){
        return this.capacity;
    }

}
