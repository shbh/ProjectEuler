package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _092SquareDigitChainsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _092SquareDigitChainsTest() {

		super(_092SquareDigitChainsTest.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_092SquareDigitChains problem = new _092SquareDigitChains();

		testEquality(problem);
	}

}
