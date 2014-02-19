package project.euler.problem;

import org.apache.log4j.Logger;

import java.math.BigInteger;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/29/14.
 */
public class _016PowerDigitSum implements IProblem {

	static Logger logger = Logger.getLogger(_016PowerDigitSum.class);
	
	int limit = 1000;

	public Integer solve() {
		
		int n = 2;

		BigInteger hugesum = BigInteger.valueOf(n).pow(limit);

		int length = hugesum.toString().length();
		
		int sum = 0;

		while (hugesum.compareTo(new BigInteger("0")) != 0) {

			BigInteger remainder = hugesum.divide(BigInteger.TEN.pow(length - 1));

			hugesum = hugesum.subtract(BigInteger.TEN.pow(length - 1).multiply(remainder));

			length = hugesum.toString().length();

			sum += remainder.intValue();

		}
		
		return sum;

	}

}
