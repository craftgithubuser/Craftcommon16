package com.conceptofarrays;

public class ArraySumAverage {

	public static void main(String[] args) {
		// access data in multidimensional array

		double[][] studsMark = { { 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 },
				{ 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 }, { 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 },
				{ 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 }, { 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 },
				{ 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 } };

		System.out.println("Accessed by for-each loop:\n");
		// accessed by for-each loop

		for (double melk[] : studsMark) {
			double sum = 0;
			double avg = 0;

			for (double elt : melk) {
				System.out.print(elt + " ");
				sum += elt;
				avg = sum / melk.length;
			}
			System.out.println("Sum: " + sum + "\t" + "Average: " + avg);

		}
		System.out.println();
		System.out.println("Accessed by for loop:");

		// accessed by for loop
		for (int i = 0; i < studsMark.length; i++) {

			double sum = 0;
			double avg = 0;
			for (int j = 0; j < studsMark[i].length; j++) {
				System.out.print(studsMark[i][j] + " ");
				sum += studsMark[i][j];
				avg = sum / studsMark[i].length;
			}

			System.out.println("Sum: " + sum + "\t" + "Average: " + avg);

		}
	}
}
