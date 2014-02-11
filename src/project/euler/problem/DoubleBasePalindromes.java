package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class DoubleBasePalindromes implements IProblem {

	private int limit = 0;
	public Integer solve() {
		int result = 0;

		for (int i = 1; i < limit; i++)
			if (Learning.isDoubleBasePalindrome(i)) {
				result += i;
			}

		return result;
	}
	
	public DoubleBasePalindromes limit(int limit)
	{
		this.limit = limit;
		return this;
	}
}
