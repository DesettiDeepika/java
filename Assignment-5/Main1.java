class BankAccount {
    int accountNumber;
    String name;
    double balance;

    // Constructor with account number only
    BankAccount(int accNo) {
        accountNumber = accNo;
        name = "Unknown";
        balance = 0.0;
    }

    // Constructor with account number and name
    BankAccount(int accNo, String accName) {
        accountNumber = accNo;
        name = accName;
        balance = 0.0;
    }

    // Overloaded deposit methods
    void deposit(int amount) {
        balance += amount;
        System.out.println("Deposited (int): ₹" + amount);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited (double): ₹" + amount);
    }

    // Overloaded withdraw methods
    void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: ₹" + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void display() {
        System.out.println("Account Number: " + accountNumber + ", Name: " + name + ", Balance: ₹" + balance);
    }
}

public class Main1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(1001);
        BankAccount b2 = new BankAccount(1002, "Anvitha");

        b1.deposit(5000);
        b1.withdraw(2000);
        b1.display();

        b2.deposit(1000.50);
        b2.withdraw(500.25);
        b2.display();
    }
}
