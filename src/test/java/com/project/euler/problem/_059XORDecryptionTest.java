package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _059XORDecryptionTest extends EulerTest {

	static Logger logger = Logger.getLogger(_059XORDecryptionTest.class);

	public _059XORDecryptionTest() {

		super(_059XORDecryption.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_059XORDecryption problem = new _059XORDecryption();

		testEquality(59,problem.solve());
	}

}
