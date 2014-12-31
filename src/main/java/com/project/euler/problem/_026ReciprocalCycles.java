package com.project.euler.problem;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public final class _026ReciprocalCycles  {

	static Logger logger = Logger.getLogger(_026ReciprocalCycles.class);

	public int limit = 1000;

	public Integer solve() {
	
		int bestNumber = 0;
		
		int bestLength = 0;
		
		for (int i = limit; i > bestLength; i--) {
		
			int len = Functions.getCycleLength(i);
			
			if (len > bestLength ) {
			
				bestNumber = i;
				
				bestLength = len;
			}
		}
		
		return bestNumber;
	}

	

}