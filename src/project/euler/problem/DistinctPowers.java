package project.euler.problem;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import project.euler.base.IProblem;

public class DistinctPowers implements IProblem{

	private int lowerA = 0;
	private int upperA = 0;
	private int lowerB = 0;
	private int upperB = 0;

	public Integer solve() {

		Set<BigInteger> powers = new HashSet<>();

		for (int i = lowerA; i <= upperA; i++) {
			for (int j = lowerB; j <= upperB; j++) {
				powers.add(BigInteger.valueOf(i).pow(j));
			}
		}
		return powers.size();
	}

	public DistinctPowers a(int lower, int upper) {
		this.lowerA = lower;
		this.upperA = upper;
		return this;
	}
	
	public DistinctPowers b(int lower, int upper) {
		this.lowerB = lower;
		this.upperB = upper;
		return this;
	}

}
