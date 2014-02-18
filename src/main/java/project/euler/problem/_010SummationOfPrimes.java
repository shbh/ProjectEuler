package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Functions;

/**
 * Created by shashi on 1/28/14.
 */
public class _010SummationOfPrimes implements IProblem {

	private static final int LIMIT = 2000000;

	public Long solve() {
		long sum = 2;// adding first prime number 2
		for (long l = 3; l < LIMIT; l = l + 2) {
			if (Functions.isPrime(l)) {

				sum += l;
			}
		}
		return sum;
	}

	


}
