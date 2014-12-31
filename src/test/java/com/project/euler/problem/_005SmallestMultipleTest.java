package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _005SmallestMultipleTest extends EulerTest {

	static Logger logger = Logger.getLogger(_005SmallestMultipleTest.class);

	public _005SmallestMultipleTest() {

		super(_005SmallestMultiple.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_005SmallestMultiple problem = new _005SmallestMultiple();

		testEquality(5,problem.solve());
	}

}
