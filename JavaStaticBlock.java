package staticKeyword;

public class JavaStaticBlock {
	
	static 
	{
		System.out.println("This is static block");
	}

	public static void main(String[] args) {
		
		System.out.println("This is main menthod");
		
	}

}
 // static blocks are used to initialize static data members
//  static blocks in invoked before main method during class loading
// we can't invoke application without main method