package project.euler.problem;

import org.apache.log4j.Logger;

import java.math.BigInteger;

import project.euler.IProblem;

public class _053CombinatoricSelections implements IProblem {
	
	static Logger logger = Logger.getLogger(_053CombinatoricSelections.class);

	private final BigInteger[] factorial = new BigInteger[100 + 1];

	public BigInteger factorial(int n) {

		
		if (n == 0)
		{
			return BigInteger.ONE;
			
		}
		
		BigInteger result = BigInteger.ONE;
		
		for (int i = 1; i <= n; i++) {
		
			result = result.multiply(BigInteger.valueOf(i));
		
		}
		
		return result;
	}

	public Integer solve() {

		int i = 1;
		
		int j = 100;
		
		int count = 0;
		
		factorial[0] = BigInteger.ONE;
		
		for (int k = i; k <= j; k++) {
		
			factorial[k] = factorial[k - 1].multiply(BigInteger.valueOf(k));
			
		}

		for (int k = 1; k <= j; k++) {
		
			for (int l = 0; l <= k; l++) {
			
				BigInteger result = combinatorics(k, l);
				
				if (result.compareTo(BigInteger.valueOf(1000000)) > 0)
				
					count++;
			}

		}
		
		return count;

	}

	private final BigInteger combinatorics(int k, int l) {

		return factorial[k].divide(factorial[l].multiply(factorial[k - l]));
	}

}
