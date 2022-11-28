package com.reversearraychallenge;

public class Quiz_3 {

	public static void main(String[] args) {
		// Initialize the original array
		System.out.print("\nOriginally Ordered Array: ");
		int[] arr = { 1, 80, 34, 56, 90, 77, 76 };
		for (int elt : arr) {
			System.out.print(elt + " ");
		}
		System.out.println("\n");
		reverse(arr, arr.length);
	}

	// The reverse function swaps or switches the array's first element with last
	// element

	static void reverse(int[] arr, int length) {

		int temp;
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - i - 1];
			arr[arr.length - i - 1] = temp;
		}

		// print the reversed array
		System.out.print("Reversely ordered  Array: ");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
		}
	}

}
