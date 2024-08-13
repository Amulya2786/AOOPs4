package BookFactory;

public class eBook extends Book {
	public eBook(String title, String author) {
        super(title, author);
    }

    @Override
    public void displayInfo() {
        System.out.println("eBook: " + title + " by " + author);
    }
}

