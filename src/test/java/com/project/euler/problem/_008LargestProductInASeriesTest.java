package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _008LargestProductInASeriesTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_008LargestProductInASeriesTest.class);

	public _008LargestProductInASeriesTest() {

		super(_008LargestProductInASeries.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_008LargestProductInASeries problem = new _008LargestProductInASeries();

		testEquality(8,problem.solve());
	}

}
