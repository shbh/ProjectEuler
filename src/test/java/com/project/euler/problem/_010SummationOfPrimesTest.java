package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _010SummationOfPrimesTest extends EulerTest {

	static Logger logger = Logger.getLogger(_010SummationOfPrimesTest.class);

	public _010SummationOfPrimesTest() {

		super(_010SummationOfPrimes.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_010SummationOfPrimes problem = new _010SummationOfPrimes();

		testEquality(problem);
	}

}
