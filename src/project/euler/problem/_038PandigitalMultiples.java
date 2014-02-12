package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _038PandigitalMultiples implements IProblem {

	public Integer solve() {
		for (int i = 9876; i > 9183; i--) {

			int val = i * 100002;
			if (Learning.isPandigital(Integer.toString(val)))
				return val;
		}

		return -1;
	}

	public int getNo() {

		return 38;
	}

}
