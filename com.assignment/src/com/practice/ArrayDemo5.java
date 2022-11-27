package com.practice;

public class ArrayDemo5 {


	public static void main(String[] args) {
			// TODO Auto-generated method stub
			
//			double studMark[] = {85.9,78,90,75,97,67,80,70,50,89};
			
			double studsMark[][] = {
					               {85.9,78,90,75,97,67,80,70,50,89}, 
					               {85.9,78,90,75,97,67,80,60,50,87},
					               {85.9,78,98,75,70,80,89},
					               {85.9,78,90,75,97,67,80,70,60,89},
					               {85.9,78,90,79,97},
			                       
			                       };
			
			//row = 5, index = 0-4 and col=10, idx = 0-9
			
			//accessing data in multi dimentional array
			
			for(double elt[]: studsMark) {
				for(double marks: elt) {
					System.out.print(marks + " ");
				}
				System.out.println();
			}
			
			System.out.println("\n");
			
			
			for(int i=0; i<studsMark.length; i++) {
				
				for(int j=0; j<studsMark[i].length; j++) {
					System.out.print(studsMark[i][j] + " ");
				}
				System.out.println();
			}
			
			

		}

	}


