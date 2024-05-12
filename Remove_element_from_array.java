package practice;

import java.util.Arrays;

public class Remove_element_from_array {

	public static void main(String[] args) {
		int [] myarray = {25,14,56,36,15,77,18,29,49};
		System.out.println("Original array = " + Arrays.toString(myarray));

		int removeIndex = 7;
		int removedElement = myarray[removeIndex];
		for (int i = removeIndex; i<myarray.length - 1; i++) {
			myarray [i] = myarray[i+1];
			
		}
		 // Resize the array to remove the last element
		 myarray = Arrays.copyOf(myarray, myarray.length - 1);
		
		System.out.println("Removed Element= " + removedElement );
		System.out.println("Array after removing" + Arrays.toString(myarray));	}

}
