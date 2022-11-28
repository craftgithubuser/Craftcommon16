package ArrayAray;

public class ArrayDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double studMark[]= {85,78,90,75,97,67,80,70,50,89};
		
		for(double elt :studMark) {
			System.out.print(elt +" ");
		}
	
		
		System.out.println();
		for (int i=0;i<studMark.length; i++){
			System.out.print(studMark[i]+" ");
		}
		
		
	}

	}

