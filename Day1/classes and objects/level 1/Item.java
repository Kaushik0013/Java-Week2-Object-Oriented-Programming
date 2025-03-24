import java.util.Scanner;

public class Item {
    public int ItemCode;
    public String ItemName;
    public double price;

    public Item(int itemCode, String itemName, double price) {
        this.ItemCode = itemCode;
        this.ItemName = itemName;
        this.price = price;
    }

    public void displayDetails(){
        System.out.println("Item details:");
        System.out.println("Item Code is:"+ItemCode);
        System.out.println("Item details:"+ItemName);
        System.out.println("Item details:"+price);
    }
    public calculateTotalPrice(int quantity){
        return price*quantity;
    }

    public static void main(String[]args){
        Scanner input= new Scanner(System.in);
        System.out.println("Enter Item code:");
        int ItemCode=input.nextInt();

        System.out.println("Enter Item Name:");
        String ItemName = input.nextInt();

        System.out.println("Enter Item price:");
        double price= input.nextDouble();

        System.out.println("Enter quantity:");
        int quantity = input.nextInt();

        input.close();
    }
}