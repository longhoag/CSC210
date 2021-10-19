package sepfourteen;

import java.util.Random;
import java.util.Scanner;
import java.lang.Math;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner input = new Scanner(System.in);
//		
//		System.out.println("Enter the radius of the circle: ");
//		
//		double radius = input.nextDouble();
//		final double PI = 3.1415;
//		
//		if (radius >= 0) {
//			double area = PI * radius * radius;
//			System.out.println("The area of the circle is " + area);
//		}
//		
//		else {
//			System.out.println("The value of radius must greater than or equal to 0");
//		}
//		
		
//		Scanner input = new Scanner(System.in);
//		Random num = new Random();
//		
//		int x = num.nextInt(10);
//		int y = num.nextInt(10);
//		int z = num.nextInt(10);
//		
//		System.out.println("3 random numbers are " + x + ", " + y + ", " + z );
//		
//		int sm = x + y + z;
//		
//		System.out.println("What is the sum of 3 numbers?");
//		
//		int s = input.nextInt();
//		
//		if (s == sm)
//		{
//			System.out.println("Good job!");
//		}
//		else {
//			System.out.println("Bad job!");
//		}
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your score on HW");
		
		double homw = input.nextDouble();
		
		System.out.println("Enter your score on Midterm");
		
		double mt = input.nextDouble();
		
		System.out.println("Enter your score on final");
		
		double f = input.nextDouble();
		
		System.out.println("Enter your score on quizzes");
		
		double q = input.nextDouble();
		
		double score = (homw * 40 / 100) + (mt / 100 * 30 / 100) + (f / 100 * 20 / 100) + (q / 50 * 10 / 100);
		
		System.out.println(score);

	}

}
