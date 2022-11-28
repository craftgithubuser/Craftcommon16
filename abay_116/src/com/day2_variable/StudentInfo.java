package com.day2_variable;

public class StudentInfo {

	public String firstName = "amisalu"; // instance variable
	int age = 44; // instance variable

	static int initcode = 1202; // static variable

	public void display() {
		double salary = 30000; // local variable

		System.out.println("Student Name: " + firstName);
		System.out.println("Student age: " + age);
		System.out.println("Student initcode: " + initcode);
		System.out.println("Student salary: " + salary);
	}
	
		public static void main(String[] atgs) {

			StudentInfo s1 = new StudentInfo();
			s1.firstName = "amisalu";
			initcode = 1201;
			s1.display();

			StudentInfo s2 = new StudentInfo();

			StudentInfo s3 = new StudentInfo();
	
		}
	}


