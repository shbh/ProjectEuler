package com.project.euler.problem;

import java.math.BigInteger;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;

public class _097LargeNonMersennePrime implements IProblem {

	static Logger logger = Logger.getLogger(_097LargeNonMersennePrime.class);

	public BigInteger solve() {
		
		BigInteger mod = BigInteger.TEN.pow(10);
		BigInteger value = BigInteger.valueOf(2).modPow(BigInteger.valueOf(7830457), mod);
		value = BigInteger.valueOf(28433).multiply(value).add(BigInteger.ONE);
		return value.mod(mod);

	}

}
