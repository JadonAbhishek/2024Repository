package package01;

public class demo1 {

	public static void main(String[] args) {
		
		// leap year
		/*conditions for a leap year is the number is divisible by 400
		  and divisible by 4 but not divisible by 100 */
		int x = 1994;
		
	if((x%4==0) || (x%400==0 && x%100!=0)) 
	
	{
		System.out.println("Leap Year");
	}
	else {
		System.out.println("Not a Leap year");
	}
	}

}
