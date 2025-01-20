// BankingSystem.java

// Placeholder code for Simple Banking System
public class BankingSystem {
    static class BankAccount {
        String accountHolder;
        double balance;

        public BankAccount(String accountHolder, double balance) {
            this.accountHolder = accountHolder;
            this.balance = balance;
        }

        public void deposit(double amount) {
            balance += amount;
            System.out.println(amount + " deposited. Current balance: " + balance);
        }

        public void withdraw(double amount) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(amount + " withdrawn. Current balance: " + balance);
            } else {
                System.out.println("Insufficient funds");
            }
        }

        public void getBalance() {
            System.out.println("Current balance: " + balance);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to the Simple Banking System!");
        BankAccount account = new BankAccount("Akshit", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.getBalance();
    }
}
