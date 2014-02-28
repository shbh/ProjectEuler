package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;
import com.project.euler.feature.KeyConstant;

import com.project.euler.net.EulerTest;

public class _001MultiplesOf3And5Test extends EulerTest {

	static Logger logger = Logger.getLogger(_001MultiplesOf3And5.class);

	public _001MultiplesOf3And5Test() {

		super(_001MultiplesOf3And5.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_001MultiplesOf3And5 problem = new _001MultiplesOf3And5();

		testEquality(problem);
	}

}