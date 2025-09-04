package classObjects.level2;

public class BankAccountMain {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Vanshika Gupta", "123456789", 5000);

        account.displayBalance();
        account.deposit(2000);
        account.withdraw(3000);
        account.withdraw(5000);
        account.displayBalance();
    }
}
