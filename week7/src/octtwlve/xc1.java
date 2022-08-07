package octtwlve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class xc1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
//		double[] grade = {80, 75, 65, 58, 95, 58, 95, 25, 35, 10};
//		
//		double sum = 0;
//		
//		for (int i = 0; i < grade.length; i ++) {
//			sum += grade[i];
//		}
//		
//		double avg = sum / grade.length;
//		
//		
//		System.out.println(avg);
		
//		Scanner in = new Scanner(System.in);
//		
//		System.out.println("Enter the number of students: ");
//		int student = in.nextInt();
//		
//		double grade[] = new double[student];
//		
//		double high = 0;
//		
//		System.out.println("Enter " + student + " scores: ");
//		
//		for (int i = 0; i < student; i ++) {
//			grade[i] = in.nextInt();
//		}
//		
//		for (int j = 0; j < student; j++) {
//			if (grade[j] > high)
//				high = grade[j];
//		}
//		
//		char grd = ' ';
//		for (int i = 0; i < student; i++) {
//			
//			if (grade[i] >= high - 10)
//				grd = 'A';
//			else if (grade[i] >= high - 20)
//				grd = 'B';
//			else if (grade[i] >= high - 30)
//				grd = 'C';
//			else if (grade[i] >= high - 40)
//				grd = 'D';
//			else 
//				grd = 'F';
//			
//			System.out.println("Student " + i + " score is " + grade[i] + " and grade is " + grd);
//		}
	
//		
//		double[] list = {2, 3, 4, 5};
//		
//		double[] copy = new double[4];
//		
//		for (int i = 0; i < list.length; i++) {
//			System.out.println(list[i]);
//			
//		}
//		copy = list;
//		
//		copy[0] = 10;
//		
//		for (double i: copy) {
//			System.out.println(i);
//		}
//		
//
//
//	}
//	public static double[] hey(double[] list1, double[] list2) {
//		
//		double[] result = new double[4];
//		
//		return result;

//		double sum = 0;
//		for (int i = 0; i < 3; i++) {
//			sum +=  1.0 *i / (i+1);
//		}
//		System.out.println(sum);
		
		String path = "/Users/longhai/Downloads/test.csv";
		String line = "";
		int row = 0;
		double point = 0;
		int[][] array = new int[20][3];
		String[] grade = new String[20];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			BufferedWriter bw = new BufferedWriter(new FileWriter(path));
			br.readLine();
			while ((line = br.readLine()) != null) {
				String[] data = line.split(",");
				
				for (int x = 0; x < data.length - 3; x++) {
					array[row][x] = Integer.parseInt(data[x + 3]);
				}
				row++;
				
			}
			
	
			bw.write("12312");
			bw.close();

		
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
