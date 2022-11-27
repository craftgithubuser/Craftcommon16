package day_7;

public class Example_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 
		  double studsMark[][] = {
		                   {85.9,78,90,75,97,67,80,70,50,89},
		                   {85.9,78,90,75,97,67,80,60,50,87},
		                   {85.9,78,98,75,70,80,89},
		                   {85.9,78,90,75,97,67,80,70,60,89},
		                   {85.9,78,90,79,97},
		                        
		                         };
		 
		 
		  for(int i=0; i<studsMark.length; i++) {
		  
		      double sum =0;
			  double avarage = 0;
			 
			   for(int j=0; j <studsMark[i].length; j++) {
		  
		   // System.out.print(studsMark[i][j] + " " + " ");
	
			sum += studsMark [i][j];
		    avarage = sum/studsMark[i].length;
			   } 
			   System.out.println("Total marks" + " " + sum+  "  avarage" + " " + avarage);
	}
	}
}