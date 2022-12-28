package com.day8.encapsulation;

public class EncapsulationDemo2 {
	
	private String firstName;
	private String lastName;
	private int age;
	private double salary;
	public String getFirstName() {   //getter(return a value)
		return firstName;
	}
	public void setFirstName(String firstName) {  //Setter(to set a value)
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {  //this will show the varble last name at the top  
		                                        //will help to differentate  when their is the same last name
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	

	

}
