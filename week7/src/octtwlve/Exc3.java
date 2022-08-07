package octtwlve;

import java.util.Scanner;

public class Exc3 {
	
	public static double sum(double[][] m) {
		
		double sum = 0;
		
		for (int i = 0; i < m.length; i ++) {
			sum += m[i][i];
		}
		
		return sum;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 4x4: ");
		Scanner in = new Scanner(System.in);
		
		double[][] m = new double[4][4];
	
		
		for (int i = 0; i < 4; i ++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = in.nextDouble();
			}
		}
		
		System.out.println(sum(m));
		
		
	}

}
