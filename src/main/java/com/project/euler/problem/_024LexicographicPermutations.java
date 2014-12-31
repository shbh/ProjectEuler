package com.project.euler.problem;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

/**
 * Created by shashi on 1/30/14.
 */
public class _024LexicographicPermutations  {
	
	static Logger logger = Logger.getLogger(_024LexicographicPermutations.class);

	private final long position = 1000000;

	public Long solve() {

		int digit = 10;
		
		long[] number = new long[digit];
		
		List<Long> list = new ArrayList<>();

		for (long i = 0; i < digit; i++) {
		
			list.add(i);
		
		}
		long pos = position;

		for (int i = 9; i >= 0; i--) {
			
			long fact = Functions.factorial(i);
		
			long result = pos / fact;
		
			if (pos % fact == 0){
			
				result = result - 1;
			
			}
			
			pos = pos - fact * result;

			result = list.get((int) result);

			list.remove(new Long(result));
			
			number[digit - (i + 1)] = result;
		}

		StringBuilder sb = new StringBuilder(number.length);
		
		for (long i : number) {
		
			sb.append(i);
		
		}

		return Long.valueOf(sb.toString());
	}

	

}
