package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _046GoldbachsOtherConjectureTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_046GoldbachsOtherConjectureTest.class);

	public _046GoldbachsOtherConjectureTest() {

		super(_046GoldbachsOtherConjecture.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_046GoldbachsOtherConjecture problem = new _046GoldbachsOtherConjecture();

		testEquality(problem);
	}

}
