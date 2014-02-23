package project.euler.rough;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

public class RoughCopy {
	
	static Logger logger = Logger.getLogger(RoughCopy.class);
	
	public static void main(String[] args) {

	
		
		
		generate(Integer.toString(379));
		
		cut1(Integer.toString(379));
		
		logger.info(isNumberEndWith37("373"));
		
		char[] temp = new Integer(1003).toString().toCharArray();
		
		Arrays.sort(temp);

		logger.info(max(123456781));
		
		logger.info((Math.abs(123) / Math.pow(10, 3 - 1)) % 10);
		
		logger.info(Integer.toString(12).substring(1, 2));
	
	}
	public static Integer BubbleSort( int [ ] num )
	{
	     int j;
	     boolean flag = true;   // set flag to true to begin first pass
	     int temp;   //holding variable
	     int number =0;
	     while ( flag )
	     {
	            flag= false;    //set flag to false awaiting a possible swap
	            for( j=0;  j < num.length -1;  j++ )
	            {
	                   if ( num[ j ] > num[j+1] )   // change to > for ascending sort
	                   {
	                           temp = num[ j +1 ];                //swap elements
	                           
	                           num[ j+1 ] = num[ j ];
	                           
	                           num[ j] = temp;
	                           
	                           flag = true;              //shows a swap occurred 
	                  }
	            }
	      }
	     
	     
	     for (int i = 0; i < num.length; i++) {
			number = number+num[i]*(int)Math.pow(10, i);
		}
	     
	     return number;
	} 

	public static Integer max(int n)
	{

		
		String temp = Integer.toString(n);
		int[] newGuess = new int[temp.length()];
		
		for (int i = 0; i < temp.length(); i++)
		{
		    newGuess[i] = temp.charAt(i) - '0';
		}
		return BubbleSort(newGuess);
	}
	
	private final static void cut1(String string) {

		logger.info(string.substring(0, 1));
	
		logger.info(string.substring(string.length() - 1));
	}

	private final static boolean isNumberEndWith37(String string) {

		// String
		String l = string.substring(0, 1);
		
		String r = string.substring(string.length() - 1);
		
		if ((l.equals("3") || l.equals("7"))
				&& (r.equals("3") || r.equals("7"))) 
		{
		
			return true;
		
		}
		
		return false;
	
	}

	private final static Set<String> generate(String string) {

		Set<String> sets = new HashSet<>();
	
		sets.add(string);
		
		String ltemp = string;
		
		String rtemp = string;
		
		for (int i = 0; i < string.length() - 1; i++) {
		
			ltemp = ltemp.substring(0, ltemp.length() - 1);
			
			rtemp = rtemp.substring(1);

			sets.add(rtemp);
			
			sets.add(ltemp);
		
		}

		return sets;
	
	}
}
