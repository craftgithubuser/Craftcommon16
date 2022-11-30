package com.day8.encapsulation;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationDemo2 encap=new EncapsulationDemo2();
		encap.setFirstName("James");   //call the first name
		encap.setLastName("Adem");
		encap.setAge(34);
		encap.setSalary(1000);
		
		System.out.println("student Full Name:" + encap.getFirstName()+" "+encap.getLastName());
		System.out.println("Student Age:"+ encap.getAge());
		System.out.println("Student Salary:"+ encap.getSalary());
	}

}
