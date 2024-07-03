package staticKeyword;

public class ChildClass {
	
	public static void main (String args[]) {
		
		ParentClass obj = new ParentClass("Alto", 2009 );
		System.out.println(obj.car + " " + obj.year);
		
		ParentClass obj2 = new ParentClass("Harrier", 2025 );
		System.out.println(obj2.car + " " + obj2.year);
	}

}
