package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _060PrimePairSetsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_060PrimePairSets.class);

	public _060PrimePairSetsTest() {

		super(_060PrimePairSets.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_060PrimePairSets problem = new _060PrimePairSets();

		testEquality(60,problem.solve());
	}

}
