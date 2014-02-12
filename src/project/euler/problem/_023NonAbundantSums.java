package project.euler.problem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/30/14.
 */
public class _023NonAbundantSums implements IProblem {

	public Integer solve() {
		int limit = 28123;
		List<Integer> list = new ArrayList<>();

		for (int i = 1; i < limit; i++) {
			if (i < Learning.sumofdivisor(i)) {
				list.add(i);
			}

		}

		Map<Integer, String> map = new HashMap<>();
		for (int item : list) {
			for (int sub : list) {
				int sum = item + sub;
				if (sum > limit) {
					break;
				} else {
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

	public int getNo() {

		return 23;
	}

}