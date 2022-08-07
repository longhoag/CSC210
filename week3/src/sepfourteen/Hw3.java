/*Name: Long Hoang (preferred name: Ryan)
Date: 9/20/2021

Project description: This program is designed to determine the fraction from users’ input is proper fraction or improper fraction. 
If users input improper fraction, the program will work as a scientific calculator and display it under mixed fraction form or integer, if the numerator is divisible by the denominator. 

Input: Numerator and denominator of a fraction.
Output: proper fraction / improper fraction (mixed fraction) / whole number.
Comment: I use double type then cast the result to int type because I want to avoid error when the input is decimal number. 
However, the result will be incorrect if the input is decimal number.
For the sake of this assignment, I consider fraction is rational number which numerator and denominator are integers!
I sent you an email about this problem, but you haven't replied. 
This assignment is due tonight so I will submit this solution to the best of my knowledge!
*/


package sepfourteen;

import java.util.Scanner;

public class Hw3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//prompt the users for input
		Scanner input = new Scanner(System.in);
		
		// prompt the user for numerator 
		System.out.println("Enter a numerator: ");
		double num = input.nextDouble();
		
		// prompt the user for denominator
		System.out.println("Enter a denominator: ");
		double denom = input.nextDouble();
		
		// calculate the whole number in mixed fraction or if num%denom = 0
		int coeff = (int) ((double)num/denom); //division
		
		
		if (num >= denom) {
			// if numerator is divisible by denominator 
			if (num % denom == 0) { 
				
				// print output
				System.out.println((int) num + " / " + (int) denom + " is an improper fraction and it can be reduced to " + coeff);
			}
			else { // the division has remainder
				
				//calculate the remainder 
				int x = (int) ((double)num%denom);
				
				// print output
				System.out.println((int) num + " / " + (int) denom + " is an improper fraction and its mixed fraction is " + coeff + " + " + x +" / " + (int) denom);
			}
		}
		else { //if num < denom
			
			// print output
			System.out.println((int) num + " / " + (int) denom + " is a proper fraction");
		}
		

	}

}