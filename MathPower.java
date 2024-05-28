package basic_practiceCodes;
import java.util.*;
public class MathPower {

	public static void main(String[] args) {
		
	Scanner s = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = s.nextDouble();
        
        // Close the scanner as we no longer need it
        s.close();
        
        // Print powers of the number from 1st to 10th
        for (int i = 1; i <= 10; i++) {
            double power = Math.pow(number, i);
		//prints the ith power of the number, formatted to 2 decimal places.
            System.out.printf("The %dth power of %.2f is %.2f%n", i, number, power);
		}
		
		
	}

}
