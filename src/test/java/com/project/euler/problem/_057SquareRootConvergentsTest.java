package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _057SquareRootConvergentsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_057SquareRootConvergentsTest.class);

	public _057SquareRootConvergentsTest() {

		super(_057SquareRootConvergents.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_057SquareRootConvergents problem = new _057SquareRootConvergents();

		testEquality(problem);
	}

}
