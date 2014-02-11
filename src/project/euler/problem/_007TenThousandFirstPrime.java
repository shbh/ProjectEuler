package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/28/14.
 */
public class _007TenThousandFirstPrime implements IProblem {

	private long number = 0;

	public Long solve() {
		long no = 1;
		int boundry = 1;// including 2 as condition is starting with 3

		while (true) {
			no = no + 2;
			if (Learning.isPrime(no)) {
				boundry = boundry + 1;
			}

			if (boundry == number) {
				break;
			}

		}
		return no;

	}

	public _007TenThousandFirstPrime number(long number) {
		this.number = number;

		return this;
	}
}
