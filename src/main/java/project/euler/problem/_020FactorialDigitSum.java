package project.euler.problem;

import java.math.BigInteger;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/30/14.
 */
public class _020FactorialDigitSum implements IProblem {

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
