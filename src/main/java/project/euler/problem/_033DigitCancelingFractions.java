package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;
import project.euler.util.Functions;

public class _033DigitCancelingFractions implements IProblem {
	static Logger logger = Logger.getLogger(_033DigitCancelingFractions.class);

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
							final int gcd = Functions
									.greatestCommonFactor(n, d);

							den = den * (d / gcd);
							num = num * (n / gcd);

						}
					}
				}
			}
		}
		return den / Functions.greatestCommonFactor(num, den);
	}

}
