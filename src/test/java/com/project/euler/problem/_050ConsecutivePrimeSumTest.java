package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _050ConsecutivePrimeSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_050ConsecutivePrimeSumTest.class);

	public _050ConsecutivePrimeSumTest() {

		super(_050ConsecutivePrimeSum.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_050ConsecutivePrimeSum problem = new _050ConsecutivePrimeSum();

		testEquality(problem);
	}

}
