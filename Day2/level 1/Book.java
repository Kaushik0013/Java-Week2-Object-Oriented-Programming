public class Book {
    private String title;
    private String author;
    private double price;

    public Book() {
        this.title = "Unknown Title";
        this.author = "Unknown Author";
        this.price = 0.0;
    }

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void displayBookInfo() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        b1.displayBookInfo();

        System.out.println();

        Book b2 = new Book("The Alchemist", "Paulo Coelho", 15.99);
        b2.displayBookInfo();

        System.out.println();

        Book b3 = new Book();
        b3.setTitle("Atomic Habits");
        b3.setAuthor("James Clear");
        b3.setPrice(21.50);
        b3.displayBookInfo();
    }
}
