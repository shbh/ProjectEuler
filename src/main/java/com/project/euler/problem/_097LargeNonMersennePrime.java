package com.project.euler.problem; 
import java.math.BigInteger;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;

public class _097LargeNonMersennePrime implements IProblem { 

	static Logger logger = Logger.getLogger(_097LargeNonMersennePrime.class);


	public BigInteger solve() {
//
//		long result =0;
//		BigInteger number =  BigInteger.valueOf(28433).multiply(BigInteger.valueOf(2).pow(7830457)).add(BigInteger.ONE);
//		result = number.mod(BigInteger.TEN.pow(10)).longValue();
//		System.out.println(BigInteger.valueOf(2).modPow(BigInteger.TEN, BigInteger.valueOf(10000)));
		BigInteger mod = BigInteger.TEN.pow(10);
		return (BigInteger.valueOf(28433).multiply(BigInteger.valueOf(2).modPow(BigInteger.valueOf(7830457), mod)).add(BigInteger.ONE)).mod(mod);
		
		
		
	}


}
