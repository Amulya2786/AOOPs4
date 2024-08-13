package BookFactory;

public class AudioBook extends Book {
    public AudioBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("AudioBook: " + title + " by " + author);
    }
}


