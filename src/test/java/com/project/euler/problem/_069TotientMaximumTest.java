package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _069TotientMaximumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _069TotientMaximumTest() {

		super(_069TotientMaximumTest.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_069TotientMaximum problem = new _069TotientMaximum();

		testEquality(69,problem.solve());
	}

}
