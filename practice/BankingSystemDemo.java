package practice;

abstract class Account {
    protected String accountNumber;
    protected double balance;

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ", New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount + ", Remaining balance: " + balance);
        } else {
            System.out.println("Invalid or insufficient funds for withdrawal.");
        }
    }

    public abstract void calculateInterest();

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }
}

class SavingsAccount extends Account {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added to SavingsAccount: " + interest + ", New balance: " + balance);
    }
}

class CurrentAccount extends Account {
    private double interestRate;

    public CurrentAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    @Override
    public void calculateInterest() {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest added to CurrentAccount: " + interest + ", New balance: " + balance);
    }
}

public class BankingSystemDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SAV123", 1000, 4.0);
        CurrentAccount current = new CurrentAccount("CUR456", 2000, 1.0);

        savings.deposit(500);
        savings.withdraw(200);
        savings.calculateInterest();

        System.out.println();

        current.deposit(1000);
        current.withdraw(500);
        current.calculateInterest();
    }
}
