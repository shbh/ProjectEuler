package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;
import com.project.euler.feature.Functions;

import com.project.euler.net.EulerTest;

public class _002EvenFibonacciNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_002EvenFibonacciNumbersTest.class);

	public _002EvenFibonacciNumbersTest() {

		super(_002EvenFibonacciNumbers.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_002EvenFibonacciNumbers problem = new _002EvenFibonacciNumbers();

		testEquality(problem);

	}

}
