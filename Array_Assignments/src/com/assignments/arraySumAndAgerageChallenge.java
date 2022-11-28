package com.assignments;

public class arraySumAndAgerageChallenge {

	public static void main(String[] args) {
		double marks[][] = { 
				           { 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 }, 
				           { 85.9, 78, 90, 75, 97, 67, 80, 60, 50, 87 },
				           { 85.9, 78, 98, 75, 97, 67, 80, 70, 80, 89 }, 
				           { 85.9, 78, 90, 75, 97, 67, 80, 70, 60, 89 },
			               { 85.9, 78, 90, 79, 97, 67, 80, 70, 57, 89 }, 
			               };
		 
		
		for (int i=0; i<marks.length; i++) {
		
			System.out.print("Row Number" + (1+i) + "    ");
			double sumOfMarks=0;
			double average =0;
			for(int j=0; j<marks[i].length; j++) {
				
				System.out.print( marks[i][j] + "  ");	
				
				sumOfMarks += marks[i][j];
				average = sumOfMarks/marks[i].length;
			
				}
			
			System.out.print(" Sum of marks:  "  +sumOfMarks + "    ");
			System.out.printf("Average mark: %.2f", (average));
			System.out.println();
		}
		System.out.println();
		
		double total = sum(marks);                         //This is to sum up all the elements in the array.
		System.out.printf("Total sum of elements in the array = %.2f " , total);
}

	public static double sum(double[][] marks) {
		double total = 0;

		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				total += marks[i][j];
			}
		}
		return total;
	}
	
}
