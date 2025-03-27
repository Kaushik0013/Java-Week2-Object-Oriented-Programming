import java.util.*;

class Bank {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Bank(String name) {
        this.name = name;
    }

    public void openAccount(Customer customer, double initialDeposit) {
        Account account = new Account(customer, this, initialDeposit);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.getName() + " in " + name);
    }

    public String getName() {
        return name;
    }
}

class Customer {
    private String name;
    private List<Account> accounts = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalance() {
        for (Account account : accounts) {
            System.out.println("Bank: " + account.getBank().getName() +
                               ", Balance: " + account.getBalance());
        }
    }

    public String getName() {
        return name;
    }
}

class Account {
    private Customer customer;
    private Bank bank;
    private double balance;

    public Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
    }

    public Bank getBank() {
        return bank;
    }

    public double getBalance() {
        return balance;
    }
}

public class BankMain {
    public static void main(String[] args) {
        Bank bank1 = new Bank("HDFC Bank");
        Bank bank2 = new Bank("ICICI Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank1.openAccount(c1, 5000);
        bank2.openAccount(c1, 7000);
        bank1.openAccount(c2, 3000);

        System.out.println();
        c1.viewBalance();
        System.out.println();
        c2.viewBalance();
    }
}
