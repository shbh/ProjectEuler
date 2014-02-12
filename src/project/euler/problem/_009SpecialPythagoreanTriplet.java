package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _009SpecialPythagoreanTriplet implements IProblem {

	int marker = 1000;

	public Integer solve() {

		for (int c = 1; c <= marker; c++) {

			int a;
			int residue = marker - c;
			for (int b = 1; b < residue; b++) {
				a = residue - b;
				if (a * a + b * b == c * c) {
					return a * b * c;
				} else {
					if (a == b || a == (b - 1)) {
						break;
					}
				}
			}

		}
		return 0;

	}

	public int getNo() {

		return 9;
	}

}
