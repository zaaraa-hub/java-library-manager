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

    public void searchBook(int bookId) {
        if (books.containsKey(bookId)) {
            Book book = books.get(bookId);
            System.out.println("Book found:");
            System.out.println(book);
        } else {
            System.out.println("Book with ID " + bookId + " not found.");
        }
    }

    public void borrowBook(int bookId){
        if(books.containsKey(bookId)){
            Book book = books.get(bookId);
            if(book.getIsBorrowed()){
                System.out.println("Book is already borrowed");
                System.out.println("------------------------");
            }
            else{
                book.setIsBorrowed(true);
                System.out.println("Book borrowed successfully");
                System.out.println("-------------------------");
            }
        }else{
          System.out.println("Book with ID " + bookId + " not found.");
         }
        }

    public void  returnBook(int bookId){
        if(books.containsKey(bookId)){
        Book book = books.get(bookId);
            if(book.getIsBorrowed() == true){
                book.setIsBorrowed(false);
                System.out.println("Book returned successfully");
                System.out.println("-------------------------");
            }
            else{
                System.out.println("Book is not currently borrowed");
                System.out.println("------------------------");
            }
        }
        else{
          System.out.println("Book with ID " + bookId + " not found.");
         }
        }
}

    
    

