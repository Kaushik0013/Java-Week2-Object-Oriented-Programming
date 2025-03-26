class Product {
    private final int productID;
    private String productName;
    private double price;
    private int quantity;

    public static double discount = 10.0; // shared across all products

    public Product(int productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
    }

    public void displayProductDetails() {
        System.out.println("Product ID: " + productID);
        System.out.println("Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Discount: " + discount + "%");
    }
}
public class ProductMain {
    public static void main(String[] args) {
        Object obj1 = new Product(101, "Bluetooth Speaker", 49.99, 2);
        Object obj2 = "Not a Product";

        displayIfProduct(obj1);
        System.out.println();
        displayIfProduct(obj2);

        Product.updateDiscount(15.0); // updating static discount
        System.out.println("\nAfter discount update:");
        displayIfProduct(obj1);
    }

    public static void displayIfProduct(Object obj) {
        if (obj instanceof Product) {
            Product p = (Product) obj;
            p.displayProductDetails();
        } else {
            System.out.println("Not a valid Product object.");
        }
    }
}