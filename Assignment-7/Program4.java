import java.util.Scanner;

class Customer {
    String customerId;
    String customerName;

    Customer(String id, String name) {
        customerId = id;
        customerName = name;
    }

    void displayCustomer() {
        System.out.println("Customer ID: " + customerId);
        System.out.println("Customer Name: " + customerName);
    }
}

class Billing extends Customer {
    double billAmount;

    Billing(String id, String name, double amount) {
        super(id, name);
        billAmount = amount;
    }

    void calculateDiscount() {
        double discount = billAmount * 0.1;
        double total = billAmount - discount;
        displayCustomer();
        System.out.println("Bill Amount: " + billAmount);
        System.out.println("Discounted Total: " + total);
    }
}

public class Assignment4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id = sc.nextLine();
        String name = sc.nextLine();
        double amount = sc.nextDouble();
        Billing b = new Billing(id, name, amount);
        b.calculateDiscount();
    }
}
