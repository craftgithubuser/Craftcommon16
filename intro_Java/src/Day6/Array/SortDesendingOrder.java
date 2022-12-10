package Day6.Array;

public class SortDesendingOrder {

	public static void main(String[] args) {

		// Initialize array
		int[] arr = new int[] {108,29,87,22,27};
		int temp = 0;

		System.out.println("Enter the array: " + arr);

		// Displaying elements of original array
		System.out.println("Elements of original array: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

		// Sort the array in descending order
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		System.out.println();

		// Displaying elements of array after sorting
		System.out.println("Elements of array sorted in descending order: ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
