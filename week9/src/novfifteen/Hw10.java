/*Name: Long Hoang (preferred name: Ryan)
Date: 11/17/2021

Project description: This program utilizing class and object in Java to manage and get the data of car’s information. 
The program takes input of car’s model, model year, purchase price and outputs the data added current value of that car with specific value degradation percentage.

Input: car's model, car's model year, current year, car's purchase price
Output: 
- car's information
+ model year
+ purchase price
+ current value
Comment: - i added more details to this project
- i added car's model name
- i manage to get input from the users instead of hard-coding the system 
- i set the value degradation percentage to 1% per year
*/


package novfifteen;

import java.util.Scanner;

public class Hw10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car myCar = new Car();
		
		Scanner in = new Scanner(System.in);
		
		// ask for input from the user for car's model
		System.out.println("What is your car's model?");
		String model = in.nextLine();
		
		// ask for input from the user for car's model year
		System.out.println("What is your car's model year?");
		int modelYear = in.nextInt();
		
		// ask for input from the user for current year
		System.out.println("What is the current year?");
		int year = in.nextInt();
		
		// ask for input from the user for purchase price
		System.out.println("What is your car's purchase price?");
		double price = in.nextDouble();
		
		// set the car's model name
		myCar.model(model);
		
		// set model year
		myCar.setModelYear(modelYear);
		
		// set the purchase price
		myCar.setPurchasePrice(price);
		
		// calculate the current value of the car after degrading
		myCar.calcCurrentValue(year);
		
		// print the car's information
		myCar.printInfo();

	}

}
class Car {
	private int modelYear;
	private double currentValue;
	private double price;
	String carModel = "";
	
	// non-arg constructor 
	Car() {

	}
	
	// method
	public void model(String carModel) {
		this.carModel = carModel;
	}
	
	public void setModelYear (int userYear) {
		modelYear = userYear;
	}
	
	public int getModelYear() {
		return modelYear;
	}
	
	public double setPurchasePrice(double price) {
		return this.price = price;
	}
	
	public double getPurchasePrice() {
		return price;
	}
	public void calcCurrentValue(int currentYear) {
		double rate = 1 - 0.01;
		double year = currentYear - modelYear;
		// calculate the current value degraded over time
		currentValue = price * Math.pow(rate, year);
	}
	
	public void printInfo() {
		System.out.println("Car's information: " + carModel);
		System.out.println("\tModel Year: " + modelYear);
		System.out.println("\tPurchase Price: $" + price);
		System.out.println("\tCurrent Value: $" + currentValue);
	}
}