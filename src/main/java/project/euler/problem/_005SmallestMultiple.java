package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.IProblem;

/**
 * Created by shashi on 1/28/14.
 */
public class _005SmallestMultiple implements IProblem {
	
	static Logger logger = Logger.getLogger(_005SmallestMultiple.class);

	private int divisor = 20;

	public Long solve() {

		long number = 1;

		while (true) {
			
			int temp = 0;
			
			for (int n = divisor; n > 1; n--) {

				temp = n;
			
				if (number % n == 0) {

					continue;
			
				} 
				else {
				
					number++;
			
					break;
				}
			}
			
			if (temp == 2) {
		
				break;
		
			}
		}
	
		return number;
	}

}
