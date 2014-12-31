package com.project.euler.problem;

import java.math.BigInteger;

import org.apache.log4j.Logger;



public class _063PowerfulDigitCounts  {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);
	public Integer solve() {
		
		
		
		int count = 0;
		

		
		BigInteger digits = BigInteger.ONE;
	
		int x = 1;
		
		while(x<10)
		{
			int i =1 ;
			while(true) {
				
			
				digits = BigInteger.valueOf(x).pow(i);
				
				int length = digits.toString().length();
				
				if(length==i)
				{
					
					count++;
				}
				if(length<i)
				{
					break;
				}
				i++;
				
				
				
			}
			x++;
		}
		
		return count;
	}
		
	

}
