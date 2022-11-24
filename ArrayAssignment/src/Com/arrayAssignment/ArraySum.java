package Com.arrayAssignment;

public class ArraySum {

	public static void main(String[] args) {
		

		double[][] mark = { { 70.5, 77, 99, 78, 62, 88 }, 
				            { 80, 60, 99, 68, 69, 98 }, 
				            { 90, 87, 69, 88.9, 89, 58 },
				            { 75, 84.6, 99, 78, 69, 98 } };


		double sum = 0.0;
		

		for (int i = 0; i < mark.length; i++) {

			System.out.print("student: " + i + " ");

			for (int j = 0; j < mark[i].length; j++) {

				System.out.print(mark[i][j] + " ");

				sum += mark[i][j];

			}

			System.out.println("sum = " + sum);
			sum = 0;
		}

	}
}
