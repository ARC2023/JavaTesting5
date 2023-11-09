package day15_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedExceptionFileNotFoundTryCatch {

	public static void main(String[] args) {
		
		// 1. Try catch
		
		
		System.out.println("Before Try");
		try {
			
			FileInputStream file= new FileInputStream("C:\\ARC\\ARC Testing\\Java PPT\\Ex");
			Thread.sleep(1555);
		System.out.println("After  Try");
		}
		catch(InterruptedException e) {
			System.out.println("Before catch");
			e.printStackTrace();
			System.out.println("After Try");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		
		
		
	

	}

}
