package BookFactory;
import java.util.ArrayList;
import java.util.List;
public class BookstoreManager extends Subject {
    private static BookstoreManager instance;
    private List<Book> books;

    private BookstoreManager() {
        books = new ArrayList<>();
    }

    public static synchronized BookstoreManager getInstance() {
        if (instance == null) {
            instance = new BookstoreManager();
        }
        return instance;
    }

    public void addBook(Book book) {
        books.add(book);
        notifyAllObservers("New book added: " + book.getTitle() + " by " + book.getAuthor());
    }

    public void showInventory() {
        System.out.println("Bookstore Inventory:");
        for (Book book : books) {
            book.displayInfo();
        }
    }

}
