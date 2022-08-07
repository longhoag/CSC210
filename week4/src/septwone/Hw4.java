/*Name: Long Hoang (preferred name: Ryan)
Date: 9/26/2021

Project description: This program is designed as a word game for entertainment. 
Users enter the name of city, country, people, animal, food and get their score based on the characters from their inputs match with the letter that the game generates. 
The highest score is 50, and the lowest score is 0. 

Input: Name of city, country, people, animal, food.
Output: Your score after playing the game.
Comment: I make the input from the users case insensitive. 
The middle letter will follow the algorithm! if there is no middle letter (length is even), it will take the right character of 2 middle letters.
For the sake of simplicity, I didn't verify user's inputs whether they were the name of city, country, food, etc. or not. I did this problem to the best of my knowledge.
*/


package septwone;

import java.util.Random;
import java.util.Scanner;

public class Hw4 {
	
	// create a method to calculate the score to reduce repetitiveness 
	static int checkPoint(String word, int sign) {
		
		// declare variable of scoring points
		int pts = 0;
			
		// get the length of the string
		int lngth = word.trim().length();
			
		// convert string to uppercase letter
		word = word.toUpperCase();
		
		// calculate score based on the rule of the game
		if (word.charAt(0) == sign)
			pts += 10;
		
		else if (word.charAt(lngth/2 + 1) == sign) 
			pts += 5;
		
		else if (word.charAt(lngth - 1) == sign) 
			pts += 2;
			
		// return the value of score for this method 
		return pts;
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// generate random number
		Random num = new Random();
		
		// change to decimal value of uppercase character according to ASCII table
		int let = num.nextInt(25) + 65;
		char letter = (char)let;
		
		// declare score variable
		int score = 0;
		
		//prompt the users for input
		Scanner input = new Scanner(System.in);
		
		//print the instructions
		System.out.println("***Welcome to Fun Game with Letters****");
		System.out.printf("Instructions: enter a City, Food, A Person Name, Country, and Animal that contains the given letter.%n10 point if the first letter matches, 5 point if the middle letter matches, and 2 point if the last letter matches.%nTotal score is 50 points.%n%n");
		
		// prompt the user for city name
		System.out.println("Enter a City name that contains " + letter + ":");
		String city = input.nextLine();
		
		// calculate score based on input using created method
		score = checkPoint(city, let);
		
		// prompt the user for country name
		System.out.println("Enter a Country that contains " + letter + ":");
		String country = input.nextLine();
		
		// calculate score based on input using created method
		score += checkPoint(country, let);
		
		// prompt the user for name
		System.out.println("Enter a Name that contains " + letter + ":");
		String name = input.nextLine();
		
		// calculate score based on input using created method
		score += checkPoint(name, let);
		
		// prompt the user for animal name
		System.out.println("Enter a Animal that contains " + letter + ":");
		String animal = input.nextLine();
		
		// calculate score based on input using created method
		score += checkPoint(animal, let);
		
		// prompt the user for food name
		System.out.println("Enter a Food that contains " + letter + ":");
		String food = input.nextLine();
		
		// calculate score based on input using created method
		score += checkPoint(food, let);
		
		
		// print the final score 
		if (score == 50)
			System.out.println("Congratulations! You win the highest score " + score);
		else 
			System.out.println("Your score is " + score);

	}

}
