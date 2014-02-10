package project.euler;

import java.util.HashSet;
import java.util.Set;
import java.util.Stack;

import project.euler.base.IProblem;
import project.euler.util.Learning;

public class DistinctPrimesFactors implements IProblem {

	private int count = 4;

	public Integer solve() {

		Stack<Integer> stack = new Stack<>();
		int firstnumber = 2;
		int number = firstnumber;

		while (true) {
			number++;

			if (containPrimeFactor(number) == count) {
				stack.add(number);
			} else {
				stack.removeAllElements();
				firstnumber = number + 1;
			}

			if (stack.size() == count) {

				break;
			}

		}
		return firstnumber;
	}

	private static int containPrimeFactor(int number) {

		Set<Integer> divisor = new HashSet<>();
		while (true) {
			int factor = Learning.smallestFactor(number);
			divisor.add(factor);
			number = number / factor;
			if (number == 1)
				break;
		}

		return divisor.size();
	}

	public DistinctPrimesFactors count(int count) {
		this.count = count;
		return this;
	}

}
