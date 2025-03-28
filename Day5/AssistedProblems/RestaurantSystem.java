interface Worker {
    void performDuties();
}

class Person {
    String name;
    int id;

    Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

class Chef extends Person implements Worker {
    Chef(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Preparing meals and managing the kitchen.");
    }
}

class Waiter extends Person implements Worker {
    Waiter(String name, int id) {
        super(name, id);
    }

    public void performDuties() {
        System.out.println("Serving food and taking customer orders.");
    }
}

public class RestaurantSystem {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101);
        Waiter waiter = new Waiter("John Doe", 202);

        System.out.println("--- Chef Info ---");
        chef.displayInfo();
        chef.performDuties();

        System.out.println("\n--- Waiter Info ---");
        waiter.displayInfo();
        waiter.performDuties();
    }
}
