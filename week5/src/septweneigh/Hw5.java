/*Name: Long Hoang (preferred name: Ryan)
Date: 10/3/2021

Project description: This program is designed as a game for everybody to learn calculation in mathematics. 
Users input the difficulties and arithmetic operations they want to practice. 
Program will generate expressions, and if users input the correct answer, they will earn 1 point. 
Users have the freedom to choose whether or not to continue practicing.

Input: difficulty levels, arithmetic operations, users' answer, yes to continue playing, no to end the game.
Output: Your score after playing the game.
Comment: I make the input from the users case insensitive. 
if they earn more than 1 point, print [score] points.
*/

package septweneigh;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Hw5 {
	
	// create a method to calculate expression based on arithmetic operations 
	static double calculate(double u, double v, char mark) {
		
		// declare answer value
		double ans = 0;
		
		// depending on the operation users choose that the answer value will be different
		switch (mark) {
		case '+': 
			ans = u + v;
			break;
		case '-':
			ans = u - v;
			break;
		case '/':
			ans = u / v;
			break;
		case '*':
			ans = u * v;
			break;
		case '%':
			ans = u % v;
			break;
		// throw alert if the input is invalid	
		default: System.out.println("Errors: Invalid Status");
		System.exit(1);
		}
		// round answer value to 2 decimal places
		ans = Math.round(ans * 100.0) / 100.0;
		// return the value of answer 
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// exception handling
		try {
			Scanner in  = new Scanner(System.in);
			// declare choice character to ask users if they want to continue playing 
			char choice;
			// declare score variable
			int score = 0;
			
			do {
				
				// generate random numbers
				Random num = new Random();
				// random numbers for simple 
				int x1 = num.nextInt(21) - 10;
				int y1 = num.nextInt(21) - 10;
				
				// random numbers for medium
				double x2 = Math.random() * 2001 - 1000;
				x2 = Math.round(x2 * 100.0) / 100.0;
				double y2 = Math.random() * 2001 - 1000;
				y2 = Math.round(y2 * 100.0) / 100.0;
				
				// random numbers for hard
				double x3 = Math.random() * 20001 - 10000;
				x3 = Math.round(x3 * 100.0) / 100.0;
				double y3 = Math.random() * 20001 - 10000;
				y3 = Math.round(y3 * 100.0) / 100.0;
				
				// prompt the users to choose the difficulties 
				System.out.println("Would you like (Simple, Medium, or Hard) problem?");
				String dif = in.next();
				
				// convert the input to lower case string
				dif = dif.toLowerCase();
				
				// prompt the users to choose what arithmetic operations they want to practice 
				System.out.println("What would you like to practice today (+,-,/,*,%)?");
				
				// get the character value of the operation 
				char sign = in.next().charAt(0);
				
				// declare the result variable of the calculation 
				double result = 0;
				
				// depending on what difficulties users choose that executes different statements
				switch (dif) {
				case "simple": 
					// calculate the result of the calculation using created method
					result = calculate(x1, y1, sign);
					// print the question to users
					System.out.println("What is the answer to (" + (int) x1 + " " + sign + " " + (int) y1 + ")?");
					break;
				case "medium":
					// calculate the result of the calculation using created method
					result = calculate(x2, y2, sign);
					// print the question to users
					System.out.println("What is the answer to (" + x2 + " " + sign + " " + y2 + ")?");
					break;
				case "hard": 
					// calculate the result of the calculation using created method
					result = calculate(x3, y3, sign);
					// print the question to users
					System.out.println("What is the answer to (" + x3 + " " + sign + " " + y3 + ")?");
					break;
				default: System.out.println("Errors: Invalid Input");
				System.exit(1);
				}
					
				// prompt the users to input their answer 
				double user = in.nextDouble();
				
				// check if users' answer is correct
				if (user == result) {
					score ++;
				// print the score 
					if (score > 1)
						System.out.println("Good job! Your answer is correct! You earned " + score + " points.");
					else 
						System.out.println("Good job! Your answer is correct! You earned " + score + " point.");
				}
				else {
					System.out.println("Your answer is wrong, the correct answer should be " + result + "! You earned " + score + " point.");
				}
				
				// ask the users if they want to continue playing
				System.out.println("Would you like to continue?");
				// prompt users for answer 
				choice = in.next().charAt(0);
			
				// check whether they want to continue playing or not
				if (choice == 'n' || choice == 'N') {
					// print game over, end of loops
					System.out.println("GAME OVER! Thank you for playing the game!");
					break;
				}
				
			} while (choice == 'y' || choice == 'Y'); // if they say yes, continue the loops
					
		} catch (Exception e) {
			// throw alerts if there are runtime errors 
			System.out.println("Something is wrong! The program cannot be executed!");
		} 
		
	}
}
