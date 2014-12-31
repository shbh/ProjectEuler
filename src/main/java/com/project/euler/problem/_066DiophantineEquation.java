package com.project.euler.problem;

import java.math.BigInteger;


import com.project.euler.feature.Functions;

public class _066DiophantineEquation  {

	

	public Integer solve() {
		
		BigInteger[] numbers = new BigInteger[]{BigInteger.ZERO,BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO};
		int limitOfD = 1000;
		int result = 0;
		BigInteger maxX = BigInteger.ZERO;
		for (int D = 0; D <= limitOfD; D++) {
			// Equation : x2-Dy2=1 where y is less than D.
			// 1 + Dy2 = x2
			numbers[0] = BigInteger.valueOf(Functions.findNearestSquare(D));
			numbers[1] = BigInteger.ONE;
			numbers[2] = BigInteger.ZERO;
			numbers[3] = BigInteger.ZERO;
			
			
			if (numbers[0].compareTo(BigInteger.valueOf(-1))==1) {
				findPell(numbers,D);
				
				if(numbers[0].compareTo(maxX)==1)
				{
					maxX = numbers[0];
					result=D;
				}
				
			}

		}

		return result;
	}

	private BigInteger[] findPell(BigInteger[] numbers, int D) {
		// TODO Auto-generated method stub
		numbers[2] = numbers[0].multiply(numbers[0]).subtract(BigInteger.valueOf(D).multiply(numbers[1].multiply(numbers[1])));
		if (numbers[2].compareTo(BigInteger.ZERO)!=0) {

			BigInteger fk = numbers[2].abs();

			numbers[3] = findNearestDifference(numbers,D);
			BigInteger newa = ((numbers[0].multiply(numbers[3])).add(BigInteger.valueOf(D).multiply(numbers[1]))).divide(fk);
			BigInteger newb = (numbers[0].add(numbers[1].multiply(numbers[3]))).divide(fk);
			BigInteger newk = ((numbers[3].multiply(numbers[3])).subtract(BigInteger.valueOf(D))).divide(numbers[2]);
			numbers[0] = newa;
			numbers[1] = newb;
			numbers[2] = newk;
		}
		if (numbers[2].compareTo(BigInteger.valueOf(-1))==0) {
			
			return findBhaskar(numbers,D);
		} else if (numbers[2].compareTo(BigInteger.valueOf(1))==0) {
			
			return numbers;
		} else {
			
			return findPell(numbers,D);
		}
	}

	private BigInteger[] findBhaskar(BigInteger[] numbers, int D) {
		
		BigInteger newa = ((numbers[0].multiply(numbers[0])).add(BigInteger.valueOf(D).multiply(numbers[1].multiply(numbers[1])))).divide(numbers[2].abs());
		BigInteger newb = (BigInteger.valueOf(2).multiply(numbers[0]).multiply(numbers[1])).divide(numbers[2].abs());
		numbers[0] = newa;
		numbers[1] = newb;

		return numbers;
	}

	
	private BigInteger findNearestDifference(BigInteger[] numbers, int D) {
		// TODO Auto-generated method stub

		BigInteger diff = BigInteger.ZERO;
		BigInteger m = BigInteger.ZERO;
		BigInteger lastm = BigInteger.ZERO;

		while (true) {

			BigInteger n = (numbers[0].add(numbers[1].multiply(m))).divide(numbers[2]);
			BigInteger cn = (n.multiply(numbers[2])).subtract(numbers[1].multiply(m));
			if (numbers[0].compareTo(cn) == 0) {
				BigInteger temp = (m.multiply(m).subtract(BigInteger.valueOf(D))).abs();
				if (diff.compareTo(BigInteger.ZERO) == 0) {
					diff = temp;
					lastm = m;

				} else if (temp.compareTo(diff) < 0) {
					diff = temp;
					lastm = m;

				} else {
					return lastm;
				}

			}

			m = m.add(BigInteger.ONE);
		}

	}
	

}
