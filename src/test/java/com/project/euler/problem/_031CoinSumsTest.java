package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _031CoinSumsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_031CoinSumsTest.class);

	public _031CoinSumsTest() {

		super(_031CoinSums.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_031CoinSums problem = new _031CoinSums();

		testEquality(problem);
	}

}
