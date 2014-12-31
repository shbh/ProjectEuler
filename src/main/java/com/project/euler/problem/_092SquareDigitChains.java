package com.project.euler.problem;

import org.apache.log4j.Logger;



/**
 * Created by shashi on 1/30/14.
 */
public class _092SquareDigitChains  {

	static Logger logger = Logger.getLogger(_092SquareDigitChains.class);

	private static final int LIMIT = 10000000;

	private static int[] bigarrayseriousally = new int[10000000]; 
	
	public Integer solve() {
		
		int count = 0;
		for (int i = 1; i < LIMIT; i++) {
			
			int sum = i;
			while(sum!=89 && sum!=1)
			{
				sum =findSquareDigit(sum);
			}
			
			if(sum==89)
			{
				bigarrayseriousally[i]=89;
				
				count++;
			}
			else if(sum==1)
			{
				bigarrayseriousally[i]=1;
			} 
		}
		return count;

	}
	
	
	private int findSquareDigit(int n)
	{
		int sum = 0;
		while(n!=0)
		{
			int temp = (int)n%10;
			n = n/10;
			sum = sum + temp*temp;
			
		}
		if(bigarrayseriousally[sum]==89)
		{
			return 89;
		}
		else if(bigarrayseriousally[sum]==1)
		{
			return 1;
		}
		
		return sum;
		
	}

	

}
