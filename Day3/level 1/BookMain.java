class Book {
    public static String libraryName = "Central City Library";

    private final String isbn;
    private String title;
    private String author;

    public Book(String isbn, String title, String author) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
    }

    public static void displayLibraryName() {
        System.out.println("Library: " + libraryName);
    }

    public void displayBookDetails() {
        displayLibraryName();
        System.out.println("ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

public class BookMain {
    public static void main(String[] args) {
        Object obj1 = new Book("978-0451524935", "1984", "George Orwell");
        Object obj2 = "Just a String, not a Book";

        displayIfBook(obj1);  
        System.out.println();
        displayIfBook(obj2);  
    }

    public static void displayIfBook(Object obj) {
        if (obj instanceof Book) {
            Book book = (Book) obj;
            book.displayBookDetails();
        } else {
            System.out.println("Not a valid Book object.");
        }
    }
}
