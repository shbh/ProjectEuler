package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _025ThousandDigitFibonacciNumberTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_025ThousandDigitFibonacciNumberTest.class);

	public _025ThousandDigitFibonacciNumberTest() {

		super(_025ThousandDigitFibonacciNumber.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_025ThousandDigitFibonacciNumber problem = new _025ThousandDigitFibonacciNumber();

		testEquality(25,problem.solve());
	}

}
