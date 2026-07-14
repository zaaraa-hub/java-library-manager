import java.util.HashMap;


public class Library {
    private HashMap<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
    }

    public void addBook(int bookId, String title, String author) {
        Book newBook = new Book(bookId, title, author);
        books.put(bookId, newBook);
        System.out.println("Book added successfully");
        System.out.println(newBook);
    }
}
