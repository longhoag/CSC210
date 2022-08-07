package octtwlve;

import java.util.Scanner;

public class Quiz4no1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double minMiles;
		double maxMiles;
		
		System.out.println("Enter number of values: ");
		int x = in.nextInt();
		double[] n = new double[x];
		System.out.println("Input your list of values: ");
		
		
		for (int i = 0; i < x; i++) {
			n[i] = in.nextDouble();
		}
		
		maxMiles = n[0];
		minMiles = n[0];
		for (int i = 1; i < x; i++) {
			if (n[i] > maxMiles)
				maxMiles = n[i];
			
			if (n[i] < minMiles)
				minMiles = n[i];
		}
		
		
		System.out.println("Max value is: " + maxMiles);
		System.out.println("Min value is: " + minMiles);
	}

}
