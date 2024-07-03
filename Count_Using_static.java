package staticKeyword;

public class Count_Using_static {

	static int count = 0;
	Count_Using_static() //Non parameterized constructor
	{
		count++; 		//incremental value of count
		System.out.println(count); 		// count =1,2,3.
	}
	
	public static void main(String[] args) {
		
		Count_Using_static obj1 = new Count_Using_static();
		Count_Using_static obj2 = new Count_Using_static();
		Count_Using_static obj3 = new Count_Using_static();
	}

}
