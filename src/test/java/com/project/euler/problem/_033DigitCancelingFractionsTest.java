package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _033DigitCancelingFractionsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_033DigitCancelingFractionsTest.class);

	public _033DigitCancelingFractionsTest() {

		super(_033DigitCancelingFractions.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_033DigitCancelingFractions problem = new _033DigitCancelingFractions();

		testEquality(problem);
	}

}
