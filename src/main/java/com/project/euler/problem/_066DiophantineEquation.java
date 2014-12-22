package com.project.euler.problem;

import java.math.BigInteger;

import com.project.euler.IProblem;

public class _066DiophantineEquation implements IProblem {

	static class Value {
		BigInteger b = BigInteger.ONE;
		BigInteger k = BigInteger.ZERO;
		BigInteger m = BigInteger.ZERO;
		BigInteger a = BigInteger.ZERO;
		int D = 0;

		@Override
		public String toString() {
			return "Value [b=" + b + ", k=" + k + ", m=" + m + ", a=" + a + ", D=" + D + "]";
		}

	}

	public Integer solve() {
		int limitOfD = 1000;
		int result = 0;
		BigInteger maxX = BigInteger.ZERO;
		for (int D = 0; D <= limitOfD; D++) {
			// Equation : x2-Dy2=1 where y is less than D.
			// 1 + Dy2 = x2
			Value v = new Value();
			v.b = BigInteger.ONE;
			v.k = BigInteger.ZERO;
			v.a = BigInteger.valueOf(findNearestSquare(D));
			v.m = BigInteger.ZERO;
			v.D = D;
			if (v.a.compareTo(BigInteger.valueOf(-1))==1) {
				findPell(v);
				
				if(v.a.compareTo(maxX)==1)
				{
					maxX = v.a;
					result=v.D;
				}
				
			}

		}

		return result;
	}

	private Value findPell(Value v) {
		// TODO Auto-generated method stub
		v.k = v.a.multiply(v.a).subtract(BigInteger.valueOf(v.D).multiply(v.b.multiply(v.b)));
		if (v.k.compareTo(BigInteger.ZERO)!=0) {

			BigInteger fk = v.k.abs();

			v.m = findNearestDifference(v.a, v.b, v.k, v.D);
			BigInteger newa = ((v.a.multiply(v.m)).add(BigInteger.valueOf(v.D).multiply(v.b))).divide(fk);
			BigInteger newb = (v.a.add(v.b.multiply(v.m))).divide(fk);
			BigInteger newk = ((v.m.multiply(v.m)).subtract(BigInteger.valueOf(v.D))).divide(v.k);
			v.a = newa;
			v.b = newb;
			v.k = newk;
		}
		if (v.k.compareTo(BigInteger.valueOf(-1))==0) {
			System.out.println(v);
			return findBhaskar(v);
		} else if (v.k.compareTo(BigInteger.valueOf(1))==0) {
			System.out.println(v);
			return v;
		} else {
			System.out.println(v);
			return findPell(v);
		}
	}

	private Value findBhaskar(Value v) {
		
		BigInteger newa = ((v.a.multiply(v.a)).add(BigInteger.valueOf(v.D).multiply(v.b.multiply(v.b)))).divide(v.k.abs());
		BigInteger newb = (BigInteger.valueOf(2).multiply(v.a).multiply(v.b)).divide(v.k.abs());
		v.a = newa;
		v.b = newb;

		return v;
	}

	private BigInteger findNearestDifference(BigInteger a, BigInteger b, BigInteger k, int D) {
		// TODO Auto-generated method stub

		BigInteger diff = BigInteger.ZERO;
		BigInteger m = BigInteger.ZERO;
		BigInteger lastm = BigInteger.ZERO;

		while (true) {

			BigInteger n = (a.add(b.multiply(m))).divide(k);
			BigInteger cn = (n.multiply(k)).subtract(b.multiply(m));
			if (a.compareTo(cn)==0) {
				BigInteger temp = (m.multiply(m).subtract(BigInteger.valueOf(D))).abs();
				if (diff.compareTo(BigInteger.ZERO)==0) {
					diff = temp;
					lastm = m;

				} else if (temp.compareTo(diff)<0) {
					diff = temp;
					lastm = m;

				} else {
					return lastm;
				}

			}

			m = m.add(BigInteger.ONE);
		}

	}

	private int findNearestSquare(int number) {
		// TODO Auto-generated method stub
		int sqrt = (int) Math.sqrt(number);
		if (sqrt * sqrt == number) {
			return -1;
		} else {
			int lowestsquare = sqrt * sqrt;
			int greatestsquare = (sqrt + 1) * (sqrt + 1);
			int diff = number - lowestsquare;
			if ((greatestsquare - number) < diff) {
				return sqrt + 1;
			} else {
				return sqrt;
			}

		}

	}

	

}
