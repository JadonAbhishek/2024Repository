package practice;

public class marriage {

	public static void main(String[] args) {
		
		int age = 9;
		String gender = "female";
		
		
		if (gender =="male"){
			if (age>=18) {
				System.out.println("Male is eligible bcz age = " + age);
			}
			else {
				System.out.println("Male is not eligible bcz age = " + age);
				}}
			else if (gender=="female") {
			
				if (age>=18) {
				System.out.println("Female is eligible bcz age =" + age);
			}
			
			else {
				System.out.println("Female is not eligible bcz age = " + age);	
				}}
			else {
				System.out.println("invalid input");
			
		} 
		
	}

}
