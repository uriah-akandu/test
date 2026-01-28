package ver2;

public class Account {

    // instance variable
    private double balance;

    // constructor
    public Account(double initialBalance) {
        balance = initialBalance;
    }

    // getter
    public double getBalance() {
        return balance;
    }

    // deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // withdraw method
    public void withdraw(double amount) {
        if (amount > 0) {
            balance -= amount;
        }
    }

    // toString override
    @Override
    public String toString() {
        return "Balance=$" + balance;
    }

    // main method (test code)
    public static void main(String[] args) {
        Account a1 = new Account(1000.0);

        a1.deposit(1000.0);
        System.out.println("Balance=$" + a1.getBalance());

        a1.withdraw(200.0);
        System.out.println("Balance=$" + a1.getBalance());

        System.out.println(a1.toString());
        System.out.println(a1);
    }
}