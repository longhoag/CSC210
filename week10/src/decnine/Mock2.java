package decnine;

import java.util.Scanner;

public class Mock2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  = new Scanner(System.in);
		System.out.println("Enter a number in integer: ");
		
		int number = in.nextInt();
		
		System.out.println("The sum of numbers between 0 to " + number+  " is: " + getSum(number));
		
	}
	
	public static int getSum(int num) {
		int sum = 0;
		
		for (int i = 0; i <= num; i++) {
			sum = sum + i;
		}
		
		return sum;
	}

}
