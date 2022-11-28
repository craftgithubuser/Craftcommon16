package com.If;

public class Arryexcersise {

	public static void main(String[] args, int j) {
		// TODO Auto-generated method stub


		  
		  double Mark[][] = {
		                   {85.9,78,90,75,97,67,80,70,50,89}, 
		                   {85.9,78,90,75,97,67,80,60,50,87},
		                   {85.9,78,98,75,70,80,89,90,89,79},
		                   {85.9,78,90,75,97,67,80,70,60,89},
		                   {85.9,78,90,79,97,89,87,90,99,79},
		                         
		  };
		 for(int i = 0; i < 9; i++) {
			 int sum = 0;
			 for(int j1 = 0; j1 < 5;);
			 sum += Mark[i][j];
		
			System.out.print("the sum of row " + (i + 1) + ":" + sum);
		 }
		  
	}

}
