package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.IProblem;

public class _034DigitFactorials implements IProblem {

	static Logger logger = Logger.getLogger(_034DigitFactorials.class);

	public Integer solve() {

		int[] digits = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
	
		int fact[] = new int[digits.length];
		
		int totalSum = 0;
		
		fact[0] = 1;
		
		fact[1] = 1;

		for (int i = 2; i < digits.length; i++) {
		
			fact[i] = i * fact[i - 1];

		}

		// 9!*7=2540160
		for (int i = 3; i < 2540160; i++) {
		
			int sum = 0;
			
			int number = i;
			
			while (number > 0) {
			
				sum += fact[number % 10];
				
				number /= 10;
			
			}
			
			if (sum == i) {
			
				totalSum += i;
			
			}

		}
		
		return totalSum;

	}

}
