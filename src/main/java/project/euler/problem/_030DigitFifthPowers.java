package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;

public class _030DigitFifthPowers implements IProblem {
	static Logger logger = Logger.getLogger(_030DigitFifthPowers.class);

	private static final int DIGIT = 5;

	public Integer solve() {

		int result = 0;
		// Retrieve Upper Bound.. X*9^Digit
		final int limit = (DIGIT + 1) * (int) Math.pow(9, DIGIT);

		for (int i = 2; i < limit; i++) {

			int sum = 0;

			int number = i;

			while (number > 0) {
				final int remainder = number % 10;
				number = number / 10;

				sum += (int) Math.pow(remainder, DIGIT);
			}

			if (sum == i) {
				result += i;
			}
		}
		return result;
	}

}
