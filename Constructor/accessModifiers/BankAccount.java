package Constructor.accessModifiers;

// Parent class: BankAccount
public class BankAccount {
    public String accountNumber;       // Public: accessible anywhere
    protected String accountHolder;    // Protected: accessible in subclass
    private double balance;            // Private: accessible only within this class

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Public method to get balance
    public double getBalance() {
        return balance;
    }

    // Public method to deposit money
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Public method to withdraw money
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance");
        }
    }

    // Display account details
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// Subclass: SavingsAccount
class SavingsAccount extends BankAccount {

    private double interestRate;

    // Constructor
    public SavingsAccount(String accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account info
    public void displaySavingsInfo() {
        // Accessing public and protected members of parent class
        System.out.println("Account Number: " + accountNumber);   // public: accessible
        System.out.println("Account Holder: " + accountHolder);   // protected: accessible
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Balance via getter: " + getBalance()); // private via public method
    }

    // Method to apply interest
    public void applyInterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest); // adding interest to balance
        System.out.println("Interest applied: " + interest);
    }
}

// Test class
class BankTest {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount("ACC123", "John Doe", 5000, 5.0);
        sa.displaySavingsInfo();

        sa.deposit(1000);
        sa.withdraw(2000);
        sa.applyInterest();
        sa.displaySavingsInfo();
    }
}

