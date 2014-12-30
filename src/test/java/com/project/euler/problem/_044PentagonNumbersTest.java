package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _044PentagonNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_044PentagonNumbersTest.class);

	public _044PentagonNumbersTest() {

		super(_044PentagonNumbers.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_044PentagonNumbers problem = new _044PentagonNumbers();

		testEquality(problem);
	}

}
