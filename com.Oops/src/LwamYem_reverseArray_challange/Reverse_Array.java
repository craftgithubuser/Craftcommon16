package LwamYem_reverseArray_challange;

public class Reverse_Array{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//to reverse Array
		//java program reverse an array
     int arr[]= {20,35,21,49,4};
     int temp[]=new int [arr.length];
     for(int i=arr.length-1; i>=0;i--) {
    	temp[arr.length-1-i]=arr[i];//assigning in reverse order
    	
     }
     for(int b=0;b<arr.length;b++) {
    	 arr[b]=temp[b];
    	 System.out.println(arr[b]);
	}
	}
	}

