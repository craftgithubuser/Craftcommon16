package Arry_Assiment1;

public class Arey_descending {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int arr[] = new int[] {106,26,81,5,15,};
		
		int temp =0;
		
		System.out.println("Elements of originial array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				
				if(arr[i] > arr [j]) {
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Elements of sorted array");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + "  ");
		}
		
		
		
	}

}
