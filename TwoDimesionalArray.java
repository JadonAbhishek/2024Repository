package practice;

public class TwoDimesionalArray {

	public static void main(String[] args) {
		
		int [] [] a = new int [6][6];
		
		for(int i=0; i<6; i++) {
			for(int j=0; j<6; j++) {
				
				System.out.printf("%6d" , a[i][j]);
			}
			System.out.println();
		}

		

	}

}
