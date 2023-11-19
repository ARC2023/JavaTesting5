package day16_Collections;

import java.util.*;

public class ArrayListBasicQuestion {

	public static void main(String[] args) {
		// 17. How to remove duplicate elements from list
		/*ArrayList<Integer> arl21 = new ArrayList<Integer>(
				Arrays.asList(1, 1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 7, 7, 8, 8, 9, 10));

		System.out.println("******************* Duplicate Values ****************************");
			System.out.println(arl21);
		

		LinkedHashSet<Integer> removeDuplicate = new LinkedHashSet<Integer>(arl21);

		ArrayList<Integer> arl13 = new ArrayList<Integer>(removeDuplicate);
		System.out.println("******************* Unique Values ****************************");
		System.out.println(arl13);
*/
		// 18. How to sort and compare

		
		ArrayList<String> arrl14 = new ArrayList<String>
		(Arrays.asList("A", "B", "C", "D", "F"));
		
		ArrayList<String> arrl15 = new ArrayList<String>
		(Arrays.asList("A", "B", "C", "D", "E"));
		
		ArrayList<String> arrl16 = new ArrayList<String>
		(Arrays.asList("B", "A", "C", "D", "F"));

		/*Collections.sort(arrl14);
		Collections.sort(arrl15);
		Collections.sort(arrl16);
		
		System.out.println(arrl14.equals(arrl15));

		System.out.println(arrl14.equals(arrl16));
		
		
		// 19. How to compare two list and find additional element from list -
		// removeAll()
		arrl14.removeAll(arrl15);
		System.out.println(arrl14);
		
		
		
		// 20. How to compare two list and find missing element from list - removeAll()

		arrl15.removeAll(arrl14);
		System.out.println(arrl15);*/
		
		// 21. How to compare and find common element - retainAll(

		arrl15.retainAll(arrl14);
		System.out.println(arrl15);

	}

}
