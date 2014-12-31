package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _034DigitFactorialsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_034DigitFactorialsTest.class);

	public _034DigitFactorialsTest() {

		super(_034DigitFactorials.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_034DigitFactorials problem = new _034DigitFactorials();

		testEquality(34,problem.solve());
	}

}
