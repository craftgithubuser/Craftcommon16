package com.Array;



public class ReverseArrayChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr []= {10,15,20,25,30,};
		
		System.out.print("Original Array in order:");
		   for(int i = 0; i < arr.length; i++) {
		    
			  System.out.print(arr[i] + " ");
					  
		   } 
		   System.out.print("\n");
		   System.out.print("\n");
		   
		   System.out.print("Array in reverse order:");
		  
		for (int i=arr.length-1; i>=0; i--) {
			
        System.out.print(arr [i] + " ");
        
        		
		}
		

			
		
	}
         
}