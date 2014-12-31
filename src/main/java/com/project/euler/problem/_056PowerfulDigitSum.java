package com.project.euler.problem;

import java.math.BigInteger;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _056PowerfulDigitSum  {

	static Logger logger = Logger.getLogger(_056PowerfulDigitSum.class);

	public Integer solve() {
	
		int a = 100;
		
		int b = 100;

		Integer answer = 0;

		for (int i = 1; i < a; i++) {
		
			for (int j = 0; j < b; j++) {
			
				BigInteger power = BigInteger.valueOf(i).pow(j);
				
				Integer sum = Functions.addDigit(power);

				if (sum > answer) {
				
					answer = sum;
				
				}
			}
		}

		return answer;
	}

	
}
