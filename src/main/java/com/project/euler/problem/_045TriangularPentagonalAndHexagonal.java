package com.project.euler.problem;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _045TriangularPentagonalAndHexagonal  {
	
	static Logger logger = Logger.getLogger(_045TriangularPentagonalAndHexagonal.class);

	public Long solve() {

		int initial = 143;
		
		long result = 0;
		
		while (true) {
		
			initial = initial + 1;
			
			result = initial * (2 * initial - 1);
			
			if (Functions.isPentagonal(result)) {
			
				break;
			
			}
		
		}
	
		return result;
	
	}

}
