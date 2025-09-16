package objectmodeling;

import java.util.ArrayList;

// Bank class
class Bank {
    private String bankName;
    private ArrayList<Customer> customers;

    public Bank(String bankName) {
        this.bankName = bankName;
        this.customers = new ArrayList<>();
    }

    // Method to open an account for a customer
    public void openAccount(Customer customer) {
        customers.add(customer);
        customer.setBank(this);
        System.out.println("Account opened for " + customer.getName() + " in " + bankName);
    }

    public String getBankName() {
        return bankName;
    }

    public void showCustomers() {
        System.out.println("Customers of " + bankName + ":");
        for (Customer c : customers) {
            System.out.println("- " + c.getName());
        }
    }
}

// Customer class
class Customer {
    private String name;
    private ArrayList<Double> accounts; // Each double represents an account balance
    private Bank bank;  // Association (reference to Bank)

    public Customer(String name) {
        this.name = name;
        this.accounts = new ArrayList<>();
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public String getName() {
        return name;
    }

    // Open a new account with an initial deposit
    public void openNewAccount(double initialDeposit) {
        accounts.add(initialDeposit);
        System.out.println("New account opened for " + name + " with ₹" + initialDeposit);
    }

    // View all balances
    public void viewBalance() {
        System.out.println("Account balances for " + name + " in " + bank.getBankName() + ":");
        int i = 1;
        for (double balance : accounts) {
            System.out.println("  Account " + i + ": ₹" + balance);
            i++;
        }
    }
}

// Main class
public class BankAssociationDemo {
    public static void main(String[] args) {
        // Create bank
        Bank sbi = new Bank("State Bank of India");

        // Create customers
        Customer customer1 = new Customer("Anjali Sharma");
        Customer customer2 = new Customer("Rahul Verma");

        // Associate customers with the bank
        sbi.openAccount(customer1);
        sbi.openAccount(customer2);

        // Customers open their own accounts (with initial deposits)
        customer1.openNewAccount(10000.0);
        customer1.openNewAccount(5000.0);

        customer2.openNewAccount(15000.0);

        // View balances
        customer1.viewBalance();
        customer2.viewBalance();

        // Bank shows all customers
        sbi.showCustomers();
    }
}
