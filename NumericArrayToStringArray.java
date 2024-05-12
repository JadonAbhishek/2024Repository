package practice;

import java.util.Arrays;

public class NumericArrayToStringArray {

	public static void main(String[] args) {
		// program to sort a numeric array and a string array.
		
		int [] array1 = {200, 130, 540, 6, 89, 12,140};
		
		String [] array2 = {"Apple",  "Elephant", "Dice", "Rolex", "Biscuit" ,"Compact"};
		
		// Print the original numeric array.
		System.out.println("Orginal Numeric array = " + Arrays.toString(array1));
		
		// Sort the numeric array in ascending order.
		Arrays.sort(array1);
		
		// Print the sorted numeric array.
		System.out.println("Sorted Numeric Array = " + Arrays.toString(array1));
		
		//Print Original String Array
		System.out.println("Original String = " + Arrays.toString(array2));
		
		// Sort the String Array
		
		Arrays.sort(array2);
		
		System.out.println("Sorted String = " + Arrays.toString(array2));
	}


}
