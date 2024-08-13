package BookFactory;

public class BookFactory {
	public static Book createBook(String type, String title, String author) {
        if (type.equalsIgnoreCase("eBook")) {
            return new eBook(title, author);
        } else if (type.equalsIgnoreCase("AudioBook")) {
            return new AudioBook(title, author);
        } else if (type.equalsIgnoreCase("PrintedBook")) {
            return new PrintedBook(title, author);
        } else {
            return null;
        }
    }
}
