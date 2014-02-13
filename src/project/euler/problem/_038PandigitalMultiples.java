package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _038PandigitalMultiples implements IProblem {

	public Integer solve() {
		int result = 0;
		for (int i = 9876; i > 9183; i--) {

			final int val = i * 100002;
			if (Learning.isPandigital(Integer.toString(val)))
			{
				result = val;
				break;
			}
		}

		return result;
	}

	public int getNo() {

		return 38;
	}

}
