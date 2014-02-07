package euler;

import java.util.ArrayList;
import java.util.List;

public class ConsecutivePrimeSum {

	public static void main(String[] args) {

		int i = 1;
		int sum = 0;
		int limit = 1000000;

		List<Integer> primes = new ArrayList<>();
		int term = 0;
		

		
		int firstnumber = 2;
		while (firstnumber < limit) {
			if (isPrime(firstnumber)) {
				primes.add(firstnumber);
			}
			firstnumber++;
		}
		int result =0;
		int loop = 1;
		int maxterm = 0;
		while (loop < primes.size()) {
			i = i + 1;
			if (isPrime(i)) {

				sum += i;
				
				if (sum > limit) {
					i = primes.get(loop++);
					sum = 0;
					term = 0;
					continue;
				} 
				term++;
				if (isPrime(sum)) {
					
					if(term>maxterm)
					{
						result = sum;
						maxterm = term;
					}
					
				}
				

			}

		}
		System.out.println(result);

		

	}

	public static boolean isPrime(long number) {
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
