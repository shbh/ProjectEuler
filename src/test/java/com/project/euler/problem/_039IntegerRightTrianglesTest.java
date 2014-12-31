package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _039IntegerRightTrianglesTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_039IntegerRightTrianglesTest.class);

	public _039IntegerRightTrianglesTest() {

		super(_039IntegerRightTriangles.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_039IntegerRightTriangles problem = new _039IntegerRightTriangles();

		testEquality(39,problem.solve());
	}

}
