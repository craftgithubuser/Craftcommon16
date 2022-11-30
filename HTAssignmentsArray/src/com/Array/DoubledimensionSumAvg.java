package com.Array;

public class DoubledimensionSumAvg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		double StudGrade[][] = { 
                { 85, 78, 92, 75, 99, 60, 81, 70, 50, 89 }, 
                { 85.9, 68, 90, 75, 97, 67, 80, 60, 65, 87 },
                { 85, 78, 74, 75, 97, 67, 80, 60, 65, 88 },
                { 84, 78, 88, 75, 97, 67, 80, 70, 60, 80 },
                { 88., 78, 92, 75, 97, 67, 80, 60, 65, 77 },
            };


           for (int i=0; i<StudGrade.length; i++) {


           double sum=0;
           double average =0;

           for(int j=0; j<StudGrade[i].length; j++) {

           System.out.print(StudGrade[i][j] + "  ");	

           sum += StudGrade[i][j];
           average = sum/StudGrade[i].length;

           }

            System.out.print(" Sum of StudGrade:  "  + sum);
            System.out.printf("Average of StudGrade: " + average);
            System.out.println();
           }
            System.out.println();



}



	


	}


