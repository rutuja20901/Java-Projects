import java.util.ArrayList;

public class Library {

    // Store all books
    private ArrayList<Book> books;

    // Constructor to initialize list
    public Library() {
        books = new ArrayList<>();
    }

    // 1. Add books
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added successfully: " + book.getTitle());
    }

    // 2. show all books
    public void showBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library!");
        } else {
            System.out.println("All books in the library");
            for (Book b : books) {
                System.out.println(b);
            }
        }
    }

    // 3. return book is found by title
    public Book searchByTitle(String title) {
        for (Book b : books) {
            if (b.getTitle().equalsIgnoreCase(title)) {
                return b;
            }
        }
        return null;
    }

    // 4. change status to borrowed if available
    public void borrowBook(int id) {
        for (Book b : books) {
            if (b.getId() == id) {
                if (!b.isBorrowed()) {
                    b.borrowBook();
                    System.out.println("You have borrowed: " + b.getTitle());
                } else {
                    System.out.println("Book is already borrowed: " + b.getTitle());
                }
                return;
            }
        }
        System.out.println("Book with id: " + id + " Not found!");
    }

    // 5. as return book
    public void returnBook(int id) {

        for (Book b : books) {
            if (b.getId() == id) {
                if (b.isBorrowed()) {
                    b.returnBook();
                    System.out.println("You have returned: " + b.getTitle());
                } else {
                    System.out.println("Book was not borrowed: " + b.getTitle());
                }
                return;
            }
        }
        System.out.println("Book with ID  " + id + " Not found!");
    }
}
