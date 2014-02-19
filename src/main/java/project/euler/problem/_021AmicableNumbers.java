package project.euler.problem;

import java.util.HashSet;
import java.util.Set;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;
import project.euler.feature.Functions;

/**
 * Created by shashi on 1/30/14.
 */
public class _021AmicableNumbers implements IProblem {

	static Logger logger = Logger.getLogger(_021AmicableNumbers.class);

	private final int limit = 10000;

	public Integer solve() {

		int[] numbers = new int[limit * 10];
	
		numbers[0] = 0;
		
		int sum = 0;

		Set<Integer> unique = new HashSet<Integer>();

		for (int i = 1; i < limit; i++) {
		
			numbers[i] = Functions.sumofdivisor(i);
		
		}

		for (int i = 1; i < limit; i++) {

			if (i == numbers[numbers[i]] && i != numbers[i]) {
		
				unique.add(i);
				
				unique.add(numbers[i]);

			}
		}

		for (Integer item : unique) {
			
			
			sum += item;
		
		}

		return sum;

	}

}
