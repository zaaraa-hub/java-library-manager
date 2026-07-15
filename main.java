import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {

    public static int getValidInt(Scanner sc) {
        while(true){
        try{
         return sc.nextInt();
        }
        catch(InputMismatchException e){
            System.out.println("Invalid input. Enter a number.");
            sc.nextLine();
        }
    }
}
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Library library = new Library();

        int choice=0;

        do {
            System.out.println("\n--- Library Manager ---");
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Search Book");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit");

            System.out.print("Enter choice: ");
            try{
            choice = sc.nextInt();
            }
            catch(InputMismatchException e){
            System.out.println("Invalid input. Enter a number.");
            sc.nextLine();
            }

      switch(choice) {

    case 1:
    System.out.print("Enter book id: ");
    int bookId = getValidInt(sc);
    sc.nextLine();

    System.out.print("Enter book title: ");
    String title = sc.nextLine();

    System.out.print("Enter author name: ");
    String author = sc.nextLine();

    library.addBook(bookId, title, author);

    break;
       

    case 2:
        System.out.println("Display Books selected");
        library.displayBooks();
        break;

    case 3:
    System.out.print("Enter book id to search: ");
    int searchId = getValidInt(sc);

    library.searchBook(searchId);

    break;

    case 4:
    System.out.print("Enter book id to borrow: ");
    int borrowId = getValidInt(sc);

    library.borrowBook(borrowId);

    break;

    case 5:
    System.out.print("Enter book id to return: ");
    int returnId = getValidInt(sc);

    library.returnBook(returnId);

    break;

    case 6:
        System.out.println("Exiting...");
        break;

    default:
        System.out.println("Invalid choice");
}
           }

         while(choice != 6);

        sc.close();
    }
}
