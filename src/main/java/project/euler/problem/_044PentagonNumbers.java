package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _044PentagonNumbers implements IProblem {

	public Integer solve() {

		int result = 0;
		boolean notFound = true;
		int i = 1;

		while (notFound) {
			i++;
			int n = i * (3 * i - 1) / 2;

			for (int j = i - 1; j > 0; j--) {
				int m = j * (3 * j - 1) / 2;
				if (Learning.isPentagonal(n - m)
						&& Learning.isPentagonal(n + m)) {
					result = n - m;
					notFound = false;
					break;
				}
			}
		}
		return result;

	}

	public int getNo() {

		return 44;
	}

}
