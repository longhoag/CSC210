/*Name: Long Hoang (preferred name: Ryan)
Date: 9/06/2021
Project description: The program is designed to calculate the future investment value with a given of present investment amount, interest rate, and number of years. users can predict the value, then decide whether to invest or not. 
Input: investment amount, annual interest rate, number of years.
Output: future investment value.
Comment: the result from my code is slightly different from sample tests because it includes more numbers after the decimal point than just 2
*/
package myclu210;

import java.util.Scanner;
import java.lang.Math;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		// prompt the users for input
		
		System.out.println("Enter investment amount: ");
		//prompt the users for investment amount
		double investment = input.nextDouble();
		//input investment amount
		
		System.out.println("Enter annual interest rate: ");
		//prompt the users for interest rate
		double rate = input.nextDouble();
		//input interest rate
		
		System.out.println("Enter number of years: ");
		//prompt the users for number of years
		double years = input.nextDouble();
		//input number of years
		
		double m = (rate / 100)/12;
		//calculate monthly interest rate
		
		double factor = Math.pow(1 + m,years * 12);
		//calculate 
		
		double value = investment * factor;
		//calculate the future investment value
		
		System.out.println("Accumulated value is " + value);
		//print the result 
		
			}
}
