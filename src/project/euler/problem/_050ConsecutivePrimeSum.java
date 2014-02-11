package project.euler.problem;

import java.util.ArrayList;
import java.util.List;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class _050ConsecutivePrimeSum implements IProblem {

	int limit = 0;

	public Integer solve() {

		int i = 1;
		int sum = 0;

		List<Integer> primes = new ArrayList<>();
		int term = 0;

		int firstnumber = 2;
		while (firstnumber < limit) {
			if (Learning.isPrime(firstnumber)) {
				primes.add(firstnumber);
			}
			firstnumber++;
		}
		int result = 0;
		int loop = 1;
		int maxterm = 0;
		while (loop < primes.size()) {
			i = i + 1;
			if (Learning.isPrime(i)) {

				sum += i;

				if (sum > limit) {
					i = primes.get(loop++);
					sum = 0;
					term = 0;
					continue;
				}
				term++;
				if (Learning.isPrime(sum)) {

					if (term > maxterm) {
						result = sum;
						maxterm = term;
					}

				}

			}

		}
		return result;

	}

	public _050ConsecutivePrimeSum limit(int limit) {
		
		this.limit = limit;
		return this;
	}

}
