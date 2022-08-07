package octtwlve;

import java.util.Scanner;

public class Exc4 {
	
	public static double[][] add(double[][] a, double[][] b) {
		
		double[][] c = new double[3][3];
		
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter 4x4: ");
		Scanner in = new Scanner(System.in);
		
		double[][] m = new double[3][3];
		double[][] n = new double[3][3];
	
		System.out.println("Enter 1st: ");
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				m[i][j] = in.nextDouble();
			}
		}
		
		System.out.println("Enter 2st: ");
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				n[i][j] = in.nextDouble();
			}
		}
		
		double[][] r = new double[3][3];
		
		r = add(m, n);
		
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 3; j++) {
				System.out.print(r[i][j] + " ");
			}
			System.out.println("\n");
		}

	}

}
