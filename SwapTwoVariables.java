package basic_practiceCodes;

public class SwapTwoVariables {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		/* a = a+b;
		 b = a-b;
		 a = a-b ;
		*/
		 
		// with creating third variable
		
		int t;
		t=a;
		a=b;
		b=t;
		
		
		 
		System.out.println("value of a = " + a);
		System.out.println("value of b = " + b);
		
		
		
		
		
		
	}

}
