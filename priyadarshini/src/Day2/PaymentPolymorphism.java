package Day2;

public class PaymentPolymorphism {
	void pay() {
        System.out.println("Payment method");
    }
}

class CashPayment extends PaymentPolymorphism {
    void pay() {
        System.out.println("Payment done using Cash");
    }
}

class CardPayment extends PaymentPolymorphism {
    void pay() {
        System.out.println("Payment done using Card");
    }

    public static void main(String[] args) {
    	PaymentPolymorphism p;

        p = new CashPayment();
        p.pay();

        p = new CardPayment();
        p.pay();
    }
}
