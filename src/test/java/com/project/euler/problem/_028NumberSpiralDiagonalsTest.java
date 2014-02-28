package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _028NumberSpiralDiagonalsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_028NumberSpiralDiagonalsTest.class);

	public _028NumberSpiralDiagonalsTest() {

		super(_028NumberSpiralDiagonals.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_028NumberSpiralDiagonals problem = new _028NumberSpiralDiagonals();

		testEquality(problem);
	}

}
