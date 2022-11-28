package com.practice;

public class Arraydemo4 {
	public static void main(String[] args) {
		//double studMark[] = {85,9,78,90,75,97,67,70,50,89};
	   
		double studMark[][] = {
				 {85,9,78,90,75,97,67,70,50,89},
				 {85,9,78,90,75,97,67,70,50,87},
				 {85,9,78,90,75,97,67,70,50,89},
				 {85,9,78,90,75,97,67,70,50,89},
				 {85,9,78,90,75,97,67,70,50,89}};
		
		//row =, index = 0-4 and column=10, index =0-9
		
		System.out.println(studMark[1][9]);	
		
		
		for (double elt[]: studMark) {
			for(double marks : elt) {
			System.out.println(marks + "");
			
		}
				
			System.out.println();	
		}
		System.out.println("\n");
		
		for(int i=0; i<studMark[i].length; i++) {
			for (int j=0; j<studMark[i].length; j++) {
				System.out.println(studMark[i][j] + "");
				
			}
		}
			}
		
	}

	


