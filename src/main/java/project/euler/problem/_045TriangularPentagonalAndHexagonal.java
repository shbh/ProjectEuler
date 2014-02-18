package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Functions;

public class _045TriangularPentagonalAndHexagonal implements IProblem {

	public Long solve() {

		int initial = 143;
		long result = 0;
		while (true) {
			initial=initial+1;
			result = initial * (2 * initial - 1);
			if (Functions.isPentagonal(result)) {
				break;
			}
		}
		return result;
	}

	



}
