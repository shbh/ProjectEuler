package project.euler.problem;

import java.util.Iterator;
import java.util.Set;

import project.euler.base.IProblem;
import project.euler.util.Learning;
import project.euler.util.Permutations;

public class _041PandigitalPrime implements IProblem {

	public Integer solve() {
		int n = 123456789;

		int m = n;

		int pandigitalNumber = 0;
		boolean yougotit = false;
		for (int i = 1; i < 9; i++) {

			Set<String> combinations = Permutations.generateCombination(Integer
					.toString(m));

			for (Iterator<String> iterator = combinations.iterator(); iterator
					.hasNext();) {
				String number = (String) iterator.next();

				if (Learning.isPrime(Long.parseLong(number))) {
					pandigitalNumber = Integer.parseInt(number);
					yougotit = true;
					break;
				}

			}
			if (yougotit) {
				break;
			}
			m = n / (int) Math.pow(10, i);

		}
		return pandigitalNumber;
	}

}
