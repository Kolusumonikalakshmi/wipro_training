package Bank;

public abstract class Abstract_payment {
	protected double amount;
	public void Payment(double amount) {
		this.amount = amount;
		
	}
	public void printReceipt() {
		System.out.println("payment of $" + amount + "processed.");
		
	}
	public abstract void makePayment();
	
}
