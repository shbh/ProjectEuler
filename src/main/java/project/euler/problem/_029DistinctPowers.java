package project.euler.problem;

import org.apache.log4j.Logger;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

import project.euler.base.IProblem;

public class _029DistinctPowers implements IProblem {
	static Logger logger = Logger.getLogger(_029DistinctPowers.class);

	private int lowerA = 2;
	private int upperA = 100;
	private int lowerB = 2;
	private int upperB = 100;

	public Integer solve() {

		Set<BigInteger> powers = new HashSet<>();

		for (int i = lowerA; i <= upperA; i++) {
			for (int j = lowerB; j <= upperB; j++) {
				powers.add(BigInteger.valueOf(i).pow(j));
			}
		}

		return powers.size();
	}

}
