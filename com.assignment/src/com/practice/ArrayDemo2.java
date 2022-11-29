package com.practice;

public class ArrayDemo2 {
	public static void main(String[] args) {
		
		//double 
		//StudMark[]= new double[10];
		//StudMark[0]=85;
		//StudMark[1]=78;
		//or
		
		double studMark[] = new double[] {85,78,90,75,97,67,80,70,50,89};
		
		System.out.println(studMark.length);
		
		for(double elt: studMark) {
		System.out.print(elt + " ");
		}
		System.out.println();
		
		for (int i=0; i<studMark.length; i++) {
			System.out.print(studMark[i] + " ");
			
		}
		
	}

}
