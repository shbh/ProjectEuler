package com.project.euler.problem;


import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _055LychrelNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_055LychrelNumbersTest.class);

	public _055LychrelNumbersTest() {

		super(_055LychrelNumbers.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_055LychrelNumbers problem = new _055LychrelNumbers();

		testEquality(problem);
	}

}
