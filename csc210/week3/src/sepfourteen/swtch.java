package sepfourteen;

import java.util.Scanner;
import java.util.Random;

public class swtch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		Random num = new Random();
		
		int x = num.nextInt(1);
		
		System.out.println("guess");
		
		int i = input.nextInt();
		
		switch (i) {
			case 5: System.out.println("Good");
				break;
			case 1: System.out.println("bad");
				break;
			default: System.out.println("Errors: invalid status");
			System.exit(1);
		}
		
//		int x = input.nextInt();
//		int y = input.nextInt();
//		
//		System.out.println(x/y);
//		System.out.println(x%y);
		

	}

}
