package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/29/14.
 */
public class _014LongestCollatzSequence implements IProblem {

	private final int limit = 1000000;

	public Integer solve() {

		int sequenceLength = 0;
		int startingNumber = 0;
		long sequence;

		int[] cache = new int[limit + 1];
		// Initialise cache
		for (int i = 0; i < cache.length; i++) {
			cache[i] = -1;
		}
		cache[1] = 1;

		for (int i = 2; i <= limit; i++) {
			sequence = i;
			int count = 0;
			while (sequence != 1 && sequence >= i) {
				count++;
				if ((sequence % 2) == 0) {
					sequence = sequence / 2;
				} else {
					sequence = sequence * 3 + 1;
				}
			}
			// Store result in cache
			cache[i] = count + cache[(int) sequence];

			// Check if sequence is the best solution
			if (cache[i] > sequenceLength) {
				sequenceLength = cache[i];
				startingNumber = i;
			}
		}
		return startingNumber;
	}

	public int getNo() {

		return 14;
	}

}
