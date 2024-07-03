package staticKeyword;

public class Count {

	int c =0;
	
	Count()
	{
		c++;
		System.out.println(c);
	}
	public static void main(String[] args) {
		
		Count obj1 = new Count ();
		Count obj2 = new Count ();
		Count obj3 = new Count ();

	}

}
