import java.util.Scanner;

public class Book {
    public String title;
    public String author;
    public float price;

    public Book(String title, String author, float price){
        this.title= title;
        this.author= author;
        this.price= price;
    }
    public void displayDetails(){
        System.out.println(" Book details:");
        System.out.println(" ---------------");

        System.out.println(" title name:"+title);
        System.out.println(" author:"+author);
        System.out.println(" price:"+price);
    }
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter title:");
        String title = input.nextLine();
        System.out.println("Enter author name:");
        String author = input.nextLine();
        System.out.println("Enter price:");
        float price = input.nextFloat();

        Book book= new Book(title, author, price);
        book.displayDetails();
        input.close();

    }
}
