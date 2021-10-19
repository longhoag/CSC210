package septweneigh;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter two characters: ");
		String code = in.nextLine();
		
		String x = " ";
		String y = " ";
		
		if (code.charAt(0) == 'M')
			x = "Mathematics";
		else if (code.charAt(0) == 'C')
			x = "Computer Science";
		else if (code.charAt(0) == 'I')
			x = "Information Technology";
		
		if (code.charAt(1) == '1')
			y = "Freshman";
		else if (code.charAt(1) == '2')
			y = "Sophpmore";
		else if (code.charAt(1) == '3')
			y = "Junior";
		else if (code.charAt(1) == '4')
			y = "Senior";
			
		
		System.out.println(x + " " + y);
		
		}
		
		

	}
