package project.euler.problem;

import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

import project.euler.IProblem;

public final class _026ReciprocalCycles implements IProblem {

	static Logger logger = Logger.getLogger(_026ReciprocalCycles.class);

	public int limit = 1000;

	public Integer solve() {
	
		int bestNumber = 0;
		
		int bestLength = 0;
		
		for (int i = limit; i > 0; i--) {
		
			int len = getCycleLength(i);
			
			if (len > bestLength) {
			
				bestNumber = i;
				
				bestLength = len;
			}
		}
		
		return bestNumber;
	}

	private final int getCycleLength(int n) {
		Map<Integer, Integer> stateToIter = new HashMap<Integer, Integer>();
		int state = 1;
		int iter = 0;
		while (!stateToIter.containsKey(state)) {
			stateToIter.put(state, iter);
			state = state * 10 % n;
			iter++;
		}
		return iter - stateToIter.get(state);
	}

}