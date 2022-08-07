package novfour;

public class Exx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fan my = new Fan();
		System.out.println("Fan speed is " + my.getSpeed());

	}

}

class Fan {
	final int SLOW = 1;
	final int MEDIUM = 2;
	final int FAST = 3;
	
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	String color = "blue";
	
	Fan() {
		
	}
	
	public void setSpeed(int newSpeed) {
		speed = newSpeed;
	}
	
	public int getSpeed() {
		return speed;
	}
	
}