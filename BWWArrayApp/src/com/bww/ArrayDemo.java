package com.bww;

public class ArrayDemo {
	
	static void display(int[] arr) {
		for(int a : arr) {
			System.out.print(a + " ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {5, 2, 6, 4};
		
		display(arr);

	}

}
