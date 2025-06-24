class Account {
    private String accountNumber;
    protected double balance;

    void setAccountNumber(String num) {
        accountNumber = num;
    }

    String getAccountNumber() {
        return accountNumber;
    }

    void setBalance(double bal) {
        balance = bal;
    }

    double getBalance() {
        return balance;
    }
}

class SavingsAccount extends Account {
    double interestRate;

    void setInterestRate(double rate) {
        interestRate = rate;
    }

    void display() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Interest Rate: " + interestRate);
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    void setOverdraftLimit(double limit) {
        overdraftLimit = limit;
    }

    void display() {
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Overdraft Limit: " + overdraftLimit);
    }
}

public class Assignment6 {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount();
        sa.setAccountNumber("S123");
        sa.setBalance(10000);
        sa.setInterestRate(4.5);
        sa.display();

        CurrentAccount ca = new CurrentAccount();
        ca.setAccountNumber("C456");
        ca.setBalance(15000);
        ca.setOverdraftLimit(5000);
        ca.display();
    }
}
