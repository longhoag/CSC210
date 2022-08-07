package novfifteen;

public class Newtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Course {
	private String courseName;
	private String[] student = new String[100];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public String getCourseName() {
		return courseName;
	}
	
	public int getStudents() {
		return numberOfStudents;
	}
	public void addStudents(String students) {
		student[numberOfStudents] = students;
		numberOfStudents ++;
	}
	public void dropStudent(String student) {

		numberOfStudents --;
	}
}

class BMI {
	
	String name;
	int age;
	double weight;
	double height;
	
	public BMI(String name, int age, double weight, double height) {
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height;
	}
 	
	public BMI(String name, double weight, double height) {
		this(name, 20, weight, height);
	}
	
	public BMI(String name, int age, double weight, double feet, double inches) {
	
	}
}