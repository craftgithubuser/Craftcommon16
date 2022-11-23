package Array_package;

public class AnibalTegegneArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double studsMark[][] = {
	               {85.9,78,90,75,97,67,80,70,50,89}, 
	               {85.9,78,90,75,97,67,80,60,50,87},
	               {85.9,78,98,75,70,80,89},
	               {85.9,78,90,75,97,67,80,70,60,89},
	               {85.9,78,90,79,97},
                
                };

         double sum = 0;
         double avg ;
         for (int i = 0; i < studsMark.length; ++i) {sum = 0; // first option
         for (int k = 0; k < studsMark[i].length; ++k) {
	     sum = sum + studsMark[i][k] ;
	
}
         avg = sum / studsMark[i].length;
        System.out.println("sum of student marks " + sum);
        System.out.println("average of student marks " + avg);
        //sum = 0 ; second option
}
	}

}
