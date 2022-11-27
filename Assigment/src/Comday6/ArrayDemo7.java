package Comday6;

public class ArrayDemo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double studmark[] = {85,78,90,75,97,67,80,70,50,89};
		
     //Write a code that will print the sum and average of student mark.

	
		double total =0, average;
		
		int len = studmark.length;
		
		 for(int i=0; i<len; i++) {
			 total+= studmark[i];
		 }
		
		average =total / (double)len;
		
		System.out.println("Total mark of student:" + total);
		System.out.println("Averag mark of student: " + average);
		
	
		
	}

}
