package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _001MultiplesOf3And5 implements IProblem {

	static Logger logger = Logger.getLogger(_001MultiplesOf3And5.class);

	private final static int LIMIT = 1000;

	public Integer solve() {

		int sum = 0;
	
		for (int counter = 1; counter < LIMIT; counter++) {
		
			if (counter % 3 == 0 || counter % 5 == 0) {
		
				sum += counter;
		
			}

		}
	
		return sum;
	}

}
