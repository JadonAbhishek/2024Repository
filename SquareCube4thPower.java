package basic_practiceCodes;
import java.util.*;
public class SquareCube4thPower {

	public static void main(String[] args) {
		
		Scanner s = new Scanner (System.in);
		
		System.out.println("Enter the number");
		double a = s.nextDouble();
		
		double sqaure = a*a;
		System.out.println("Square of given number =" + sqaure);
		
		double cube = a*a*a;
		System.out.println("Cube of given number =" + cube );		
		
		double fourthPower = a*a*a*a;
		System.out.println("Fourth power of given number =" + fourthPower);	
		
		s.close();

	}

}
