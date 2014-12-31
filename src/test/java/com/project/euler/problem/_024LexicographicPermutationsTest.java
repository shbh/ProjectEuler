package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _024LexicographicPermutationsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_024LexicographicPermutationsTest.class);

	public _024LexicographicPermutationsTest() {

		super(_024LexicographicPermutations.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_024LexicographicPermutations problem = new _024LexicographicPermutations();

		testEquality(24,problem.solve());
	}

}
