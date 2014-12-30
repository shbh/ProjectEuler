package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _045TriangularPentagonalAndHexagonalTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_045TriangularPentagonalAndHexagonalTest.class);

	public _045TriangularPentagonalAndHexagonalTest() {

		super(_045TriangularPentagonalAndHexagonal.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_045TriangularPentagonalAndHexagonal problem = new _045TriangularPentagonalAndHexagonal();

		testEquality(problem);
	}

}
