/*Name: Long Hoang (preferred name: Ryan)
Date: 9/13/2021

Project description: This program is designed to convert European units of measurement to U.S. units. 
This code is required to generate accurate number of the conversion and clear up the confusion when foreigners first come to the United States. 
Users from Europe or anywhere on the globe using the EU units can benefit from this program. 

Input: EU units of measurement.
Output: U.S. units of measurement.
Comment: the result from my code is slightly different from sample tests because it includes more numbers after the decimal point than just 2
*/
package myCLu;

import java.util.Scanner;

public class Hw2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// prompt the users for input
		Scanner input = new Scanner(System.in);
		
		
		// prompt the users 
		System.out.println("Enter European Units!");
		
		// prompt the users for celsius value
		System.out.println("Celsius: ");
		double celcius = input.nextDouble();
		
		// prompt the users for centimeter value
		System.out.println("Centimeter: ");
		double cm = input.nextDouble();
		
		// prompt the users for meter value
		System.out.println("Meter: ");
		double m = input.nextDouble();
		
		// prompt the users for square meter value
		System.out.println("Square Meter: ");
		double sqm = input.nextDouble();
		
		
		// prompt the users for liter value
		System.out.println("Liter: ");
		double l = input.nextDouble();
		
		// prompt the users for gram value
		System.out.println("Gram: ");
		double g = input.nextDouble();
		
		// prompt the users for kilogram value
		System.out.println("Kilogram: ");
		double kg = input.nextDouble();
		
		// calculate the fahrenheit value
		double f = (celcius * 9.0/5) + 32;
		
		// calculate the inch value
		double inch = cm / 2.54;
		
		// calculate the foot value
		double ft = m * 3.28084;
		
		// calculate the square foot value
		double sqft = sqm * 10.7639;
		
		// calculate the gallon value
		double gal = l / 3.78541;
		
		// calculate the ounce value
		double oz = g / 28.3495;
		
		// calculate the pound value
		double lbs = kg * 2.20462;
		
	
		// print the results as table
		
		System.out.println("European Units " + "         " + " US Units" + "\n"); 
		System.out.println("Celsius = " + celcius + "           " + "Fahrenheit = " + f); 
		System.out.println("Centimeter = " + cm + "        " + "Inch = " + inch); 
		System.out.println("Meter = " + m + "            " + "Foot = " + ft); 
		System.out.println("Square Meter = " + sqm + "     " + "Square Foot = " + sqft);
		System.out.println("Liter = " + l + "             " + "US gallon = " + gal); 
		System.out.println("Gram = " + g + "              " + "Ounce = " + oz);
		System.out.println("Kilogram = " + kg + "          " + "Pound = " + lbs);
		
	}

}
