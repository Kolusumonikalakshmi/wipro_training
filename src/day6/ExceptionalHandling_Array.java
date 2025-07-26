package day6;

public class ExceptionalHandling_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int[] ar= {1,2,3,4,5};
			System.out.println(ar[6]);
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Invalid index");
		}
		finally {
			System.out.println("Program completed ");
		}

	}

}
