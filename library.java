import java.util.HashMap;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Library {
    private HashMap<Integer, Book> books;

    public Library() {
        this.books = new HashMap<>();
        loadBooks();
    }

    public void addBook(int bookId, String title, String author) {
        if(books.containsKey(bookId)){
            System.out.println("Book ID already exists.");
            return;
        }
        Book newBook = new Book(bookId, title, author);
        books.put(bookId, newBook);
        saveBooks();
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

        public void saveBooks(){
            try{
                FileWriter writer = new FileWriter("books.txt");
                for(Book book : books.values()) {
                 writer.write(
                book.getBookId() + "," +
                book.getTitle() + "," +
                book.getAuthor() + "," +
                book.getIsBorrowed() + "\n");
        }
             writer.close();
            }
            catch(IOException e){
              System.out.println("Error saving books: " + e.getMessage());
            }
        }
        
        public void loadBooks(){
          try {
         BufferedReader reader = new BufferedReader(new FileReader("books.txt"));
         String line;
        while((line = reader.readLine()) != null) {
        String[] data = line.split(",");
        int bookId = Integer.parseInt(data[0]);
        String title = data[1];
        String author = data[2];
        boolean isBorrowed = Boolean.parseBoolean(data[3]);
        Book book = new Book(bookId, title, author);
        book.setIsBorrowed(isBorrowed);
        books.put(bookId, book);
}
       reader.close();
       }
       catch(IOException e) {
       System.out.println("Error loading books: " + e.getMessage());
    }
        }
}

    
    

