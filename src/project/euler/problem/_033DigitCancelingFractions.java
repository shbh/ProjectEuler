package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _033DigitCancelingFractions implements IProblem {

	private int denominator = 100;
	private int numerator = 100;

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
					int f = n % 10;
					int g = d / 10;
					int h = n / 10;
					int i = d % 10;

					if (f == g) {
						if (h * d == n * i) {
							int gcd = Learning.greatestCommonFactor(n, d);

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
