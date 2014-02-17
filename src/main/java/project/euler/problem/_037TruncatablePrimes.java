package project.euler.problem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import project.euler.base.IProblem;
import project.euler.base.KeyConstant;
import project.euler.util.Learning;

public class _037TruncatablePrimes implements IProblem {

	private final int limit = 11;

	public Integer solve() {

		int count = 0;
		List<String> list = new ArrayList<>();

		Integer sum = 0;
		// 3 and 7 are prime.. Starting with 13
		for (int i = 13; count < limit;) {

			if (Learning.isPrime(i)) {
				// System.out.println(i);
				Set<String> combinations = generate(KeyConstant.BLANK + i);

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
					list.add(Integer.toString(i));

					count = count + 1;

					sum = sum + i;

				}

			}

			if (i % 10 == 7) {
				i = i + 6;
			} else if (i % 10 == 3) {
				i = i + 4;
			}

		}
		return sum;

	}

	private final Set<String> generate(String string) {

		Set<String> sets = new HashSet<>();
		sets.add(string);
		String ltemp = string;
		String rtemp = string;
		for (int i = 0; i < string.length() - 1; i++) {
			ltemp = ltemp.substring(0, ltemp.length() - 1);
			rtemp = rtemp.substring(1);

			sets.add(rtemp);
			sets.add(ltemp);
		}

		return sets;
	}


}
