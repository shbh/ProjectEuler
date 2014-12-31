package com.project.euler.problem;

import java.math.BigInteger;

import org.apache.log4j.Logger;



public class _097LargeNonMersennePrime  {

	static Logger logger = Logger.getLogger(_097LargeNonMersennePrime.class);

	public BigInteger solve() {
		
		BigInteger mod = BigInteger.TEN.pow(10);
		BigInteger value = BigInteger.valueOf(2).modPow(BigInteger.valueOf(7830457), mod);
		value = BigInteger.valueOf(28433).multiply(value).add(BigInteger.ONE);
		return value.mod(mod);

	}

}
