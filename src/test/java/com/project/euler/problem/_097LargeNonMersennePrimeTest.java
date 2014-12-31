package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _097LargeNonMersennePrimeTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _097LargeNonMersennePrimeTest() {

		super(_097LargeNonMersennePrimeTest.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_097LargeNonMersennePrime problem = new _097LargeNonMersennePrime();

		testEquality(97,problem.solve());
	}

}
