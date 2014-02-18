package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Functions;

/**
 * Created by shashi on 1/28/14.
 */
public class _003LargestPrimeFactor implements IProblem {

	private final long inputnumber = 600851475143l;

	public Long solve() {
		long largenumber = inputnumber;

		return divideNumber(largenumber, 2, 0);

	}

	private final long divideNumber(long largenumber, long number,
			long largeprimefactor) {

		boolean isfactored = true;

		while (true) {

			if (largenumber % number != 0) {

				isfactored = false;
				number++;
				if (largenumber <= number) {
					largeprimefactor = largenumber;
					return largeprimefactor;
				}
			} else {

				isfactored = true;
				break;
			}
		}

		if (isfactored) {
			largenumber = largenumber / number;
			largeprimefactor = (number > largeprimefactor && Functions
					.isPrime(number)) ? number : largeprimefactor;
			return divideNumber(largenumber, 2, largeprimefactor);
		} else {
			return largeprimefactor;
		}
	}

	


}
