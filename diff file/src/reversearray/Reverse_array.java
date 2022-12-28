package reversearray;

public class Reverse_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]my= new int[] {1,2,3,4,5};
		System.out.println("original array:");
		for(int i=0;i<my.length;i++) {
			System.out.print(my[i]+" ");
		}
      System.out.println();
      
      System.out.println("array in reverse order:");
      
      for (int i = my.length-1;i>=0;i--) {
    	  System.out.print(my[i]+" ");
      }
      }

}
