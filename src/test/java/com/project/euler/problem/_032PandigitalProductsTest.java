package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _032PandigitalProductsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_032PandigitalProductsTest.class);

	public _032PandigitalProductsTest() {

		super(_032PandigitalProducts.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_032PandigitalProducts problem = new _032PandigitalProducts();

		testEquality(problem);
	}

}
