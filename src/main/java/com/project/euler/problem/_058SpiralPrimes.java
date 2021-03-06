package com.project.euler.problem;


import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _058SpiralPrimes  { 
	
	static Logger logger = Logger.getLogger(_058SpiralPrimes.class);

	private final int limit = 10;

	public Integer solve() {

		int x = 1;
		
		int y = 1;
		
		int v = 1;
		
		int w = 1;
		
		int newX = 0, newY = 0, newV = 0, newW = 0;
		
		int increment = 8;
		
		int i =1;
		
		int side = 0;
		
		int element = 0;
		
		int totalNoOfPrime = 0;
		
		boolean isLimitReached = false;
		
		while(!isLimitReached) {
		
			if (i == 1) {

				newV = v + 8;
			
				v = 8;
				
				newW = w + 4;
				
				w = 4;
				
				newX = x + 6;
				
				x = 6;
				
				newY = y + 2;
				
				y = 2;
			} 
			else 
			{
				v = v + increment;
			
				newV = newV + v;
				
				w = w + increment;
				
				newW = newW + w;
				
				x = x + increment;
				
				newX = newX + x;
				
				y = y + increment;
				
				newY = newY + y;

			}
			
			totalNoOfPrime = getValue(newX, totalNoOfPrime);
			totalNoOfPrime = getValue(newY, totalNoOfPrime);
			totalNoOfPrime = getValue(newW, totalNoOfPrime);
			totalNoOfPrime = getValue(newV, totalNoOfPrime);
			
			
			
			side = newV -newX + 1;
			
			element = (i*4+1);
			
			double ratio = (totalNoOfPrime*1.0/element)*100;
			
			if(ratio<limit)
			{
			
				isLimitReached = true;
			
				break;
			
			}
			
			i++;
		}
		
		return side;
	}

	private int getValue(int no, int totalNoOfPrime) {
		// TODO Auto-generated method stub
		
		if(Functions.isPrime(no))
		{
			
			totalNoOfPrime = totalNoOfPrime + 1;
		
		}
		return totalNoOfPrime ;
	}

	


}

