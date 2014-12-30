package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _043SubStringDivisibilityTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_043SubStringDivisibilityTest.class);

	public _043SubStringDivisibilityTest() {

		super(_043SubStringDivisibility.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_043SubStringDivisibility problem = new _043SubStringDivisibility();

		testEquality(problem);
	}

}
