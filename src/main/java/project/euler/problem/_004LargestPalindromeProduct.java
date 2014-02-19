package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;
import project.euler.feature.Functions;

/**
 * Created by shashi on 1/28/14.
 */
public class _004LargestPalindromeProduct implements IProblem {
	
	static Logger logger = Logger.getLogger(_004LargestPalindromeProduct.class);

	private static int lower = 100;
	
	private static int upper = 1000;

	public Integer solve() {
	
		upper = upper - 1;
	
		lower = lower - 1;
	
		int largestproduct = 0;
	
		for (int n = upper; n > lower; n--) {
	
			for (int m = upper; m > lower; m--) {
	
				final int product = n * m;
	
				if (product > largestproduct && Functions.isPalindrome(product)) {
	
					largestproduct = product;
		
				}
			}
		}
	
		return largestproduct;
	}

}
