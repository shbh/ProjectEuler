package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _026ReciprocalCyclesTest extends EulerTest {

	static Logger logger = Logger.getLogger(_026ReciprocalCyclesTest.class);

	public _026ReciprocalCyclesTest() {

		super(_026ReciprocalCycles.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_026ReciprocalCycles problem = new _026ReciprocalCycles();

		testEquality(26,problem.solve());
	}

}
