package ExcerciseOneReverse;

public class ReverseExcercise1 {

	
	
	public static void main(String[]args) {
		// Initializing array
		
		int [] tri = new int []{102,65,45,2, 78, 54};
		int temp = 0;
		
		// Displaying elements of original arrays
		
			System.out.println("elements in the array:" + "  ");
			
			for(int i= 0;i< tri.length; i++){
				System.out.print(tri[i] + "   ");
			}
				//Sorting arrays
				
				for (int i=0; i<tri.length; i++) {
					for (int j=i+1;j< tri.length;j++) {
						if (tri[i] < tri[j]) {
							temp = tri[i];
							tri[i]= tri[j];
							tri[j]=temp;
						}
					}
				}
				
				System.out.println();
				System.out.println();
				
				System.out.println("sorted elements of array");
				for (int i=0; i <tri.length; i++) {
					System.out.print(tri[i] + "   ");
			}
			}
				
	}


