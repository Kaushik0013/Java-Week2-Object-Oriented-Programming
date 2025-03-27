import java.util.*;

class Product {
    private String productName;
    private double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public double getPrice() {
        return price;
    }
}

class Order {
    private int orderId;
    private List<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        this.products = new ArrayList<>();
    }

    public void addProduct(Product p) {
        products.add(p);
    }

    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Products in this order:");
        double total = 0;
        for (Product p : products) {
            System.out.println("- " + p.getProductName() + " ($" + p.getPrice() + ")");
            total += p.getPrice();
        }
        System.out.println("Total Amount: $" + total);
    }
}

class Customer {
    private String name;
    private List<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(name + " placed an order (ID: " + order.hashCode() + ")");
    }

    public void viewOrders() {
        System.out.println(name + "'s Orders:");
        for (Order o : orders) {
            o.showOrderDetails();
            System.out.println();
        }
    }
}

public class EcommerceMain {
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 900.00);
        Product p2 = new Product("Headphones", 50.00);
        Product p3 = new Product("Keyboard", 30.00);

        Order order1 = new Order(1001);
        order1.addProduct(p1);
        order1.addProduct(p2);

        Order order2 = new Order(1002);
        order2.addProduct(p3);

        Customer customer = new Customer("Alice");
        customer.placeOrder(order1);
        customer.placeOrder(order2);

        customer.viewOrders();
    }
}
