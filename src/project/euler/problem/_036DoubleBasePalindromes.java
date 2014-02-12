package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _036DoubleBasePalindromes implements IProblem {

	private int limit = 1000000;

	public Integer solve() {
		int result = 0;

		for (int i = 1; i < limit; i++)
			if (Learning.isDoubleBasePalindrome(i)) {
				result += i;
			}

		return result;
	}

	public int getNo() {

		return 36;
	}

}
