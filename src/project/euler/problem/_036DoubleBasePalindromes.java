package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _036DoubleBasePalindromes implements IProblem {

	private static final int LIMIT = 1000000;

	public Integer solve() {
		int result = 0;

		for (int i = 1; i < LIMIT; i++){
			if (Learning.isDoubleBasePalindrome(i)) {
				result += i;
			}
		}
		return result;
	}

	public int getNo() {

		return 36;
	}

}
