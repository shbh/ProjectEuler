package project.euler.problem;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;

import project.euler.IProblem;
import project.euler.feature.Functions;

public class _050ConsecutivePrimeSum implements IProblem {
	
	static Logger logger = Logger.getLogger(_050ConsecutivePrimeSum.class);

	int limit = 1000000;

	public Integer solve() {

		int i = 1;

		int sum = 0;

		List<Integer> primes = new ArrayList<>();
		int term = 0;

		int firstnumber = 2;
		
		while (firstnumber < limit) {
		
			if (Functions.isPrime(firstnumber)) {
			
				primes.add(firstnumber);
			
			}
			
			firstnumber++;
		
		}
		
		int result = 0;
		
		int loop = 1;
		
		int maxterm = 0;
		
		while (loop < primes.size()) {
		
			i = i + 1;
			
			if (Functions.isPrime(i)) {

				sum += i;

				if (sum > limit) {
			
					i = primes.get(loop++);
					
					sum = 0;
					
					term = 0;
					
					continue;
				}
				
				term++;
				
				if (Functions.isPrime(sum)) {

					if (term > maxterm) {
				
						result = sum;
						
						maxterm = term;
					}
					

				}

			}

		}
		
		
		return result;

	}

}
