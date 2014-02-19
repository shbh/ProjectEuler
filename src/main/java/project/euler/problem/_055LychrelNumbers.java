package project.euler.problem;

import java.math.BigInteger;

import org.apache.log4j.Logger;

import project.euler.IProblem;
import project.euler.feature.Functions;

public class _055LychrelNumbers implements IProblem {

	static Logger logger = Logger.getLogger(_055LychrelNumbers.class);

	public Integer solve() {
	
		int answer = 0;

		for (int i = 0; i < 10000; i++) {
		
			BigInteger number = BigInteger.valueOf(i);

			if (IsLychrel(number)) {
			
				answer++;
			
			}

		}

		return answer;
	}

	private boolean IsLychrel(BigInteger number) {
		
		BigInteger testNumber = number;
		
		for (int i = 0; i < 50; i++) {
		
			testNumber = testNumber.add(new BigInteger(Functions.reverse(testNumber.toString())));
			
			if (Functions.isPalindrome(testNumber.toString()))
			{
			
				return false;
			
			}
		}

		return true;
	}

}
