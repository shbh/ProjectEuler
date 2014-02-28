package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _004LargestPalindromeProductTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_004LargestPalindromeProductTest.class);

	public _004LargestPalindromeProductTest() {

		super(_004LargestPalindromeProduct.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_004LargestPalindromeProduct problem = new _004LargestPalindromeProduct();

		testEquality(problem);
	}

}
