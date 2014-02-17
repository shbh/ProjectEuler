package project.euler.problem;

import project.euler.base.IProblem;

public class _040ChampernowneConstant implements IProblem {

	int limit = 7;

	public Integer solve() {


		// 0.123456789101112131415161718192021...
		// 0-9
		// 1-180

		int[] n = new int[limit + 1];
		int next = 1;
		for (int i = 1; i < n.length; i++) {
			// int digitlength = i+1;
			int numbers = ((i) * 9) * ((int) Math.pow(10, (i - 1)));
			// int firstindex = n[i-1] + 1;
			n[i] = next;
			next = next + numbers;

		}

		return findingposition(1, n) * findingposition(10, n)
				* findingposition(100, n) * findingposition(1000, n)
				* findingposition(10000, n) * findingposition(100000, n)
				* findingposition(1000000, n);

	}

	private final int findingposition(int number, int[] n) {

		int bar = 0;
		for (int j = 0; j < n.length; j++) {

			if (number < n[j]) {
				if (number == n[j - 1]) {
					bar = j - 1;
					break;
				} else if (number > n[j - 1]) {
					bar = j - 1;
					break;
				}
			}

		}
		// bar = 2
		int x = n[bar] - 1;// 9
		int y = number - x;// 6
		int z = y % bar;// 0
		int w = y / bar;// 3

		y = (int) Math.pow(10, bar - 1) - 1 + w;// 12
		// System.out.println(w);
		if (z != 0) {
			y = y + 1;// 13

		} else {
			z = bar;
		}

		int g = z - 1;

		return Integer.parseInt(Integer.toString(y).substring(g, g + 1));

	}


}
