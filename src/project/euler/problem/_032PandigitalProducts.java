package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public final class _032PandigitalProducts implements IProblem  {

	public Integer solve() {
		
		// A candidate product has at most 4 digits. This is because if it has 5
		// digits,
		// then the two multiplicands must have at least 5 digits put together.
		int sum = 0;
		for (int i = 1; i < 10000; i++) {
			if (hasPandigitalProduct(i))
				sum += i;
		}
		return sum;
	}

	private boolean hasPandigitalProduct(int n) {
		// Find and examine all factors of n
		
		for (int i = 1; i <= n; i++) {
			if (n % i == 0 && Learning.isPandigital("" + n + i + n / i))
				return true;
		}
		return false;
	}

	

}