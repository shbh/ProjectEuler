package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _020FactorialDigitSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_020FactorialDigitSumTest.class);

	public _020FactorialDigitSumTest() {

		super(_020FactorialDigitSum.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_020FactorialDigitSum problem = new _020FactorialDigitSum();

		testEquality(20,problem.solve());
	}

}
