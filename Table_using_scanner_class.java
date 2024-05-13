package basic_practiceCodes;

import java.util.Scanner;

public class Table_using_scanner_class {

	public static void main(String[] args) {
		
		
		
		Scanner s = new Scanner(System.in);
		System.out.println("Input a number");
		
		int number = s.nextInt();
		
		for (int i = 0; i<10; i++) {
			
			System.out.println(number + " x " + (i+1) + "= " + (number*(i+1)) );
		}
		
		
		
	}

}
