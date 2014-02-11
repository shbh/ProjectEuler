package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class MultiplesOf3And5 implements IProblem {

	int limit = 0;

	public Integer solve() {

		int sum = 0;
		for (int counter = 1; counter < limit; counter++) {
			if (counter % 3 == 0 || counter % 5 == 0) {
				sum += counter;
			}

		}
		return sum;
	}

	public MultiplesOf3And5 limit(int limit) {

		this.limit = limit;
		return this;
	}
}
