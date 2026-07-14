public class Book {
    private int bookId;
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(int bookId, String title, String author) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed = false;
    }

    public int getBookId(){
        return bookId;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public boolean getIsBorrowed() {
        return isBorrowed;
    }

    public void setIsBorrowed(boolean isBorrowed) {
        this.isBorrowed = isBorrowed;
    }

    @Override
    public String toString() {
        return "Book ID: " + bookId + "\nTitle: " + title + "\nAuthor: " + author + "\nIs Borrowed: " + (isBorrowed ? "Borrowed" : "Available");
    }
}

 