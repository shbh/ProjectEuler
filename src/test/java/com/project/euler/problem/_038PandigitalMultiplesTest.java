package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _038PandigitalMultiplesTest extends EulerTest {

	static Logger logger = Logger.getLogger(_038PandigitalMultiplesTest.class);

	public _038PandigitalMultiplesTest() {

		super(_038PandigitalMultiples.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_038PandigitalMultiples problem = new _038PandigitalMultiples();

		testEquality(problem);
	}

}