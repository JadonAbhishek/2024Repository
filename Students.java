package staticKeyword;

public class Students {

	String name;
	String Branch;
	int YOA;
	static String collegeName = "DEI Tech"; 
	Students(String Name,String branch, int yr){
		
		name   = Name;
		Branch = branch;
		YOA    = yr;
	}
	
	public static void main(String[] args) {
		
		Students obj1 = new Students("Abhishek Jadon", "Mechanical" , 2015);
		System.out.println(obj1.name + ", " + obj1.Branch + ", " + obj1.YOA + ", " + Students.collegeName);
		
		Students obj2 = new Students("Arpit", "Mechanical" , 2016);
		System.out.println(obj2.name + ", " + obj2.Branch + ", " + obj2.YOA + ", " + Students.collegeName);
	}

}
