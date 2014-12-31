package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _016PowerDigitSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_016PowerDigitSumTest.class);

	public _016PowerDigitSumTest() {

		super(_016PowerDigitSum.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_016PowerDigitSum problem = new _016PowerDigitSum();

		testEquality(16,problem.solve());
	}

}
