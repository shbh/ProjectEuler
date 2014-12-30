package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _066DiophantineEquationTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _066DiophantineEquationTest() {

		super(_066DiophantineEquationTest.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_066DiophantineEquation problem = new _066DiophantineEquation();

		testEquality(problem);
	}

}
