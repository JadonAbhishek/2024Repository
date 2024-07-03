package staticKeyword;

public class Students2 {

	int YOA;
	String name;
	static String collegeName = "Dayalbagh Technical";
	
	Students2(int year, String Name){
		
		YOA = year;
		name = Name;
	}
	void display ()
	{
		System.out.println(name + ", " + YOA +" " + collegeName);
	}
	static void changeValue()
	{
		collegeName = "Radhaballabh";
	}
	
	public static void main(String[] args) {
		
		Students2 obj1 = new Students2(2016, "Rajan");
		
		Students2 obj2 = new Students2(2016 , "Arjun");
		
		obj1.display();
		obj2.display();
		
		changeValue(); //in case to change college name (to call row 18)
		
		System.out.println("changed college name");
		
		obj1.display();
		obj2.display();

	}
	}


