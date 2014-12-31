package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _019CountingSundaysTest extends EulerTest {

	static Logger logger = Logger.getLogger(_019CountingSundaysTest.class);

	public _019CountingSundaysTest() {

		super(_019CountingSundays.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_019CountingSundays problem = new _019CountingSundays();

		testEquality(19,problem.solve());
	}

}
