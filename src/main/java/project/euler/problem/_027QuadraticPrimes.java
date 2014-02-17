package project.euler.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/31/14.
 */
public class _027QuadraticPrimes implements IProblem {

	private final Integer limit = 1000;

	public Integer solve() {

		List<Integer> bs = new ArrayList<>();
		int max = 0;
		int maxm = 0;

		for (int i = 1; i < limit; i++) {
			if (Learning.isPrime(i)) {
				bs.add(i);
				bs.add(-i);
			}
		}

		Collections.sort(bs);

		for (Iterator<Integer> iterator = bs.iterator(); iterator.hasNext();) {
			Integer b = (Integer) iterator.next();

			if (b % 2 == 0) {
				for (int a = -limit + 2; a < limit; a = a + 2) {
					int count = validateQuadric(a, b);

					if (count > max) {
						max = count;
						maxm = a * b;
					}

				}
			} else {
				for (int a = -limit + 1; a < limit; a = a + 2) {
					int count = validateQuadric(a, b);

					if (count > max) {
						max = count;
						maxm = a * b;

					}
				}
			}

		}

		return maxm;
	}

	private final int validateQuadric(int a, int b) {

		// formula n2+an+b
		int count = 0;
		boolean noprime = false;
		int n = 0;
		while (!noprime) {
			int value = (int) Math.pow(n, 2) + a * n + b;

			if (Learning.isPrime(value)) {
				count++;
				n++;
			} else {
				noprime = true;
			}

		}

		return count;
	}

	


}
