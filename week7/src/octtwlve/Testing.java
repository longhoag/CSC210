package octtwlve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Testing {
	
	public static double score(int[][] a, int i, int j) {
		
		int x = a[i][j];
		int y = a[i][j+1];
		int z = a[i][j+2];
		
		double result = 0.2 * x + 0.5 * y + 0.3 * z;
		
		return result;
		
	}
	
	public static String grade(double n) {
		String grade = " ";
		if (n >= 95 && n <= 100) 
			grade = "A";
		else if (n >= 90 && n < 95)
			grade = "A-";
		else if (n >= 87 && n < 90)
			grade = "B+";
		else if (n >= 83 && n < 87)
			grade = "B";
		else if (n >= 80 && n < 83)
			grade = "B-";
		else if (n >= 77 && n < 80)
			grade = "C+";
		else if (n >= 73 && n < 77)
			grade = "C";
		else if (n >= 70 && n < 73)
			grade = "C-";
		else if (n >= 67 && n < 70)
			grade = "D+";
		else if (n >= 63 && n < 67)
			grade = "D";
		else if (n >= 60 && n < 63)
			grade = "D-";
		else 
			grade = "F";
		
		return grade;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String path = "/Users/longhai/Downloads/test.csv";
		String line = "";
		int row = 0;
		double point = 0;
		int[][] array = new int[20][3];
		String[] grade = new String[20];
		String[] hey = new String[21];
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			String m = br.readLine();

			
			while ((line = br.readLine()) != null) {
				
				
				
				String[] data = line.split(",");
				

				for (int x = 0; x < data.length - 3; x++) {
					array[row][x] = Integer.parseInt(data[x + 3]);

				}
				row++;
			
			}
			
			for (int i = 0; i < 20; i++) {
				point = score(array, i, 0);
				grade[i] = grade(point);
			}
			
			
			
			//System.out.println(real[0]);
			
	//		BufferedReader brd = new BufferedReader(new FileReader(path));
			
			FileWriter fw = new FileWriter("output.csv",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			BufferedReader brd = new BufferedReader(new FileReader(path));

			while ((line = brd.readLine()) != null) {
				
				for (int i = 0; i < 20; i++) {
					hey[i] = brd.readLine();
					System.out.println(hey[i]);
				}
			}
			
			
			bw.write(m + "\n");
			for (int i = 0; i < 20; i++) {
				bw.write(hey[i] + grade[i] + "," + "\n");
			}
			bw.close();
//			
//			String[][] real = new String[21][7];
//			for (int i = 0; i < 21; i++) {
//				for (int j = 0; j < 7; j++) {
//					
//					while ((line = br.readLine()) != null) {
//						real[i][j] = line;
//						
//						
//						System.out.println(real[1][0]);
//					
//					}
//					
//				}
//			}
			
			
			

			
		
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
