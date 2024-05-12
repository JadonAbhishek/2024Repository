package practice;

public class arraysPractice {

	public static void main(String[] args) {
		
		int[] a =  { 22,42,62,82,02,122,142} ;
		
	/*	a[0] = 12;
		a[1] = 13;
		a[2] = 14;
		a[3] = 15;
		a[4] = 16; */
					
		
		System.out.println("size of array = " + a.length);
		System.out.println("value of 4th element = " + a[3]);
		
		//to print all values in the array
		for (int i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		
		System.out.println("sum =" + (a[0] + a[4]) );
		
		
		// To read values using for each loop-enhanced loop
		
		for (int i : a) {
			System.out.println(i);
			

		}
		
	}

}
