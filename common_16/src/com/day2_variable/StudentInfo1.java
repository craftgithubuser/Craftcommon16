package com.day2_variable;

public class StudentInfo1 {

	String firstName = "abebe"; // instance variable{
	int age = 42; // instance variable

	static int initcode = 1201; // static variable

	public void display() {
		double Salary = 30000; // local variable

		System.out.println("student Name: " + firstName);
		System.out.println("student age: " + age);
		System.out.println("student initcode: " + initcode);
		System.out.println("student Salary:" + Salary);
	}

	public static void main(String[] atgs) {

		StudentInfo1 s1 = new StudentInfo1();
		s1.firstName = "alemayehu";
		initcode = 1201;
		s1.display();

		StudentInfo1 s2 = new StudentInfo1();

		StudentInfo1 s3 = new StudentInfo1();

	}

}
