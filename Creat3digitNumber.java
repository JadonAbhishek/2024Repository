package basic_practiceCodes;
import java.util.*;
public class Creat3digitNumber {
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        // Taking four different integers as input from the user
        System.out.println("Enter the first integer:");
        int a = scanner.nextInt();
        
        System.out.println("Enter the second integer:");
        int b = scanner.nextInt();
        
        System.out.println("Enter the third integer:");
        int c = scanner.nextInt();
        
        System.out.println("Enter the fourth integer:");
        int d = scanner.nextInt();
        
        scanner.close();

        int[] digits = {a, b, c, d};
        int count = 0;

        System.out.println("Unique three-digit numbers:");

        // Generate all permutations using nested loops
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                
                for (int k = 0; k < 4; k++) {
                	 if (k != i && k != j && i != j) {
                    int number = digits[i] * 100 + digits[j] * 10 + digits[k];
                    System.out.println(number);
                    count++;
                }
            }
        }
        }
        // Display the count of unique three-digit numbers
        System.out.println("Total number of unique three-digit numbers: " + count);
    }
	}
