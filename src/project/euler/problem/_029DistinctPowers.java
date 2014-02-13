package project.euler.problem;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import project.euler.base.IProblem;

public class _029DistinctPowers implements IProblem {

	private  int lowerA = 2;
	private  int upperA = 100;
	private  int lowerB = 2;
	private  int upperB = 100;

	public Integer solve() {

		Set<BigInteger> powers = new HashSet<>();

		for (int i = lowerA; i <= upperA; i++) {
			for (int j = lowerB; j <= upperB; j++) {
				powers.add(BigInteger.valueOf(i).pow(j));
			}
		}

		return powers.size();
	}

	public _029DistinctPowers a(int lower, int upper) {
		this.lowerA = lower;
		this.upperA = upper;
		return this;
	}

	public _029DistinctPowers b(int lower, int upper) {
		this.lowerB = lower;
		this.upperB = upper;
		return this;
	}

	public int getNo() {

		return 29;
	}

}
