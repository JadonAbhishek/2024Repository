package practice;

import java.util.OptionalInt;

public class Index_of_array_element {

	public static OptionalInt findIndex(int[] my_array, int t) {
		if (my_array ==null)
			return OptionalInt.empty();
			
			int len = my_array.length;
			int i = 0;
			while (i<len) {
					
			if ( my_array[i] ==t)	
				return OptionalInt.of(i);
			else
				i = i+1;
				
			}
			return OptionalInt.empty();
			}
	
	
	
	public static void main(String[] args) {
		int [] my_array = {20, 27,30, 4235, 57, 84,35,845,84,90};
		
	findIndex(my_array, 25).ifPresent(index ->System.out.println("Index of 25" + index));
	findIndex(my_array, 57).ifPresent(index-> System.out.println("Index of 57 is:" + index));
    findIndex(my_array, 90).ifPresent(index -> System.out.println("Index position of 90 is: " + index));
	
		
	}

}
