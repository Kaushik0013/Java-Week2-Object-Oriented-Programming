class BankAccount {
    public static String bankName = "CodeBank";
    private static int totalAccounts = 0;

    private final String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;
    }

    public static void getTotalAccounts() {
        System.out.println("Total Accounts: " + totalAccounts);
    }

    public void displayDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank: " + bankName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Balance: " + balance);
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("BA001", "Harini Ramesh", 1000.0);
        BankAccount acc2 = new BankAccount("BA002", "Heisenburger", 2500.0);

        acc1.deposit(500);
        acc2.deposit(1000);

        acc1.displayDetails();
        System.out.println();
        acc2.displayDetails();

        BankAccount.getTotalAccounts();
    }
}


