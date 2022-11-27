package com.loop;

public class Pattern2Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n = 5;
		int x =4;

	// print the first four rows
		for (int row = 1; row <= n; row++) {
			

			for (int cln = 1; cln <= row; cln++) {
				System.out.print("*  ");

			}
			System.out.println();
			
			
		}
	//print the last three rows
		for (int row2 = x; row2 >= 1; row2--) {

			for (int cln2 = 1; cln2 <= row2; cln2++) {
				System.out.print("*  ");

			}

			System.out.println();

		}

	}

}
