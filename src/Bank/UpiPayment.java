package Bank;

public class UpiPayment extends Abstract_payment {
	public UpiPayment(double amount) {
		this.amount = amount;
	}
    @Override
    public void makePayment() {
    	System.out.println("Processing UPI Payment...");
    	printReceipt();
    }
}
