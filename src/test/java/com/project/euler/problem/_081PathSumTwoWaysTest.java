package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _081PathSumTwoWaysTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _081PathSumTwoWaysTest() {

		super(_081PathSumTwoWaysTest.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_081PathSumTwoWays problem = new _081PathSumTwoWays();

		testEquality(81,problem.solve());
	}

}
