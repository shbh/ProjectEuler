package project.euler;

import java.math.BigInteger;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/31/14.
 */
public class ThousandDigitFibonacciNumber implements IProblem {

	private Integer limit = 1000;

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

	public ThousandDigitFibonacciNumber limit(int limit)
	{
		this.limit = limit;
		return this;
	}
}
