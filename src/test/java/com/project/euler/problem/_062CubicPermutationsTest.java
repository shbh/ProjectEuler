package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _062CubicPermutationsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_062CubicPermutations.class);

	public _062CubicPermutationsTest() {

		super(_062CubicPermutations.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_062CubicPermutations problem = new _062CubicPermutations();

		testEquality(problem);
	}

}
