package project.euler.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _035CircularPrimes implements IProblem {

	private int limit = 1000000;

	public Integer solve() {

		int count = 1;
		List<String> list = new ArrayList<>();
		Set<String> unique = new HashSet<>();

		for (int i = 1; i < limit; i = i + 2) {
			if (i == 1)
				continue;

			if (unique.contains(Integer.toString(i))) {
				continue;
			}

			if (Learning.isPrime(i) && !Learning.isNumberContainEven("" + i)) {
				// System.out.println(i);
				Set<String> combinations = Learning.generateCircular("" + i);

				boolean isPrimeCombination = false;

				for (Iterator<String> iterator = combinations.iterator(); iterator
						.hasNext();) {

					String string = (String) iterator.next();
					if (Learning.isPrime(Integer.valueOf(string))) {
						isPrimeCombination = true;
						continue;
					} else {
						isPrimeCombination = false;
						break;
					}
				}
				if (isPrimeCombination) {
					list.addAll(combinations);

					count = count + combinations.size();
				}

				unique.addAll(combinations);
			}

		}
		return count;

	}

	public int getNo() {

		return 35;
	}

}
