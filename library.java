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

    public void displayBooks() {
        if (books.isEmpty()) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Total Books: " + books.size());
            System.out.println("--------------------");
            System.out.println("Books in the library:");
            for (Book book : books.values()) {
                System.out.println(book);
                System.out.println("--------------------");
            }
        }
    }
}
