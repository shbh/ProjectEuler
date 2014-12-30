package com.project.euler.problem;

import java.math.BigInteger;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

public class _055LychrelNumbers implements IProblem {

	static Logger logger = Logger.getLogger(_055LychrelNumbers.class);

	public Integer solve() {
	
		int answer = 0;

		for (int i = 0; i < 10000; i++) {
		
			BigInteger number = BigInteger.valueOf(i);

			if (Functions.isLychrel(number)) {
			
				answer++;
			
			}

		}

		return answer;
	}

	

}
