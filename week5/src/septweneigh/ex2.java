package septweneigh;

import java.util.Scanner;

public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the number of students: ");
		int x = in.nextInt();
		
		int highscore = 0;
		String highname;
		int score = 0; 
		String name;
		for (int i = 0; i < x; i++) {
			System.out.println("Name: ");
			name = in.next();
			
			System.out.println("Enter the score: ");
			score = in.nextInt();
			
			if (highscore > score) {
				highscore = score;
				highname = name;
			}
			
		}
		
		System.out.println(score);

	}

}
