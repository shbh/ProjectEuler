package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _018MaximumPathSumITest extends EulerTest {

	static Logger logger = Logger.getLogger(_018MaximumPathSumITest.class);

	public _018MaximumPathSumITest() {

		super(_018MaximumPathSumI.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_018MaximumPathSumI problem = new _018MaximumPathSumI();

		testEquality(18,problem.solve());
	}

}
