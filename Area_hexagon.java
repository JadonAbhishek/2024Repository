package basic_practiceCodes;

public class Area_hexagon {

	public static void main(String[] args) {
		
		double s = 6;
		
		System.out.println("Area of Hexagon = " + hexagonArea(s) +" \n");
		
		

	}
	public static double hexagonArea(double s) {
		return (6*(s*s))/(4* Math.tan(Math.PI/6));
		
	}
}
