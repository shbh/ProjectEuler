package com.project.euler.problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;
import com.project.euler.feature.KeyConstant;

public class _037TruncatablePrimes implements IProblem {
	
	static Logger logger = Logger.getLogger(_037TruncatablePrimes.class);

	private final int limit = 11;

	public Integer solve() {

		int count = 0;
		
		List<String> list = new ArrayList<>();

		Integer sum = 0;
		
		// 3 and 7 are prime.. Starting with 13
		for (int i = 13; count < limit;) {

			if (Functions.isPrime(i)) {
			
				Set<String> combinations = Functions.generate(KeyConstant.BLANK + i);

				boolean isPrimeCombination = false;

				for (Iterator<String> iterator = combinations.iterator(); iterator
						.hasNext();) {

					String string = (String) iterator.next();
				
					if (Functions.isPrime(Integer.valueOf(string))) {
						
						isPrimeCombination = true;
					
						continue;
					}
					else 
					{
						
						isPrimeCombination = false;
						
						break;
						
					}
				}
				
				if (isPrimeCombination) {
					
					list.add(Integer.toString(i));

					count = count + 1;

					sum = sum + i;

				}

			}

			if (i % 10 == 7) {
				
				i = i + 6;
				
			} 
			else if (i % 10 == 3) 
			{
				i = i + 4;
				
			}

		}
		
		return sum;

	}

	

}
