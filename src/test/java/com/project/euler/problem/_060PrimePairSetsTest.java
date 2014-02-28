package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _060PrimePairSetsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_060PrimePairSets.class);

	public _060PrimePairSetsTest() {

		super(_060PrimePairSets.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_060PrimePairSets problem = new _060PrimePairSets();

		testEquality(problem);
	}

}
