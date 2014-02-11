package project.euler.problem;

import project.euler.base.IProblem;


public class DigitFifthPowers implements IProblem {

	private int digit = 5;
	
	public  Integer solve() {
		
		int result = 0;
		// Retrieve Upper Bound.. X*9^Digit
		int limit = (digit+1)*(int)Math.pow(9, digit);
		
		
		for (int i = 2; i < limit; i++) {
			
		    int sum = 0;
		    
		    int number = i;
		    
		    while (number > 0) {
		        int remainder = number % 10;
		        number = number/10;
		 
		        sum += (int)Math.pow(remainder,digit);
		    }
		 
		    if (sum == i) {
		        result += i;
		    }
		}
		return result;		
	}

	public DigitFifthPowers digit(int digit) {
		this.digit = digit;
		return this;
	}
	
}
