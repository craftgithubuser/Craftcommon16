package day6Array;

public class sum_Average {

	public static void main(String[]args) {
		double studMark[][]=
			{ 
					{ 85.9, 78, 90, 75, 97, 67, 80, 70, 50, 89 }, 
					{ 85.9, 78, 90, 75, 97, 67, 80, 60, 50, 87 },
					{ 85.9, 78, 98, 75, 70, 80, 89 }, 
					{ 85, .9, 78, 90, 75, 97, 67, 80, 70, 60, 89 },
					{ 85.9, 78, 90, 79, 97 } };
	{
	
	}

		for (int i = 0; i < studMark.length; i++) {
			for (int j = 0; j < studMark[i].length; j++) {
				System.out.print(studMark[i][j] + " ");	
			}
			System.out.println();
		
		for (int h = 0; h < studMark.length; h++) {
}
			double Sum = 0;
			for (int j = 0; j < studMark[i].length; j++) {
				Sum = Sum + studMark[i][j];
			}
		
			System.out.println("Total mark of Student: " + Sum);
			System.out.println("Average mark of Student: " + Sum/studMark[i].length);
		}
	}

			
}
