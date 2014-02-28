package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _035CircularPrimesTest extends EulerTest {

	static Logger logger = Logger.getLogger(_035CircularPrimesTest.class);

	public _035CircularPrimesTest() {

		super(_035CircularPrimes.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_035CircularPrimes problem = new _035CircularPrimes();

		testEquality(problem);
	}

}
