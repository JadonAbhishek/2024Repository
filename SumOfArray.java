
package practice;

public class SumOfArray {

	public static void main(String[] args) {

		 // Declare and initialize an integer array.
        int a[] = {1, 2, 3, 4, 5, 6, 7, 8, 11, 10};
        
        // Declare and initialize a variable to store the sum.
        int sum = 0;
        
        // Iterate over each element of the array using an enhanced for loop.
        for (int i : a)
            // Add each element to the sum.
            sum += i;
        
        // Print the sum of the array elements.
        System.out.println("The sum is = " + sum);
	}
 
}
