package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _047DistinctPrimesFactorsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_047DistinctPrimesFactorsTest.class);

	public _047DistinctPrimesFactorsTest() {

		super(_047DistinctPrimesFactors.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_047DistinctPrimesFactors problem = new _047DistinctPrimesFactors();

		testEquality(47,problem.solve());
	}

}
