package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _097LargeNonMersennePrimeTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _097LargeNonMersennePrimeTest() {

		super(_097LargeNonMersennePrimeTest.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_097LargeNonMersennePrime problem = new _097LargeNonMersennePrime();

		testEquality(problem);
	}

}
