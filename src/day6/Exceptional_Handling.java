package day6;
public class Exceptional_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a=8;
			int b=0;
			int c=a/b;
			System.out.println(c);
		}
		catch(ArithmeticException e) {
			System.out.println("Divisible error");
		}
		finally {
			System.out.println("Program completed successfully");
		}

	}

}