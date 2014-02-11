package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/28/14.
 */
public class LargestPalindromeProduct implements IProblem {

	private int upper=0;
	private int lower=0;

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
	
	public LargestPalindromeProduct upper(int upper)
	{
		this.upper = upper;
		return this;
	}
	
	public LargestPalindromeProduct lower(int lower)
	{
		this.lower= lower;
		return this;
	}
}
