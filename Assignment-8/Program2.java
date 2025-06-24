import java.util.*;

interface PaymentGateway {
    void pay();
    void refund();
}

class CreditCardPayment implements PaymentGateway {
    public void pay() {
        System.out.println("Paid with credit card");
    }
    public void refund() {
        System.out.println("Refunded to credit card");
    }
}

class UPIPayment implements PaymentGateway {
    public void pay() {
        System.out.println("Paid with UPI");
    }
    public void refund() {
        System.out.println("Refunded to UPI");
    }
}

public class Assignment2 {
    public static void main(String[] args) {
        PaymentGateway p1 = new CreditCardPayment();
        p1.pay();
        p1.refund();

        PaymentGateway p2 = new UPIPayment();
        p2.pay();
        p2.refund();
    }
}
