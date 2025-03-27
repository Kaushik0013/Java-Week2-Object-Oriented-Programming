import java.util.ArrayList;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("Book Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String libraryName;
    private ArrayList<Book> books;

    public Library(String libraryName) {
        this.libraryName = libraryName;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + libraryName);
        if (books.isEmpty()) {
            System.out.println("No books in this library.");
        } else {
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}

public class LibraryMain {
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho");
        Book book2 = new Book("The Da Vinci Code", "Dan Brown");
        Book book3 = new Book("Wings of Fire", "A.P.J. Abdul Kalam");

        Library cityLibrary = new Library("City Library");
        Library schoolLibrary = new Library("School Library");

        cityLibrary.addBook(book1);
        cityLibrary.addBook(book2);

        schoolLibrary.addBook(book2);
        schoolLibrary.addBook(book3);

        cityLibrary.displayBooks();
        System.out.println();
        schoolLibrary.displayBooks();
    }
}
