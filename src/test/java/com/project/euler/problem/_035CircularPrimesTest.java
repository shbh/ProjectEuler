package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _035CircularPrimesTest extends EulerTest {

	static Logger logger = Logger.getLogger(_035CircularPrimesTest.class);

	public _035CircularPrimesTest() {

		super(_035CircularPrimes.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_035CircularPrimes problem = new _035CircularPrimes();

		testEquality(problem);
	}

}
