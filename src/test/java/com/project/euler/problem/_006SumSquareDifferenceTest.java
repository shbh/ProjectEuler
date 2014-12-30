package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _006SumSquareDifferenceTest extends EulerTest {

	static Logger logger = Logger.getLogger(_006SumSquareDifferenceTest.class);

	public _006SumSquareDifferenceTest() {

		super(_006SumSquareDifference.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_006SumSquareDifference problem = new _006SumSquareDifference();

		testEquality(problem);
	}

}
