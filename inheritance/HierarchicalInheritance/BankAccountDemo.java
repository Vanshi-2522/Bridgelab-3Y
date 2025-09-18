package inheritance.HierarchicalInheritance;
// BankAccountDemo.java

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void displayAccountType() {
        System.out.println("General Bank Account");
    }

    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

class SavingsAccount extends BankAccount {
    double interestRate;  // in percentage

    SavingsAccount(String accountNumber, double balance, double interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Savings Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

class CheckingAccount extends BankAccount {
    double withdrawalLimit;  // max withdrawal per transaction

    CheckingAccount(String accountNumber, double balance, double withdrawalLimit) {
        super(accountNumber, balance);
        this.withdrawalLimit = withdrawalLimit;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Checking Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: $" + withdrawalLimit);
    }
}

class FixedDepositAccount extends BankAccount {
    int tenure;  // in months

    FixedDepositAccount(String accountNumber, double balance, int tenure) {
        super(accountNumber, balance);
        this.tenure = tenure;
    }

    @Override
    void displayAccountType() {
        System.out.println("Account Type: Fixed Deposit Account");
    }

    @Override
    void displayDetails() {
        super.displayDetails();
        System.out.println("Tenure: " + tenure + " months");
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount("SA12345", 5000.0, 3.5);
        CheckingAccount checking = new CheckingAccount("CA67890", 2000.0, 1000.0);
        FixedDepositAccount fixedDeposit = new FixedDepositAccount("FD11223", 10000.0, 12);

        BankAccount[] accounts = { savings, checking, fixedDeposit };

        for (BankAccount acc : accounts) {
            acc.displayAccountType();
            acc.displayDetails();
            System.out.println("---------------------------");
        }
    }
}
