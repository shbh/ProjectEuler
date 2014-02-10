package project.euler;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Created by shashi on 1/31/14.
 */
public class QuadraticPrimes {

	public static void main(String[] args) {
		int limit = 1000;
		List<Integer> bs = new ArrayList<>();
		int max = 0;
		int maxm = 0;

		for (int i = 1; i < limit; i++) {
			if (isPrime(i)) {
				bs.add(i);
				bs.add(-i);
			}
		}

		Collections.sort(bs);

		for (Iterator<Integer> iterator = bs.iterator(); iterator.hasNext();) {
			Integer b = (Integer) iterator.next();

			if (b % 2 == 0) {
				for (int a = -limit + 2; a < limit; a = a + 2) {
					int count = validateQuadric(a, b);
					

						if (count > max) {
							max = count;
							maxm = a * b;
						}
					
				}
			} else {
				for (int a = -limit + 1; a < limit; a = a + 2) {
					int count = validateQuadric(a, b);
					
					if (count > max) {
						max = count;
						maxm = a * b;
						
					}
				}
			}

		}

		System.out.println(maxm);
	}

	private static int validateQuadric(int a, int b) {

		// formula n2+an+b
		int count = 0;
		boolean noprime = false;
		int n = 0;
		while (!noprime) {
			int value = (int) Math.pow(n, 2) + a * n + b;
			
			if (isPrime(value)) {
				count++;
				n++;
			} else {
				noprime = true;
			}

		}

		return count;
	}

	public static boolean isPrime(long number) {
		if(number < 0)
		{
			number = -number;
		}
		long condition = number / 2 + 1;
		for (int n = 2; n < condition; n++) {

			if (number % n == 0) {
				return false;
			}
			condition = number / n + 1;
		}
		return true;
	}
}
