package Comday6;

public class ArrayDeno1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
     String studName []	=new String[20];
     
    studName[0]= "james";
    studName[1]="jamie";
    studName[2]="john";
    studName[19]="Adam";
    
    
    //System.out.println(studName[0]);
    //System.out.println(studName[1]);
   //System.out.println(studName[2]);
   // System.out.println(studName[19]);
		
    
    for(   String elt: studName ) {
    	
    	System.out.print(elt + " "  );
    }
	
     System.out.println();
     
     //for loop
     
     for( int i=0; i<20; i++) {
    	 
    	 System.out.print(studName[i] + " ");
    	 
     }
	}
		
	
	
	}
		 
	


