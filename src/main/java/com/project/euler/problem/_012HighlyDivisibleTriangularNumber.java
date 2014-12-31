package com.project.euler.problem;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

/**
 * Created by shashi on 1/29/14.
 */
public class _012HighlyDivisibleTriangularNumber  {
	
	static Logger logger = Logger.getLogger(_012HighlyDivisibleTriangularNumber.class);

	private static int total = 500;

	public Long solve() {
	
	
		long trianglenumber = 0;
		int lastnumber = 1;
	
		total = total / 2;

		while (true) {
	
			trianglenumber = trianglenumber + lastnumber;
	
			lastnumber++;

			final int count = Functions.countdivisor(trianglenumber);
		
			if (count >= total) {
		
				break;
			}
		
		}
	
		return trianglenumber;

	}

}
