package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _063PowerfulDigitCountsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _063PowerfulDigitCountsTest() {

		super(_063PowerfulDigitCounts.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_063PowerfulDigitCounts problem = new _063PowerfulDigitCounts();

		testEquality(problem);
	}

}
