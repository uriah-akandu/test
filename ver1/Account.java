package ver1;

public class Account {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    public static void main(String[] args) {
        Account a1 = new Account();
        a1.deposit(1000.00);
        System.out.println("Balance=$" + a1.getBalance());
    }
}