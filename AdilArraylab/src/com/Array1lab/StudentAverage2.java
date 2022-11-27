package com.Array1lab;

public class StudentAverage2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		double studMark[][] = {
	              {85.9,78,90,75,97,67,80,70,50,89},
	              {85.9,78,90,75,97,67,80,70,50,87},
	              {85.9,78,90,75,97,67,80,70,50,89},
	              {85.9,78,90,75,97,67,80,70,50,89},
	              {85.9,78,90,75,97,67,80,70,50,89},
	              
                };
		
		 for(int i = 0; i< studMark.length; i++) {
			 double avg =0;
			 
			 
			 int sum =0;
			 for (int j =0; j<studMark[i].length; j++) {
				 System.out.print(studMark[i][j] + " ");
				 sum += studMark[i][j];
				 avg = sum/studMark[i].length;
			 }
			    System.out.println("Average of Each row: " + avg);
			    
			    // try to do average of each column
		 }
		
		
				
			

	}

}
