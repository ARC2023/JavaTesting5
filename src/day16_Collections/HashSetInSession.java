package day16_Collections;

import java.util.*;


public class HashSetInSession {

	public static void main(String[] args) {
		
		ArrayList<String> arl1 = new ArrayList<String>(
				
					Arrays.asList(null,null,"Akshay","Akshay","Akshay","Bharti","Anjali")
				); 
		
		System.out.println("ArrayList :"+arl1);
		
		HashSet<String> setter = new HashSet<>(
				Arrays.asList(null,null,"Akshay","Akshay","Akshay","Bharti","Anjali"));
		
		System.out.println("HashSet :"+setter);
		
		for(String str:setter) {
			
			System.out.println(str);
			
		}
		
	}

}
