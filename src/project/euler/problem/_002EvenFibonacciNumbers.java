package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _002EvenFibonacciNumbers implements IProblem {

	private int limit = 4000000;

	public Integer solve() {
		int firstnumber = 1;
		int secondnumber = 2;

		int nextnumber = 0;
		int sum = secondnumber;
		while (nextnumber < limit) {

			nextnumber = firstnumber + secondnumber;
			firstnumber = secondnumber;
			secondnumber = nextnumber;

			if (nextnumber % 2 == 0) {
				sum += nextnumber;
			}
		}

		return sum;
	}

	public int getNo() {

		return 2;
	}

}
