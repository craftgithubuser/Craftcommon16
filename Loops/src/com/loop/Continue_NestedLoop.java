package com.loop;

public class Continue_NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 1;
		int j = 1;

	//outer loop
		while (i <= 3) {
			System.out.println("outer loop: "+i);

		//inner loop
			while (j <= 3) {
				if (j == 2) {
					j++;
					continue;
				}
				System.out.println("inner loop: "+j);
				j++;
			}
			i++;
		}

	}

}
