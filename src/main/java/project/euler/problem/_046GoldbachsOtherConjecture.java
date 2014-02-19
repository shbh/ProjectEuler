package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;
import project.euler.feature.Functions;

public class _046GoldbachsOtherConjecture implements IProblem {
	
	static Logger logger = Logger.getLogger(_046GoldbachsOtherConjecture.class);

	public Long solve() {

		int[] prime = new int[1000];
		
		long[] sqrt = new long[100];
		
		prime[0] = 2;
		
		prime[1] = 3;
		
		prime[2] = 5;
		
		prime[3] = 7;

		for (int i = 0; i < sqrt.length; i++) {
		
			sqrt[i] = i * i;
		
		}
		
		int index = 4;
		
		long i = 7;
		
		while (true) {
		
			i = i + 2;
			
			if (Functions.isComposite(i)) {

				if (isConjecture(i, sqrt, prime)) {
			
					return i;
				
				}

			} 
			else 
			{

				prime[index++] = (int) i;
			}
		}
	}

	private final boolean isConjecture(long n, long[] sqrt, int[] prime) {

		for (int i = 0; i < prime.length; i++) {
			
			int no = (int) n - prime[i];
			
			if (no > 0) {

				
				for (int j = 0; j < sqrt.length; j++) {
				
					int sno = (int) sqrt[j];
					
					if (2 * sno > no) {
					
						break;
					} 
					else if (2 * sno == no) 
					{

						return false;
					}

				}

			}
		}

		return true;
	}

}
