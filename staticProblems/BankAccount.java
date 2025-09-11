package staticProblems;

public class BankAccount {

    // Static variable shared by all accounts
    private static String bankName = "State Bank of India";

    // Static variable to count total accounts
    private static int totalAccounts = 0;

    // Final variable - cannot be changed once set
    private final int accountNumber;
    
    private String accountHolderName;
    private double balance;

    // Constructor using 'this' to resolve ambiguity
    public BankAccount(int accountNumber, String accountHolderName, double initialBalance) {
        this.accountNumber = accountNumber; // 'this' distinguishes between variable and parameter
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        totalAccounts++; // Increment count on each new account
    }

    // Static method to get total number of accounts
    public static void getTotalAccounts() {
        System.out.println("Total number of accounts: " + totalAccounts);
    }

    // Display account details, only if it's an instance of BankAccount
    public void displayAccountDetails() {
        if (this instanceof BankAccount) {
            System.out.println("Bank Name: " + bankName);
            System.out.println("Account Holder: " + accountHolderName);
            System.out.println("Account Number: " + accountNumber);
            System.out.println("Balance: $" + balance);
            System.out.println("-----------------------------");
        } else {
            System.out.println("Invalid account object.");
        }
    }

    // Simple deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited $" + amount);
        }
    }

    // Simple withdrawal method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(1001, "Alice", 5000);
        BankAccount acc2 = new BankAccount(1002, "Bob", 3000);

        acc1.displayAccountDetails();
        acc2.displayAccountDetails();

        acc1.deposit(1000);
        acc1.withdraw(2000);
        acc1.displayAccountDetails();

        // Check total accounts
        BankAccount.getTotalAccounts();
    }
}
