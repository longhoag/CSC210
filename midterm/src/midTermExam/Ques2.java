// Long Hoang (Ryan)


package midTermExam;

import java.util.Scanner;

public class Ques2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a string: ");
		
		String text = in.nextLine();

		int count = 0;	
		
		for (int i = 0; i < text.length(); i++) {
			if (Character.isLowerCase(text.charAt(i)))
				count++;
		}

		// Display the results
		System.out.println("The lower case count: " + count);
	}

}
