package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _052PermutedMultiplesTest extends EulerTest {

	static Logger logger = Logger.getLogger(_052PermutedMultiplesTest.class);

	public _052PermutedMultiplesTest() {

		super(_052PermutedMultiples.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_052PermutedMultiples problem = new _052PermutedMultiples();

		testEquality(52,problem.solve());
	}

}
