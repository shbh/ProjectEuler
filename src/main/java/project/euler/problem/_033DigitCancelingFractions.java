package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _033DigitCancelingFractions implements IProblem {

	private final int denominator = 100;
	private final int numerator = 100;

	public Integer solve() {

		int n = 10;
		int d = 10;
		int num = 1;
		int den = 1;
		for (n = 10; n < numerator; n++) {
			for (d = 10; d < denominator; d++) {
				if (n >= d) {
					continue;
				} else {
					final int f = n % 10;
					final int g = d / 10;
					final int h = n / 10;
					final int i = d % 10;

					if (f == g) {
						if (h * d == n * i) {
							final int gcd = Learning.greatestCommonFactor(n, d);

							den = den * (d / gcd);
							num = num * (n / gcd);

						}
					}
				}
			}
		}
		return den / Learning.greatestCommonFactor(num, den);
	}

	public int getNo() {

		return 33;
	}

}
