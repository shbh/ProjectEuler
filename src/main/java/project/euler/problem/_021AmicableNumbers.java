package project.euler.problem;

import java.util.HashSet;
import java.util.Set;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/30/14.
 */
public class _021AmicableNumbers implements IProblem {

	private final int limit = 10000;

	public Integer solve() {

		int[] numbers = new int[limit * 10];
		numbers[0] = 0;
		int sum = 0;

		Set<Integer> unique = new HashSet<Integer>();

		for (int i = 1; i < limit; i++) {
			numbers[i] = Learning.sumofdivisor(i);
		}

		for (int i = 1; i < limit; i++) {

			if (i == numbers[numbers[i]] && i != numbers[i]) {
				unique.add(i);
				unique.add(numbers[i]);

			}
		}

		for (Integer item : unique) {
			sum += item;
		}

		return sum;

	}

}
