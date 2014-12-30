package com.project.euler.problem;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

public final class _032PandigitalProducts implements IProblem {

	static Logger logger = Logger.getLogger(_032PandigitalProducts.class);

	public Integer solve() {

		// A candidate product has at most 4 digits. This is because if it has 5
		// digits,
		// then the two multiplicands must have at least 5 digits put together.
		int sum = 0;
	
		for (int i = 1; i < 10000; i++) {
		
			if (Functions.hasPandigitalProduct(i))
			{	
				sum += i;
			}
		
		}
		
		return sum;
	
	}

	
}