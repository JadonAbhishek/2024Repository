package practice;

public class Avg_value_of_array_elements {

	public static void main(String[] args) {
		
		
		int [] a = {20, 40,45,90,89,67,76,37};
		
		int sum =0;
		
		// Use a for loop to iterate over the elements of the 'numbers' array.
		for(int i =0; i< a.length; i++) {
			
			// Add the current element to the sum
			sum = sum + a[i];
		}
		
		// Calculate the average value by dividing the sum by the number of elements.
		double avg = sum/a.length;

		System.out.println("Average value of the array elements is : " + avg); 
	}
	
	 
	

}
