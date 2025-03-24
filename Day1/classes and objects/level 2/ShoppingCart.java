import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return price * quantity;
    }
}

public class ShoppingCart {
    private CartItem[] cart;
    private int count;

    public ShoppingCart(int size) {
        cart = new CartItem[size];
        count = 0;
    }


    public void addItem(String name, double price, int qty) {
        if (count < cart.length) {
            cart[count++] = new CartItem(name, price, qty);
            System.out.println(name + " added to the cart.");
        } else {
            System.out.println("Cart is full. Cannot add more items.");
        }
    }

    public void removeItem(String name) {
        boolean found = false;
        for (int i = 0; i < count; i++) {
            if (cart[i].itemName.equalsIgnoreCase(name)) {
                
                for (int j = i; j < count - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[--count] = null;
                found = true;
                System.out.println(name + " removed from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println("Item not found.");
        }
    }


    public void displayTotalCost() {
        double total = 0;
        for (int i = 0; i < count; i++) {
            total += cart[i].getTotalPrice();
        }
        System.out.println("Total cost: ₹" + total);
    }


    public void displayCartItems() {
        if (count == 0) {
            System.out.println("Cart is empty.");
            return;
        }
        System.out.println("Items in cart:");
        for (int i = 0; i < count; i++) {
            System.out.println(cart[i].itemName + " - ₹" + cart[i].price + " x " + cart[i].quantity);
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ShoppingCart myCart = new ShoppingCart(10);

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. View Cart\n4. Total Cost\n5. Exit");
            System.out.print("Enter your choice: ");
            int choice = input.nextInt();
            input.nextLine();

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = input.nextLine();
                System.out.print("Enter price: ");
                double price = input.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = input.nextInt();
                myCart.addItem(name, price, qty);
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String name = input.nextLine();
                myCart.removeItem(name);
            } else if (choice == 3) {
                myCart.displayCartItems();
            } else if (choice == 4) {
                myCart.displayTotalCost();
            } else if (choice == 5) {
                System.out.println("Thank you for shopping!");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }

        input.close();
    }
}
