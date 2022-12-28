package com.arrays;

public class Ephrem_Tiref_multidimennssional_array_pr0ject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double studsMark[][] = { { 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 },
				{ 85.9, 78, 90, 75, 97, 67, 80, 60, 50, 87 }, { 99, 99, 99, 99, 99, 99, 99 },
				{ 85.9, 78, 90, 75, 97, 67, 80, 70, 60, 89 }, { 85.9, 78, 90, 79, 97 },

		};

		for (int i = 0; i < studsMark.length; i++) {

			double sum = 0;
			for (int j = 0; j < studsMark[i].length; j++) {

				sum += studsMark[i][j];

			}
			double avg = sum / studsMark[i].length;
			System.out.println("Total Mark= " + sum + " The avg = " + avg);
			System.out.println();
		}

	}

}
