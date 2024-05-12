package practice;

public class Test_if_an_array_contains_a_specific_value {

		// Define a method 'contains' that checks if an integer array 'arr' contains a given 'item'.
		public static boolean contains(int[] arr , int item) {
			for (int n : arr) {
				if (item == n) {
					return true;
				}
			}
			return false;
		}
		
		public static void main(String[] args) {
			int[] my_array1 = { 27, 73,90,2084, 3630, 04765, 98, 5546, 456};
		
		
		
		System.out.println(contains(my_array1, 2013));
		
		System.out.println(contains(my_array1, 3630));
		
		
		
		
	    }
	}


