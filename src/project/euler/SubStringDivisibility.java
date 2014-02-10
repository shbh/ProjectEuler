package project.euler;

public class SubStringDivisibility {

	public Integer solve() {
		SuprDewd();
	}

	public static void SuprDewd() {

		long sum = 0;

		for (int p17 = 17; p17 < 1000; p17 += 17) // Loop through all multiples
		{// 
			if (!areDistinctDigits(p17))
				continue; // Make sure the multiple has distinct digits.

			for (int p13 = 13; p13 < 1000; p13 += 13) // Loop through all
														// multiples of 13.
			{
				// Make sure the multiple of 17 ends with the starting digits of
				// the multiple of 13.
				if (p17 / 10 != p13 % 100 || !areDistinctDigits(p13))
					continue;

				for (int p11 = 11; p11 < 1000; p11 += 11) {
					if (p13 / 10 != p11 % 100 || !areDistinctDigits(p11))
						continue;

					for (int p7 = 7; p7 < 1000; p7 += 7) {
						if (p11 / 10 != p7 % 100 || !areDistinctDigits(p7))
							continue;

						for (int p5 = 5; p5 < 1000; p5 += 5) {
							if (p7 / 10 != p5 % 100 || !areDistinctDigits(p5))
								continue;

							for (int p3 = 3; p3 < 1000; p3 += 3) {
								if (p5 / 10 != p3 % 100
										|| !areDistinctDigits(p3))
									continue;

								for (int p2 = 2; p2 < 1000; p2 += 2) {
									if (p3 / 10 != p2 % 100
											|| !areDistinctDigits(p2))
										continue;
									// Extract the the correct digits from the
									// multiples and concatenate the together.
									long n = (long) concat(
											p2,
											concat(p3 % 10,
													concat(p5 % 10,
															concat(p7 % 10,
																	concat(p11 % 10,
																			concat(p13 % 10,
																					p17 % 10))))));
									// Make sure the concatenated number has
									// distinct digits.
									if (!areDistinctDigits(n))
										continue;
									// Find the last digit needed and
									// concatenated to the front of the number.
									long pan = makePandigital(n);
									// Make sure the missing digit was not a 0
									// (Because 0123456789 is not a 0-9
									// pandigital).
									if (n == pan)
										continue;
									// And finally add it to the sum.
									sum += pan;
								}
							}
						}
					}
				}
			}
		}

		System.out.println("The sum of numbers is " + sum);

	}

	// Find the last digit needed to make the number 0-9 pandigital and concat
	// it in front.
	// Will return the original number if more than one digits are needed.
	// Example:
	// 987643210 = 5987643210
	private static long makePandigital(long n) {
		boolean[] digits = new boolean[10];
		long origN = n;

		while (n > 0) {
			digits[(int) (n % 10)] = true;
			n /= 10;
		}

		long newN = 0;

		for (long i = 0; i < 10; i++) {
			if (!digits[(int) i]) {
				if (newN != 0)
					return origN;
				newN = (long) concat(i, origN);
			}
		}

		return newN == 0 ? origN : newN;
	}

	private static long concat(long a, long b) {
		long c = b;
		while (c > 0) {
			a *= 10;
			c /= 10;
		}

		return (long) a + b;
	}

	// Determine whether the number has distinct digits.
	// Example:
	// 123 = true
	// 102 = true
	// 101 = false
	private static boolean areDistinctDigits(long n) {
		boolean[] digits = new boolean[10];

		while (n > 0) {
			int rem = (int) (n % 10);
			if (digits[rem])
				return false;
			digits[rem] = true;
			n /= 10;
		}

		return true;
	}

}
