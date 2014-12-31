package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _079PasscodeDerivationTest extends EulerTest {

	static Logger logger = Logger.getLogger(_063PowerfulDigitCounts.class);

	public _079PasscodeDerivationTest() {

		super(_079PasscodeDerivationTest.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_079PasscodeDerivation problem = new _079PasscodeDerivation();

		testEquality(79,problem.solve());
	}

}
