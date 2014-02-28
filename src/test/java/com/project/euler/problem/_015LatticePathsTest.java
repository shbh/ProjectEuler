package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _015LatticePathsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_015LatticePathsTest.class);

	public _015LatticePathsTest() {

		super(_015LatticePaths.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_015LatticePaths problem = new _015LatticePaths();

		testEquality(problem);
	}

}
