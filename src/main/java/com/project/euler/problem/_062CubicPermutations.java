package com.project.euler.problem;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;



public class _062CubicPermutations  {

	Map<BigInteger,List<BigInteger>> combination = new HashMap<>();
	
	static Logger logger = Logger.getLogger(_062CubicPermutations.class);
	
	public BigInteger solve() {

		int i = 0;
		while(true)
		{
			BigInteger cube = BigInteger.valueOf(i).multiply(BigInteger.valueOf(i)).multiply(BigInteger.valueOf(i));
			BigInteger max = max(cube);
			
			List<BigInteger> total = combination.get(max);
			if(total==null)
			{
				total=new ArrayList<>();
				
			}
			total.add(cube);
			
			if(total.size()==5)
			{
				return total.get(0);
			}
			combination.put(max, total);
			
			i++;
		}
		
		
	}
	
	
	 private BigInteger BubbleSort( char[] cs )
		{
			
			 int j;
		     boolean flag = true;   
		     char temp;   
		     BigInteger number =BigInteger.ZERO;
		     while ( flag )
		     {
		            flag= false;    
		            for( j=0;  j < cs.length -1;  j++ )
		            {
		                   if ( cs[ j ] > cs[j+1] )   
		                   {
		                           temp = cs[ j +1 ];               
		                           
		                           cs[ j+1 ] = cs[ j ];
		                           
		                           cs[ j] = temp;
		                           
		                           flag = true;             
		                  }
		            }
		      }
		     
		     
		     for (int i = 0; i < cs.length; i++) {
		    	number = number.add(BigInteger.valueOf(cs[i]-'0').multiply(BigInteger.TEN.pow(i)));
			}
		     
		     return number;
		} 

	 private BigInteger max(BigInteger cube)
		{

			
			return BubbleSort(cube.toString().toCharArray());
			
		}
	
	
}
