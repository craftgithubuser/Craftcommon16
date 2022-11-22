package instVarPract;

//package com.icraftjava;
public class instVarPrac {
	int age = 25; // <----InstanceVariablea Declared outside methods
	public void methodone() {
	int i = 10; // local variable
	System.out.println("Value of i:" + i);
	System.out.println("Value of age:" + age);
	age= age+1;
}
public void methodtwo() {
	int k = 30; // local variable
	System.out.println("Value of k:" + k);
	System.out.println("Value of age:" + age);
	
}



public static void main(String[] args) {
//TODO Auto-generated method stub
	Student StuOne = new Student("Ross");
	Student StuTwo = new Student("Rachel");
	Student StuThree = new Student("Phoebe");
	instVarPrac var = new instVarPrac();
	var.methodone();
	var.methodtwo();
} }