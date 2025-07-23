package Bank;

public class CreditCardPayment extends Abstract_payment{
	public CreditCardPayment(double amount) {
		this.amount = amount;
		
	}
	@Override
	public void makePayment() {
		System.out.println("processing Credit Card Payment...");
		printReceipt();
	}

}
