package project.euler.problem;

import org.apache.log4j.Logger;

import java.math.BigInteger;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/31/14.
 */
public class _025ThousandDigitFibonacciNumber implements IProblem {
	static Logger logger = Logger.getLogger(_025ThousandDigitFibonacciNumber.class);

	private final Integer limit = 1000;

	public Integer solve() {
		BigInteger start = BigInteger.ONE;
		BigInteger next = BigInteger.ONE;
		int answer = 1;

		int length = 1;

		while (length < limit) {
			BigInteger result = next.add(start);
			start = next;
			next = result;
			answer++;
			length = next.toString().length();
		}
		return answer + 1;
	}

}
