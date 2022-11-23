package Com.arrayAssignment;

public class ArrayAverage {

	public static void main(String[] args) {
		
		
		int[][] mark = { { 70, 77, 89, 78, 62, 88 }, 
					     { 80, 60, 99, 68, 69, 98 }, 
					     { 90, 87, 69, 88, 89, 58 },
					     { 75, 84, 99, 78, 69, 98 } };

		int sum = 0;
		double average = 0.0;
		int j;
		int i;

		for (i = 0; i <= mark.length - 1; i++) {

			System.out.print("student" + i + " ");

			for (j = 0; j <= mark.length - 1; j++) {

				System.out.print(mark[i][j] + " ");

				sum += mark[i][j];
				average = sum / mark.length;

			}

			System.out.println("Average = " + average);
			sum = 0;
		}

	}

}
