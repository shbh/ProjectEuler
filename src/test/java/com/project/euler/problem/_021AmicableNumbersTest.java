package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _021AmicableNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_021AmicableNumbersTest.class);

	public _021AmicableNumbersTest() {

		super(_021AmicableNumbers.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_021AmicableNumbers problem = new _021AmicableNumbers();

		testEquality(21,problem.solve());
	}

}
