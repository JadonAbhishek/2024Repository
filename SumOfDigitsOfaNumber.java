package basic_practiceCodes;

public class SumOfDigitsOfaNumber {

	public static void main(String[] args) {
		
		
		 int a = 42;
		
		 System.out.println("The sum of the digits is: " + sumDigits(a));	

	}
	
	public static int sumDigits(int a) {
		
		int sum = 0;
        
        // Calculate the sum of the digits
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
	}

}
