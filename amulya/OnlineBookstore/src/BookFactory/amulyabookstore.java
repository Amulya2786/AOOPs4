package BookFactory;

public class Main {
	public static void main(String[] args) {
        // Create the BookstoreManager instance (Singleton)
        BookstoreManager bookstore = BookstoreManager.getInstance();

        // Create Users (Observers)
        User user1 = new User("Alice");
        User user2 = new User("Bob");

        // Attach Users to the BookstoreManager
        bookstore.attach(user1);
        bookstore.attach(user2);

        // Add books using the Factory Method
        Book book1 = BookFactory.createBook("eBook", "Java Programming", "John Doe");
        Book book2 = BookFactory.createBook("AudioBook", "Learning Python", "Jane Smith");
        Book book3 = BookFactory.createBook("PrintedBook", "Design Patterns", "Erich Gamma");

        // Add books to the inventory
        bookstore.addBook(book1);
        bookstore.addBook(book2);
        bookstore.addBook(book3);

        // Show the inventory
        bookstore.showInventory();
    }
}
