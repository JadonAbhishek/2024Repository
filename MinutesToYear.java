package basic_practiceCodes;

import java.util.Scanner;

public class MinutesToYear {

	public static void main(String[] args) {
		
		double minutesInyear = 60*24*365;
		
		Scanner s = new Scanner (System.in);
		System.out.println("Input the numbers in minutes");
		
		double minutes = s.nextDouble();
		
		long years = (long)(minutes/minutesInyear);
		int days = (int)(minutes/60/24) % 365 ;
		
		System.out.println((int) minutes + " minutes is approximately " + years + " years and " + days + " days");

	}

}
