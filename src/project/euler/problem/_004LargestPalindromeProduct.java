package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/28/14.
 */
public class _004LargestPalindromeProduct implements IProblem {

	private static int lower = 100;
	private static int upper = 1000;

	public Integer solve() {
		upper = upper - 1;
		lower = lower - 1;
		int largestproduct = 0;
		for (int n = upper; n > lower; n--) {
			for (int m = upper; m > lower; m--) {
				final int product = n * m;
				if (product > largestproduct
						&& Learning.isPalindrome(product)) {
					largestproduct = product;
				}
			}
		}
		return largestproduct;
	}

	public int getNo() {

		return 4;
	}

}
