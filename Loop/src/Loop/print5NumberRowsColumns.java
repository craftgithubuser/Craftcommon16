package Loop;

public class print5NumberRowsColumns {
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {        // Row
			for (int j = 1; j <= 5; j++) {    // Column
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}