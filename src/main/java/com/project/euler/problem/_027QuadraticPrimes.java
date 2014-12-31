package com.project.euler.problem;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.euler.feature.Functions;

/**
 * Created by shashi on 1/31/14.
 */
public class _027QuadraticPrimes {

	static Logger logger = Logger.getLogger(_027QuadraticPrimes.class);

	private final Integer limit = 1000;

	public Integer solve() {

		List<Integer> bs = new ArrayList<>();

		int[] result = new int[2];
		
		for (int i = 1; i < limit; i++) {

			if (Functions.isPrime(i)) {

				bs.add(i);

				bs.add(-i);

			}
		}

		Collections.sort(bs);

		for (Iterator<Integer> iterator = bs.iterator(); iterator.hasNext();) {

			Integer b = (Integer) iterator.next();

			if (b % 2 == 0) {

				for (int a = -limit + 2; a < limit; a = a + 2) {
					findMaximumQuadric(a,b,result);
				}
			} else {
				for (int a = -limit + 1; a < limit; a = a + 2) {
					findMaximumQuadric(a,b,result);
				}
			}

		}

		return result[1];

	}

	private int[] findMaximumQuadric(int a,int b, int[] result) {
		// TODO Auto-generated method stub
		int count = Functions.validateQuadric(a, b);
		if (count > result[0]) {
			result[0]= count;
			result[1] = a * b;
		}
		
		return result;
	}
	
	

}
