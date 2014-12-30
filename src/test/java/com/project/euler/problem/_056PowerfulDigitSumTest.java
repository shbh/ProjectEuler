package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _056PowerfulDigitSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_056PowerfulDigitSumTest.class);

	public _056PowerfulDigitSumTest() {

		super(_056PowerfulDigitSum.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_056PowerfulDigitSum problem = new _056PowerfulDigitSum();

		testEquality(problem);
	}

}
