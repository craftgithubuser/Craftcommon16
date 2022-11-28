package ArrayAray;

import java.util.*;
import java.util.stream.*;

public class Assignment03Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		    Integer[] intArray = {15,22,33,44,58,62,71,89,100};
		     
		  //print array starting from first element
		    System.out.println("Original Array:");
		    for(int i=0;i<intArray.length;i++)
		         System.out.print(intArray[i] + "  ");
		     
		    System.out.println();
		     
		    //print array starting from last element
		    System.out.println("Original Array printed in reverse order:");
		         for(int i=intArray.length-1;i>=0;i--)
		         System.out.print(intArray[i] + "  ");
		    }
		}
