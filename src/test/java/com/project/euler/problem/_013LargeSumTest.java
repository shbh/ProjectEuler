package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _013LargeSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_013LargeSumTest.class);

	public _013LargeSumTest() {

		super(_013LargeSum.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_013LargeSum problem = new _013LargeSum();

		testEquality(problem);
	}

}
