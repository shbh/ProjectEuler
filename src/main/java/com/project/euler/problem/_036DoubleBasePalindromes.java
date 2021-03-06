package com.project.euler.problem;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _036DoubleBasePalindromes  {
	
	static Logger logger = Logger.getLogger(_036DoubleBasePalindromes.class);

	private static final int LIMIT = 1000000;

	public Integer solve() {
	
		int result = 0;

		for (int i = 1; i < LIMIT; i++) {
		
			if (Functions.isDoubleBasePalindrome(i)) {
		
				result += i;
		
			}
		
		}
		
		return result;
	}

}
