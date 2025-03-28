class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: ₹" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
        displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
        displayDetails();
        System.out.println("Withdrawal Limit: ₹" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int lockInPeriod;

    FixedDepositAccount(String accountNumber, double balance, int lockInPeriod) {
        super(accountNumber, balance);
        this.lockInPeriod = lockInPeriod;
    }

    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
        displayDetails();
        System.out.println("Lock-in Period: " + lockInPeriod + " months");
    }
}

public class BankAccountMain {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("SA123", 10000.0, 4.5);
        CheckingAccount ca = new CheckingAccount("CA456", 5000.0, 2000.0);
        FixedDepositAccount fda = new FixedDepositAccount("FD789", 25000.0, 12);

        System.out.println("\n--- Savings Account ---");
        sa.displayAccountType();

        System.out.println("\n--- Checking Account ---");
        ca.displayAccountType();

        System.out.println("\n--- Fixed Deposit Account ---");
        fda.displayAccountType();
    }
}
