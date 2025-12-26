package Day4;

interface Payment{
	void pay(double amount); 
}

abstract class OnlinePayment implements Payment{
	void generateReceipt(){
		System.out.println("Receipt generated successfully");
	}
}
class CreditCardPayment extends OnlinePayment {
	 @Override
	    public void pay(double amount) {
	        System.out.println("Payment of " + amount + " done using Credit Card");
	        generateReceipt();
	    }
}

class UPIPayment extends OnlinePayment {

    @Override
    public void pay(double amount) {
        System.out.println("Payment of " + amount + " done using UPI");
        generateReceipt();
    }
}


public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Payment payment;

	        payment = new UPIPayment();   // Polymorphism
	        payment.pay(2000);
	        
	        payment = new CreditCardPayment();   // Polymorphism
	        payment.pay(4000); 
	}

}
