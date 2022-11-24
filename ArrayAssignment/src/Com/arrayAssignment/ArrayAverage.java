package Com.arrayAssignment;

public class ArrayAverage {

	public static void main(String[] args) {
		
		
		double[][] mark = { { 70, 77, 89, 78, 62, 88 }, 
					     { 80, 60, 99, 68, 69, 98 }, 
					     { 90, 87, 69, 88, 89, 58 },
					     { 75, 84, 99, 78, 69, 98 } };

		double sum = 0;
		double average = 0.0;
		

		for (int i = 0; i < mark.length; i++) {

			System.out.print("student" + i + " ");

			for (int j = 0; j < mark.length; j++) {

				System.out.print(mark[i][j] + " ");

				sum += mark[i][j];
				average = sum / mark.length;

			}

			System.out.println("Average = " + average);
			sum = 0;
		}

	}

}
