import java.util.*;

class BankAccount {
    final void generateAccountNumber() {
        System.out.println("Account number generated");
    }
}

// class SavingsAccount extends BankAccount {
//     void generateAccountNumber() {} // Error: cannot override final method
// }

public class Assignment5 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.generateAccountNumber();
    }
}
