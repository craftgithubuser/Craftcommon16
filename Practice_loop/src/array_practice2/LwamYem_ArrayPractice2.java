package array_practice2;

public class LwamYem_ArrayPractice2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
				double studsMark[][] = {
			               {85.9,78,90,75,97,67,80,70,50,89}, 
			               {85.9,78,90,75,97,67,80,60,50,87},
			               {85.9,78,98,75,70,80,89},
			               {85.9,78,90,75,97,67,80,70,60,89},
			               {85.9,78,90,79,97},

		                };

		         double sum = 0;
		         double avg ;
		         for (int b = 0; b < studsMark.length; ++b) {
		         for (int num = 0; num < studsMark[b].length; ++num) {
			     sum = sum + studsMark[b][num] ;

		}
		         avg = sum / studsMark[b].length;
		        System.out.println("sum of student marks " + sum);
		        System.out.println("average of student marks " + avg);
		        
		}
			}

		
	}


