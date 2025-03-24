import java.util.Scanner;

public class BankAccount {
    public String accountHolder;
    public long accountNumber;
    public double balance;

    public BankAccount(String accountHolder, long accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositMoney(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited for: " + accountHolder + ", Remaining Balance: ₹" + this.balance);
        } else {
            System.out.println("Invalid amount");
        }
    }

    public void withDrawMoney(double amount) {
        if (amount <= balance && amount > 0) {
            balance -= amount;
            System.out.println("₹" + amount + " withdrawn for: " + accountHolder + ", Remaining Balance: ₹" + this.balance);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }

    public void displayDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter account holder name: ");
        String accountHolder = input.nextLine();

        System.out.print("Enter account number: ");
        long accountNumber = input.nextLong();

        System.out.print("Enter initial amount: ₹");
        double amount = input.nextDouble();

        BankAccount savings = new BankAccount(accountHolder, accountNumber, amount);

        int choice = 0;

        while (choice != 5) {
            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Deposit Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Display Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = input.nextInt();

            if (choice == 1) {
                System.out.print("Enter amount to deposit: ₹");
                double depositAmount = input.nextDouble();
                savings.depositMoney(depositAmount);

            } else if (choice == 2) {
                System.out.print("Enter amount to withdraw: ₹");
                double withdrawAmount = input.nextDouble();
                savings.withDrawMoney(withdrawAmount);

            } else if (choice == 3) {
                System.out.println("Current Balance: ₹" + savings.balance);

            } else if (choice == 4) {
                savings.displayDetails();

            } else if (choice == 5) {
                System.out.println("Thank you for using the ATM. Goodbye!");

            } else {
                System.out.println("Invalid option. Please try again.");
            }
        }

        input.close();
    }
}
