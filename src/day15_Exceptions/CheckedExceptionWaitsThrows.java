package day15_Exceptions;

public class CheckedExceptionWaitsThrows {

	
	public static void main(String[] args) throws InterruptedException {
		waiter();
	}
	
	public static void waiter() throws InterruptedException {
		
		
		System.out.println("Before Wait");
		
		Thread.sleep(10000);
		
		System.out.println("After Wait");
		
		
	}
	
	
	
}
