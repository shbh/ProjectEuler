package com.project.euler.problem;

import org.apache.log4j.Logger;

import java.math.BigInteger;



public class _048SelfPowers  {

	static Logger logger = Logger.getLogger(_048SelfPowers.class);

	public int limit = 1000;

	public BigInteger solve() {

		BigInteger number = BigInteger.ZERO;

		for (int i = 1; i < limit; i++) {

			number = number.add(BigInteger.valueOf(i).pow(i));

		}
	
		return number.mod(BigInteger.TEN.pow(10));
	}

}
