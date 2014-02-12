package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/28/14.
 */
public class _004LargestPalindromeProduct implements IProblem {

	private int lower = 100;
	private int upper = 1000;

	public Integer solve() {
		upper = upper - 1;
		lower = lower - 1;
		int largestpalindromeproduct = 0;
		for (int n = upper; n > lower; n--) {
			for (int m = upper; m > lower; m--) {
				int product = n * m;
				if (product > largestpalindromeproduct
						&& Learning.isPalindrome(product)) {
					largestpalindromeproduct = product;
				}
			}
		}
		return largestpalindromeproduct;
	}

	public int getNo() {

		return 4;
	}

}
