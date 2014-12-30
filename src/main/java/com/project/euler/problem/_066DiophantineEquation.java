package com.project.euler.problem;

import java.math.BigInteger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

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
			v.a = BigInteger.valueOf(Functions.findNearestSquare(D));
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

			v.m = Functions.findNearestDifference(v.a, v.b, v.k, v.D);
			BigInteger newa = ((v.a.multiply(v.m)).add(BigInteger.valueOf(v.D).multiply(v.b))).divide(fk);
			BigInteger newb = (v.a.add(v.b.multiply(v.m))).divide(fk);
			BigInteger newk = ((v.m.multiply(v.m)).subtract(BigInteger.valueOf(v.D))).divide(v.k);
			v.a = newa;
			v.b = newb;
			v.k = newk;
		}
		if (v.k.compareTo(BigInteger.valueOf(-1))==0) {
			
			return findBhaskar(v);
		} else if (v.k.compareTo(BigInteger.valueOf(1))==0) {
			
			return v;
		} else {
			
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

	

	

}
