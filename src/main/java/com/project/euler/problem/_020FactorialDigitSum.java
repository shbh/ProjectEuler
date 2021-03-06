package com.project.euler.problem;

import org.apache.log4j.Logger;

import java.math.BigInteger;



/**
 * Created by shashi on 1/30/14.
 */
public class _020FactorialDigitSum  {
	
	static Logger logger = Logger.getLogger(_020FactorialDigitSum.class);

	private final int limit = 100;

	public BigInteger solve() {
		
		BigInteger sum = BigInteger.ZERO;
	
		BigInteger integer = BigInteger.ONE;

		for (int i = 1; i <= limit; i++) {
			
			integer = integer.multiply(BigInteger.valueOf(i));
		}

		while (integer.compareTo(BigInteger.ZERO) != 0) {
			
			BigInteger fact = integer.mod(BigInteger.TEN);
		
			integer = integer.divide(BigInteger.TEN);
		
			sum = sum.add(fact);

		}
		
		return sum;
	}

}
