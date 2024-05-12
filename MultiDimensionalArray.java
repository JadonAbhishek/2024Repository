package practice;

public class MultiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] [] a = new int [3] [2]; // a[row] column[]
		
		a[0][0] = 12;
		a[0][1] = 14;
				
		a[1][0]	= 16;	
		a[1][1] = 18;
				
		a[2][0] = 20;
		a[2][1]	= 22;
		
			for (int i = 0; i<a.length; i++) {
				for (int j =0; j<a[0].length; j++) {
				
				System.out.println(a[i][j]);
		}
		}
			System.out.println("No. of Rows = " + a.length);
			System.out.println("No. of Colums = " + a[0].length);
		
		
			for (int[]R :a) {
				for (int colvalue:R) {
			System.out.print(colvalue);
			}
		}
	}

}
