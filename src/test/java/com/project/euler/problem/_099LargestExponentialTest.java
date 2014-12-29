package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _099LargestExponentialTest extends EulerTest {

	static Logger logger = Logger.getLogger(_099LargestExponentialTest.class);

	public _099LargestExponentialTest() {

		super(_099LargestExponential.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_099LargestExponential problem = new _099LargestExponential();

		testEquality(problem);
	}

}
