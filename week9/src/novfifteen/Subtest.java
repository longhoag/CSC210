package novfifteen;

import java.util.Date;

public class Subtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Faculty fa = new Faculty();
		fa.name = "Frank Ford";
		fa.address = "CLU";
		
		Date date = new Date();
		fa.dateHired = date.toGMTString();
		
		fa.getFaculty();
		
		

	}

}

class Person {
	String name;
	String address;
	String phone;
	String email;
	
	Person() {
		System.out.println("(1)  no-aarg constructor is invoked");
	}
	
	Person(String name, String address, String phone, String email) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.email = email;
	}
	
	
	
	
}

class Student extends Person {

	 String status = " ";
	
	Student() {
		System.out.println("(2)  no-aarg constructor is invoked");
	}
	
	Student(String status) {
		this.status = status;
	}
	
	
	
}

class Employee extends Person {
	
	String office;
	String salary;
	String dateHired;
	
	Employee() {
		System.out.println("(3)  no-aarg constructor is invoked");
	}
	
	Employee(String s) {
		System.out.println(s);
	}
	
	Employee(String office, String salary, String dateHired) {
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
}

class Faculty extends Employee {
	String officeHour;
	String rank;
	
	Faculty() {
		System.out.println("(4)  no-aarg constructor is invoked");
	}
	
	Faculty(String officeHour, String rank) {
		this.officeHour = officeHour;
		this.rank = rank;
	}
	
	public void getFaculty() {
		name = "afa";
		System.out.println(name);
	}
}

class Staff extends Employee {
	String title;
	
	Staff() {
		System.out.println("(6)  no-aarg constructor is invoked");
	}
	
	Staff(String title) {
		this.title = title;
	}
}