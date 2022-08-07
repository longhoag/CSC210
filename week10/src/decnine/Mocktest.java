package decnine;

import java.util.ArrayList;
import java.util.Scanner;


public class Mocktest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in  = new Scanner(System.in);
		Student myStudent = new Student();
		double highestScore = 0;
		
		
		myStudent.addStudent("Henry Nguyen", 3.5);
		myStudent.addStudent("Brenda Stern", 2.0);
		myStudent.addStudent("Lynda Robinson", 3.2);
		myStudent.addStudent("Sonya King", 3.9);
		
		String[] person = myStudent.getName();
		
		double[] grade = myStudent.getGPA();
		
		int index = myStudent.highestScore(grade);
		
		System.out.println(person[index] + " " + grade[index]);
		
	
	}

}
class School {
	School() {
		
	}
}

class Student {
	
	private String name;
	private double score;
	private int number;
	private String[] stu = new String[4];
	private double[] high = new double[4];
	
	Student() {
		name = " ";
		score = 0;
	}
	
	Student(String name, double score) {
		name = this.name;
		score = this.score;
	}
	
	public void addStudent(String student, double score) {
		high[number] = score;
		stu[number] = student;
		number++;
	}
	
	public double[] getGPA() {
		return high;
	}
	public String[] getName() {
		return stu;
	}
	
	
	public int highestScore(double[] high) {
		
		double highest = 0;
		int a = 0;
		
		for (int i = 0; i < 4; i++) {
			if (high[i] > highest) {
				highest = high[i];
			}
			
			a = i;
		}
		//return highest;
		return a;
	}
	
	void print() {
		System.out.println("Top Student: ");
	}
}
