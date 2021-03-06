package com.project.euler.problem; 
import org.apache.log4j.Logger;



public class _028NumberSpiralDiagonals  { 
	
	static Logger logger = Logger.getLogger(_028NumberSpiralDiagonals.class);

	private final int limit = 1001;

	public Long solve() {
		int x = 1;

		int y = 1;
		
		int v = 1;
		
		int w = 1;
		
		int newX = 0, newY = 0, newV = 0, newW = 0;
		
		int increment = 8;

		
		int n = limit / 2 + 1;
		
		
		long totalA = 1, totalB = 0;
		
		for (int i = 1; i < n; i++) {
		
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
			
			totalA += newX + newY;
			
			totalB += newW + newV;

		}
		
		
		return totalA + totalB;
	}

	


}
