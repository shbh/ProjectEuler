package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _041PandigitalPrimeTest extends EulerTest {

	static Logger logger = Logger.getLogger(_041PandigitalPrimeTest.class);

	public _041PandigitalPrimeTest() {

		super(_041PandigitalPrime.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_041PandigitalPrime problem = new _041PandigitalPrime();

		testEquality(41,problem.solve());
	}

}
