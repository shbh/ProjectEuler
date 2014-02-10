package project.euler;

import java.math.BigInteger;

import project.euler.base.IProblem;

public class SelfPowers implements IProblem {

	public int limit = 0;

	public BigInteger solve() {

		BigInteger number = BigInteger.ZERO;

		for (int i = 1; i < limit; i++) {

			number = number.add(BigInteger.valueOf(i).pow(i));
			// System.out.println(number);
		}
		return number.mod(BigInteger.TEN.pow(10));
	}
	
	public SelfPowers limit(int limit)
	{
		this.limit = limit;
		return this;
	}
}
