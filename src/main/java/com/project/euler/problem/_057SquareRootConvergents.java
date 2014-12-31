package com.project.euler.problem;

import org.apache.log4j.Logger;

import java.math.BigInteger;



public class _057SquareRootConvergents  {
	
	static Logger logger = Logger.getLogger(_057SquareRootConvergents.class);

	public Integer solve() {

		int answer = 0;
		
		BigInteger numerator = BigInteger.valueOf(3);
		
		BigInteger denominator = BigInteger.valueOf(2);
		
		BigInteger two = BigInteger.valueOf(2);
		
		for (int i = 1; i < 1000; i++) {
		
			BigInteger temp = numerator;
			
			numerator = denominator.multiply(two).add(numerator);
			
			denominator = temp.add(denominator);

			if (numerator.toString().length() > denominator.toString().length()) {
			
				answer++;
			
			}

		}

		return answer;
	}

}
