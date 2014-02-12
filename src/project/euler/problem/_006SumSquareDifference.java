package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _006SumSquareDifference implements IProblem {

	private int limit = 100;

	public Long solve() {
		long Sum = 0;
		long Square = 0;

		for (int n = 0; n <= limit; n++) {
			Sum += n * n;
			Square += n;
		}

		return Square * Square - Sum;

	}

	public int getNo() {

		return 6;
	}

}
