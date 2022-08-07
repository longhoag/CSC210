/*Name: Long Hoang (preferred name: Ryan)
Date: 10/19/2021

Project description: The program is designed to read the provided CSV file and write the grade of each student after calculating their final scores. 
The program works like a excel sheet to write in the final grades. 
This program can be useful for someone who works with data in file. 
The requirements for this program are being able to read and write the grades.

Input: the csv file of students' scores.
Output: a new file with grade letter for each student.
Comment: 
- the program writes a new different file with grade letters. 
Because if it writes on the same file, the code will be useless when execute again (the structure of file is changed).
Also, it is more convenient to have a different file.
- the grading scale i choose is match with that in your syllabus.
- Buffered... methods are listed in the book, used for read and write files.
- i use two dim array to store score data, because it is the only way to calculate final score.
- i read the file again before writing because the previous read method has broken down the data. 
Read once again allow to write the data with grades letters at the end of each line.

*/


package octtwlve;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;


public class Hw7 {
	
	// method to calculate the students' final score 
	public static double score(int[][] a, int i, int j) {
		// calculate score based on location in the array 20x3
		int x = a[i][j];
		int y = a[i][j+1];
		int z = a[i][j+2];
		
		double result = 0.2 * x + 0.5 * y + 0.3 * z;
		
		return result;
	}
	
	// method to change 10 scale to grading scale 
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
		
		// define location of the csv file 
		String path = "/Users/longhai/Developer/csc210/studentgradedatabase.csv";
		String line = "";
		int row = 0;
		// declare point variable for students' final score 
		double point = 0;
		// define an array of students' score 20x3
		int[][] array = new int[20][3];
		// define an array storing 20 grades of 20 students 
		String[] grade = new String[20];
		// define an array for storing content of csv file 
		String[] content = new String[20];
		
		try {
			// read the csv file
			BufferedReader br = new BufferedReader(new FileReader(path));
			// read the first line in the file and skip it
			String firstLine = br.readLine();
			
			// read the file till it has no more data to read
			while ((line = br.readLine()) != null) {
				
				// separate data by "," and store it into an array
				String[] data = line.split(",");
				
				// get the two dim array of student's scores
				for (int col = 0; col < data.length - 3; col++) {
					// split an array into different chunks, array of array -> two dim array
					array[row][col] = Integer.parseInt(data[col + 3]);
				}
				row++;
			}
			
			// calculate the score based on value in the array 
			for (int i = 0; i < 20; i++) {
				point = score(array, i, 0);
				// convert them to grades 
				grade[i] = grade(point);
			}
			// create a new file to write data
			FileWriter fw = new FileWriter("gradingFile.csv",true);
			BufferedWriter bw = new BufferedWriter(fw);
			
			// read the csv file again 
			BufferedReader rd = new BufferedReader(new FileReader(path));
			
			// looping to read the data 
			while ((line = rd.readLine()) != null) {
				
				for (int i = 0; i < 20; i++) {
					// store each line of the file into a value of an array
					content[i] = rd.readLine();		
				}
			}
			// write the first line, the headline in the table
			bw.write(firstLine + "\n");
			
			for (int i = 0; i < 20; i++) {
				// write the previous content of the file adding the grade at the end of each line after first line 
				bw.write(content[i] + grade[i] + "," + "\n");
			}
			// close write stream
			bw.close();
			
			// notify users we have successfully written the file 
			System.out.println("File has been graded! Check graded file at gradingFile.csv !");
		
			// if there are errors, notify the users 
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File cannot be found!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
