package com.project.euler.problem;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

/**
 * Created by shashi on 1/28/14.
 */
public class _003LargestPrimeFactor implements IProblem {
	
	static Logger logger = Logger.getLogger(_003LargestPrimeFactor.class);

	private final long inputnumber = 600851475143l;

	public Long solve() {
	
		long largenumber = inputnumber;

		return Functions.divideNumber(largenumber, 2, 0);

	}

	

}
