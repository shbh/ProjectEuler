package project.euler;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class DigitCancelingFractions implements IProblem{

	private int denominator;
	private int numerator;

	public Integer solve() {


		int n = 10;
		int d = 10;
		int num= 1;
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
							
							num =den * (d/gcd);
							num= num*( n/gcd);
						}
					}
				}
			}
		}
		return den/Learning.greatestCommonFactor(num, den);
	}

	public DigitCancelingFractions numerator(int numerator) {
		this.numerator= numerator;
		return this;
	}

	public DigitCancelingFractions denominator(int denominator) {
		this.denominator=denominator;
		return this;
	}
	
	

}
