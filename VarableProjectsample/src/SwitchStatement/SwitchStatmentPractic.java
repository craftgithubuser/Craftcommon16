package SwitchStatement;

import java.util.Scanner;

public class SwitchStatmentPractic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		System.out.println("pls enter week day in number");
		int day=in.nextInt();
		
		String dayName;
		
		switch (day) {
		case 1:
			dayName="Today is Monday";
		    break;
		    
		case 2:
			dayName="Today is Tusday";
		    break;
		    
		case 3:
			dayName="Today is Wensday";
		    break;
		    
		case 4:
			dayName="Today is Thursday";
		    break;
		    
		case 5:
			dayName="Today is Friday";
		    break;
		    
		case 6:
			dayName="Today is Saturday";
		    break;
		    
		case 7:
			dayName="Today is Sunday";
		    break;
		    
		case 8:
		    default:
		    dayName="Invalid Day";
		    break;
		}   
	System.out.println(dayName);	    
		}
		
	}


