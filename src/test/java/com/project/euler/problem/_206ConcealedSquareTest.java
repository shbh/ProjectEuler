package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _206ConcealedSquareTest extends EulerTest {

	static Logger logger = Logger.getLogger(_206ConcealedSquareTest.class);

	public _206ConcealedSquareTest() {

		super(_206ConcealedSquareTest.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_206ConcealedSquare problem = new _206ConcealedSquare();

		testEquality(problem);
	}

}
