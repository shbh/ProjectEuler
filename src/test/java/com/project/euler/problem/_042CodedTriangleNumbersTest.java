package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _042CodedTriangleNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_042CodedTriangleNumbersTest.class);

	public _042CodedTriangleNumbersTest() {

		super(_042CodedTriangleNumbers.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_042CodedTriangleNumbers problem = new _042CodedTriangleNumbers();

		testEquality(problem);
	}

}
