package septweneigh;

import java.util.Scanner;

public class exerc {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer, the input ends if it is 0: ");
			
		int x = -1;
		int count = 0;
		int countneg = 0;
		
		while (x != 0) {
			x = in.nextInt();
			if (x < 0)
				countneg++;
			else if (x > 0)
				count++;
			
		}
		
		System.out.print(count);
		
		
		
	}

}
