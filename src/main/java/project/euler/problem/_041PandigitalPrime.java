package project.euler.problem;

import java.util.Iterator;
import java.util.Set;

import project.euler.base.IProblem;
import project.euler.util.Functions;
import project.euler.util.Permutations;

public class _041PandigitalPrime implements IProblem {

	public Integer solve() {
		int n = 123456789;

		int m = n;

		int pandigitalNumber = 0;
		boolean yougotit = false;
		int current = 0;
		for (int i = 9; i > 0; i--) {

			Set<String> combinations = Permutations.generateCombination(Integer
					.toString(m));

			for (Iterator<String> iterator = combinations.iterator(); iterator
					.hasNext();) {
				String number = (String) iterator.next();

				if (Functions.isPrime(Long.parseLong(number))) {

					current = i;
					if (pandigitalNumber < Integer.parseInt(number)) {

						pandigitalNumber = Integer.parseInt(number);
						if (current > i) {
							yougotit = true;
							break;
						}
					}

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
