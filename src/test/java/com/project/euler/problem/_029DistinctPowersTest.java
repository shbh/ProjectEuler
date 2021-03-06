package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _029DistinctPowersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_029DistinctPowersTest.class);

	public _029DistinctPowersTest() {

		super(_029DistinctPowers.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_029DistinctPowers problem = new _029DistinctPowers();

		testEquality(29,problem.solve());
	}

}
