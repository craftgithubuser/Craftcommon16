package Comday6;

public class ArryDemo5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//double studsmark[] = {85,78,90,75,97,67,80,70,50,89};
		
		double studsMark[][]= {
				               {85,78,90,75,97,67,80,70,50,89},
				               {85,78,90,75,97,67,80,60,50,89},
				               {85,78,90,75,97,67,80,70,80,89},
				               {85,78,90,75,97,67,80,70,60,89},
				               {85,78,90,75,97,67,80,70,57,89},  
            
	                            };
	//	System.out.println(studsMark[1][9]);

    

	for(double elt[]: studsMark) {
		for(double mark: elt) {
			System.out.print(mark +" ");
		}
		System.out.println();
	}
	
	System.out.println("\n");
	for (int i=0; i<studsMark.length; i++) {
		for (int j=0; j<studsMark.length;  j++) {
			System.out.print(studsMark[i][j]);
	
		}
		
		System.out.println();
	}
	
	
	
	}
	
}
	
