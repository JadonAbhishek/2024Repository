package package01;

import java.util.Scanner;
				//doubt how to add space b/w first name and last name
public class ScannerClass {

	public static void main(String[] args) 
	{
		Scanner s =new Scanner(System.in);
		
		System.out.println("Enter name" + " ");
		String name = s.next();
		
		System.out.println("Enter Age");
		int age = s.nextInt();
		
		System.out.println("Enter Gender");
		char gender = s.next().charAt(0);
		
		System.out.println("Enter phone number");
		long phno = s.nextLong();
		System.out.println("______________________________________");
		
		System.out.println("Name " + name);
		System.out.println("Age "+ age);
		System.out.println("Gender " + gender);
		System.out.println("Phone Number " + phno);
		
		
	}

}
