package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _206ConcealedSquareTest extends EulerTest {

	static Logger logger = Logger.getLogger(_206ConcealedSquareTest.class);

	public _206ConcealedSquareTest() {

		super(_206ConcealedSquareTest.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_206ConcealedSquare problem = new _206ConcealedSquare();

		testEquality(206,problem.solve());
	}

}
