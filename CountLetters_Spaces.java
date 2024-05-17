package basic_practiceCodes;

public class CountLetters_Spaces {

	public static void main(String[] args) {
		
		String test = "Ram Ram Jai Raja Ram Ram Ra Jai Seeta Raam.....1008";
		
		count (test);
		
	}
		public static void count(String x) {
			char [] ch = x.toCharArray();
			
			int letter = 0;
			int spaces = 0;
			int num = 0;
			int other = 0;
		
			for (int i=0; i< x.length(); i++) {
				if (Character.isLetter(ch[i])) {
					letter++;
				}
				
				else if (Character.isSpaceChar(ch[i])) {
					spaces++;
					
				}
				
				else if(Character.isDigit(ch[i])) {
					num++;
				}
				
				else {
					other++;
				}
			}
				System.out.println("The string is :Ram Ram Jai Raja Ram Ram Ram Jai Seeta Raam......1008\"");
		        
				System.out.println("letter: " + letter);
		        System.out.println("space: " + spaces);
		        System.out.println("number: " + num);
		        System.out.println("other: " + other);
			}
}
		



