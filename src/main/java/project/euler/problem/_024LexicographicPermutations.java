package project.euler.problem;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/30/14.
 */
public class _024LexicographicPermutations implements IProblem {
	static Logger logger = Logger.getLogger(_024LexicographicPermutations.class);

	private final long position = 1000000;

	public Long solve() {

		int digit = 10;
		long[] number = new long[digit];
		List<Long> list = new ArrayList<>();

		for (long i = 0; i < digit; i++) {
			list.add(i);
		}
		long pos = position;

		for (int i = 9; i >= 0; i--) {
			long fact = factorial(i);
			long result = pos / fact;
			if (pos % fact == 0)
				result = result - 1;
			pos = pos - fact * result;

			result = list.get((int) result);

			list.remove(new Long(result));
			number[digit - (i + 1)] = result;
		}

		StringBuilder sb = new StringBuilder(number.length);
		for (long i : number) {
			sb.append(i);
		}

		return Long.valueOf(sb.toString());
	}

	private static long factorial(int n) {

		if (n == 0)
			return 1;
		int result = 1;
		for (int i = 1; i <= n; i++) {
			result *= i;
		}
		return result;
	}

}
