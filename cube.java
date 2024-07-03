package staticKeyword;

public class cube {

	static int a(int x) 
	{
		return x*x*x;
	}
	
	public static void main(String[] args) {
		
		  int result = cube.a(5);  
		  System.out.println("Cube of given number = " + result);  

	}

}
