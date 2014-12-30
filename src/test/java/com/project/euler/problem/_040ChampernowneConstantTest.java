package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _040ChampernowneConstantTest extends EulerTest {

	static Logger logger = Logger.getLogger(_040ChampernowneConstantTest.class);

	public _040ChampernowneConstantTest() {

		super(_040ChampernowneConstant.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_040ChampernowneConstant problem = new _040ChampernowneConstant();

		testEquality(problem);
	}

}
