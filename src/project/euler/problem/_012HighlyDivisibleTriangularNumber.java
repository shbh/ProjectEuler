package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/29/14.
 */
public class _012HighlyDivisibleTriangularNumber implements IProblem {

	private static int total = 500;

	public Long solve() {
		long trianglenumber = 0;
		int lastnumber = 1;
		total = total / 2;

		while (true) {
			trianglenumber = trianglenumber + lastnumber;
			lastnumber++;

			final int count = Learning.countdivisor(trianglenumber);
			if (count >= total) {
				break;
			}
		}
		return trianglenumber;

	}

	public int getNo() {

		return 12;
	}

}
