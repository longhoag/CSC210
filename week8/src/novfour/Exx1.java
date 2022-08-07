package novfour;

import java.util.Date;

public class Exx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StopWatch time = new StopWatch();
		
		time.start();
		System.out.println("Timer started!");
		
		System.out.println("Timer stopped!");
		
		
		

	}

}

class StopWatch {
	private long startTime;
	private long endTime;
	Date date = new Date();
	
	StopWatch() {
		
		startTime = date.getTime();
	}
	
	public void start() {
		startTime = date.getTime();
	}
	public void stop() {
		endTime = date.getTime();
	}
	
}