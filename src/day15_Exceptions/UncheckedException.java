package day15_Exceptions;

public class UncheckedException {

	public static void main(String[] args) {

		int x = 10;
		int y = 0;

		int[] io= new int[3];
		
		
		System.out.println("Before dividing by zero");

		try {

			io[30]=9;
			
			//int z = x / y;

		} catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {

			System.out.println("Failed");
			e.printStackTrace();
		}

		System.out.println("After dividing by zero");
		System.out.println("After dividing by zero");
		System.out.println("After dividing by zero");
		System.out.println("After dividing by zero");
		System.out.println("After dividing by zero");		
		System.out.println("After dividing by zero");
		System.out.println("After dividing by zero");
		System.out.println("After dividing by zero");
	}

}
