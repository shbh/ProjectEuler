package com.project.euler.problem;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _046GoldbachsOtherConjecture  {
	
	static Logger logger = Logger.getLogger(_046GoldbachsOtherConjecture.class);

	public Long solve() {

		int[] prime = new int[1000];
		
		long[] sqrt = new long[100];
		
		prime[0] = 2;
		
		prime[1] = 3;
		
		prime[2] = 5;
		
		prime[3] = 7;

		for (int i = 0; i < sqrt.length; i++) {
		
			sqrt[i] = i * i;
		
		}
		
		int index = 4;
		
		long i = 7;
		
		while (true) {
		
			i = i + 2;
			
			if (Functions.isComposite(i)) {

				if (Functions.isConjecture(i, sqrt, prime)) {
			
					return i;
				
				}

			} 
			else 
			{

				prime[index++] = (int) i;
			}
		}
	}

	
}
