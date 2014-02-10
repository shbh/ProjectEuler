package project.euler;

import java.util.ArrayList;
import java.util.List;

import project.euler.base.IProblem;
import project.euler.util.Learning;

/**
 * Created by shashi on 1/30/14.
 */
public class LexicographicPermutations implements IProblem {

	
	private int position = 1000000;
	public Long solve() {

		int digit = 10;
		int[] number = new int[digit];
		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < digit; i++) {
			list.add(i);
		}
		int pos = position;

		for (int i = 9; i >= 0; i--) {
			int fact = Learning.factorial(i);
			int result = pos / fact;
			if (pos % fact == 0)
				result = result - 1;
			pos = pos - fact * result;

			result = list.get(result);

			list.remove(new Integer(result));
			number[digit - (i + 1)] = result;
		}

		StringBuilder sb = new StringBuilder(number.length);
		for (int i : number) {
			sb.append(i);
		}

		return Long.valueOf(sb.toString());
	}
	
	public LexicographicPermutations position(int position)
	{
		this.position = position;
		return this;
	}

	
}
