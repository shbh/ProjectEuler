package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _001MultiplesOf3And5 implements IProblem {

	int limit = 1000;

	public Integer solve() {

		int sum = 0;
		for (int counter = 1; counter < limit; counter++) {
			if (counter % 3 == 0 || counter % 5 == 0) {
				sum += counter;
			}

		}
		return sum;
	}

	public int getNo() {

		return 1;
	}

}
