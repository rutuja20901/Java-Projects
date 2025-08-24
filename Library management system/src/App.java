import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        Library l = new Library();

        int choice;

        do {
            System.out.println("====Library menu====");
            System.out.println("1. Add Book");
            System.out.println("2. Show All Book");
            System.out.println("3. Search Book by title");
            System.out.println("4. Borrow Book");
            System.out.println("5. Return Book");
            System.out.println("6. Exit Book");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    // Add book
                    System.out.println("Enter Book Id: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Enter Book Title: ");
                    String title = sc.nextLine();

                    System.out.println("Enter Book Author: ");
                    String author = sc.nextLine();

                    l.addBook(new Book(id, title, author));
                    break;

                case 2:
                    // Show all books
                    l.showBooks();
                    break;

                case 3:
                    // Search book by title
                    System.out.println("Enter Book title to search: ");
                    String searchTitle = sc.nextLine();
                    Book found = l.searchByTitle(searchTitle);

                    if (found != null) {
                        System.out.println("Book found: " + found);
                    } else {
                        System.out.println("Book not found!");
                    }
                    break;
                case 4:
                    System.out.println("Enter Book ID to borrow: ");
                    int borrowId = sc.nextInt();

                    l.borrowBook(borrowId);
                    break;

                case 5:
                    System.out.println("Enter Book ID to return: ");
                    int returnId = sc.nextInt();

                    l.returnBook(returnId);
                    break;

                case 6:
                    System.out.println("Existing library management system. GoodBye! ");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again ");

            }
        } while (choice != 6);

        sc.close();
    }
}
