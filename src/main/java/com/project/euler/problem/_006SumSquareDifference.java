package com.project.euler.problem;

import org.apache.log4j.Logger;



/**
 * Created by shashi on 1/28/14.
 */
public class _006SumSquareDifference  {
	
	static Logger logger = Logger.getLogger(_006SumSquareDifference.class);

	private static final int LIMIT = 100;

	public Long solve() {
	
		long sum = 0;
		
		long square = 0;

		for (int n = 0; n <= LIMIT; n++) {
		
			sum += n * n;
			
			square += n;
		}

		return square * square - sum;

	}

}
