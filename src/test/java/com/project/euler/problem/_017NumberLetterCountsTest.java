package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _017NumberLetterCountsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_017NumberLetterCountsTest.class);

	public _017NumberLetterCountsTest() {

		super(_017NumberLetterCounts.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_017NumberLetterCounts problem = new _017NumberLetterCounts();

		testEquality(17,problem.solve());
	}

}
