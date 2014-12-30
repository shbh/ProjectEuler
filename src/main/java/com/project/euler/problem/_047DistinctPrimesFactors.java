package com.project.euler.problem;

import java.util.Stack;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

public class _047DistinctPrimesFactors implements IProblem {

	static Logger logger = Logger.getLogger(_047DistinctPrimesFactors.class);

	private int count = 4;

	public Integer solve() {

		Stack<Integer> stack = new Stack<>();

		int firstnumber = 2;
		
		int number = firstnumber;

		while (true) {
		
			number++;

			if (Functions.containPrimeFactor(number) == count) {
			
				stack.add(number);
			} 
			else 
			{
				stack.removeAllElements();
			
				firstnumber = number + 1;
			
			}

			if (stack.size() == count) {

				break;
			}

		}
		
		return firstnumber;
	}

	

}
