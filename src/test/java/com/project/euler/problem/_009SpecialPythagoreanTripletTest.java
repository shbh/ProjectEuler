package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _009SpecialPythagoreanTripletTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_009SpecialPythagoreanTripletTest.class);

	public _009SpecialPythagoreanTripletTest() {

		super(_009SpecialPythagoreanTriplet.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_009SpecialPythagoreanTriplet problem = new _009SpecialPythagoreanTriplet();

		testEquality(problem);
	}

}
