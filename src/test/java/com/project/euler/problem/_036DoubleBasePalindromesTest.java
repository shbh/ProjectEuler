package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _036DoubleBasePalindromesTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_036DoubleBasePalindromesTest.class);

	public _036DoubleBasePalindromesTest() {

		super(_036DoubleBasePalindromes.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_036DoubleBasePalindromes problem = new _036DoubleBasePalindromes();

		testEquality(36,problem.solve());
	}

}
