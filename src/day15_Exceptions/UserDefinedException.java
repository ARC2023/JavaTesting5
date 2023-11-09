
package day15_Exceptions;

public class UserDefinedException {

	public static void main(String[] args) throws Exception {
		
		
		System.out.println("Before breaking");
		
		throw new Exception("I want to fail this test case");
		
		//System.out.println("After breaking");
		
		
	}

}
