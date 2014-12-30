package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _067MaximumSumPathIITest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _067MaximumSumPathIITest() {

		super(_067MaximumSumPathIITest.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_067MaximumSumPathII problem = new _067MaximumSumPathII();

		testEquality(problem);
	}

}
