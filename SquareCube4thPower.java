package basic_practiceCodes;
import java.util.*;
public class SquareCube4thPower {

	
	    public static void main(String[] args) {
	        // Create a Scanner object to read input from the user
	        Scanner in = new Scanner(System.in);
	        
	        // Prompt the user to input the side length value
	        System.out.print("Input the side length value: ");
	        
	        // Read the input value as a double
	        double val = in.nextDouble();
	        
	        // Calculate and print the square of the input value
	        // %12.2f formats the output to be right-aligned within 12 characters, with 2 decimal places
	        System.out.printf("Square: %12.2f\n", val * val);
	        
	        // Calculate and print the cube of the input value
	        // %14.2f formats the output to be right-aligned within 14 characters, with 2 decimal places
	        System.out.printf("Cube: %14.2f\n", val * val * val);
	        
	        // Calculate and print the fourth power of the input value
	        // %6.2f formats the output to be right-aligned within 6 characters, with 2 decimal places
	        System.out.printf("Fourth power: %6.2f\n", Math.pow(val, 5));
	    }
	


	}


