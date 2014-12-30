package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _031CoinSumsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_031CoinSumsTest.class);

	public _031CoinSumsTest() {

		super(_031CoinSums.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_031CoinSums problem = new _031CoinSums();

		testEquality(problem);
	}

}
