package Day6.Array;

public class Sum_average {

	public static void main(String[] args) {
	
		int  [][]  studsMark = {
	               {85,78,90,75,97,67,80,70,50,89}, 
	               {85,78,90,75,97,67,80,60,50,87},
	               {85,78,98,75,70,80,89,90,100,64},
	               {85,9,78,90,75,97,67,80,70,60,89},
	               {85,78,90,79,97,87,59,90,95,80},
	               
		};
		
		{
			System.out.println();
		}

			for (int i = 0; i < studsMark.length; i++) {
				for (int j = 0; j < studsMark[i].length; j++) {
					System.out.print(studsMark[i][j] + " ");

				}
				System.out.println();

			}
			System.out.println("\n");

			for (int i = 0; i < studsMark.length; i++) {
				double Sum = 0;
				for (int j = 0; j < studsMark[i].length; j++) {
					Sum = Sum + studsMark[i][j];
				}

				System.out.println("Total mark of Student: " + Sum);
				System.out.println("Average mark of Student: " + Sum/studsMark[i].length);
			}
		}

	}
	          

             
		