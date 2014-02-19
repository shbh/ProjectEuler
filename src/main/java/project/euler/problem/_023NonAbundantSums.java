package project.euler.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;

import project.euler.IProblem;
import project.euler.feature.Functions;

/**
 * Created by shashi on 1/30/14.
 */
public class _023NonAbundantSums implements IProblem {

	static Logger logger = Logger.getLogger(_023NonAbundantSums.class);

	public Integer solve() {
	
		int limit = 28123;
		
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < limit; i++) {
		
			if (i < Functions.sumofdivisor(i)) {
			
				list.add(i);
			}

		}

		Map<Integer, String> map = new HashMap<>();
		
		for (int item : list) {
		
			for (int sub : list) {
			
				int sum = item + sub;
				
				if (sum > limit) {
				
					break;
				} 
				else 
				{
				
					if (!map.containsKey(sum)) {
					
						map.put(sum, null);
					
					}
				}
			}
		}
		
		int total = 0;
		
		for (int i = 1; i <= limit; i++) {
		
			if (!map.containsKey(i)) {
			
				total += i;
			}
		}
		
		return total;
	}

}
