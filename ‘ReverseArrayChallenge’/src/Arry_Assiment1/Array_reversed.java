package Arry_Assiment1;

public class Array_reversed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

    int [] array1 = new int [] {1,2,3,4,5};
     System.out.println("The original array is :");
     for(int i=0; i<array1.length; i++) {
    	 System.out.print(array1[i] +" ") ;
    	 
     }
    System.out.println();
    System.out.println("the reversd array is :");
    for(int i=array1.length-1; i>=0; i--) {
    	System.out.print(array1[i]+ " ");
    }
	}
	

}
