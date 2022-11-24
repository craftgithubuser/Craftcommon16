package com.craft_array;


public class ArrayLoop {

	public static void main(String[] args) {
		
		double studsMark[][] = {
	               {85.9,78,90,75,97,67,80,70,50,89}, 
	               {85.9,78,90,75,97,67,80,60,50,87},
	               {85.9,78,98,75,70,80,89},
	               {85.9,78,90,75,97,67,80,70,60,89},
	               {85.9,78,90,79,97},
                
                };

//accessing data in multi dimentional array

for(double elt[]: studsMark) {
	double sum = 0, average;
	
	for(double marks: elt) {
		
		sum += marks;
	}
	
	average = sum/elt.length;
	
	System.out.println("Sum is " + sum + ", and the average is " + average +  "." );
	
	}

	System.out.println("\n");

	}
}