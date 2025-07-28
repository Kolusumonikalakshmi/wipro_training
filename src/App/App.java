package App;

import Bank.CreditCardPayment;
import Bank.UpiPayment;
import billing.BillGenerator;

public class App {

	public static void main(String[] args) {
		CreditCardPayment cs = new CreditCardPayment(20000);
		cs.makePayment();
		
		UpiPayment upi = new UpiPayment(544388);
		upi.makePayment();
		BillGenerator.displayHeader();
		BillGenerator bill = (amount)->{
			System.out.println("Amount :" +amount);
			System.out.println("thanks for your payment");
		};
		bill.showBillFormat();
		bill.generate(455598);
		

	}

}
