package ExcerciseOneReverse;

public class AddingSumAvg {

	public static void main(String[] args) {
		
		
			// TODO Auto-generated method stub
			int studentsmark [][] = {
					
					{85,69,78,45,54,63,65,69,98,75},
					{65,55,85,59,97,63,26,45,88,66},
					{78,88,77,45,65,39,89,98,79,77},
					{66,69,78,98,74,85,86,94,82,28},
					{55,65,87,78,79,45,65,66,45, 46},
					};
					
					
					for (int i = 0; i < studentsmark.length; i++) {
						int sum =0;
						double average = 0;
										
					for (int j = 0; j < studentsmark[i].length; j++) {
					System.out.print(studentsmark[i][j] +"  " +  " " );
					sum += studentsmark [i][j];
					average = sum /studentsmark[i].length;
									
					//System.out.print("A");
					
					}
					System.out.println("Total Marks " + " " + sum +" Average" + "  "+ average + "  " );
					//System.out.println("Average"
	}

	}
}
