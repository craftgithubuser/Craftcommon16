package com.array;

public class multi_array {

	public static void main(String[] argrs) {
		double studsMark[][] = { { 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 },
				{ 85.9, 78, 90, 75, 97, 67, 80, 60, 50, 87 }, { 85.9, 78, 98, 75, 70, 80, 89 },
				{ 85.9, 78, 90, 75, 97, 67, 80, 70, 60, 89 }, { 85.9, 78, 90, 79, 97 },

		};

		for (int i = 0; i < studsMark.length; i++) {

			double sum = 0;
			double average = 0;

			for (int j = 0; j < studsMark[i].length; j++) {
				System.out.print(studsMark[i][j] + " ");

				sum = sum + studsMark[i][j];
				average = sum / studsMark[i].length;

			}
			System.out.println();
			System.out.println("      Sum : " + sum);
			System.out.println("      Average : " + average);

			System.out.println();

		}
	}
}
