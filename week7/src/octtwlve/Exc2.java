package octtwlve;

import java.util.Scanner;

public class Exc2 {
	
	public static double sum(double[][] m, int col) {
		double sum = 0;
		
		for (int i = 0; i < m.length; i++) {
			sum += m[i][col];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		
//		String[] list = new String[33];
//		for (int i = 0; i < list.length; i++) {
//			list[i] = in.nextLine();
//			if (list[i] == " ")
//				break;
//		}
//		
//		System.out.println(list.length);
		
		double[][] m = new double[3][4];
		
		System.out.println("Enter a 3-by-4 matrix row by row: ");
		
		for (int i = 0; i < 3; i ++) {
			for (int j = 0; j < 4; j++) {
				m[i][j] = in.nextDouble();
			}
		}
		
		double result = sum(m, 1);
		
		System.out.println(m[0].length);
		

	}

}
