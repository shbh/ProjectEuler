package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _058SpiralPrimesTest extends EulerTest {

	static Logger logger = Logger.getLogger(_058SpiralPrimesTest.class);

	public _058SpiralPrimesTest() {

		super(_058SpiralPrimes.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_058SpiralPrimes problem = new _058SpiralPrimes();

		testEquality(58,problem.solve());
	}

}
