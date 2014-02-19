package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;
import project.euler.feature.Functions;

/**
 * Created by shashi on 1/28/14.
 */
public class _007TenThousandFirstPrime implements IProblem {
	
	static Logger logger = Logger.getLogger(_007TenThousandFirstPrime.class);

	private final long number = 10001;

	public Long solve() {
	
		long no = 1;
		
		int boundry = 1;// including 2 as condition is starting with 3

		while (true) {
		
			no = no + 2;
			
			if (Functions.isPrime(no)) {
			
				boundry = boundry + 1;
			}

			if (boundry == number) {
				
				break;
			}

		}
		
		return no;

	}

}
