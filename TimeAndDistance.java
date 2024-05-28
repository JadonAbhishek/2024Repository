package basic_practiceCodes;

import java.util.Scanner;

public class TimeAndDistance {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Input distance in meters");
		double meters = s.nextDouble();
		
		System.out.println("Input hour");
		double hours = s.nextDouble();
		
		
		System.out.println("Input minutes");
		double minutes = s.nextDouble();
		
		System.out.println("Input seconds");
		double seconds = s.nextDouble();
		
		double timeSeconds = (hours*3600) + (minutes*60) + seconds;
		
		double SpeedInMPS = meters/timeSeconds;
		
		double SpeedInKmph = (meters*18)/(timeSeconds*5);
		
		double SpeedInMPH = SpeedInKmph/(1.6);
		
		System.out.println("Speed in MPS =" + SpeedInMPS + " mtr/sec");
		System.out.println("Speed in Kmph =" + SpeedInKmph + " km/hr");
		System.out.println("Speed in MPH =" + SpeedInMPH + " mile/hr");

	}

}
