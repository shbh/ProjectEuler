package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.KeyConstant;
import com.project.euler.net.EulerTest;

public class _014LongestCollatzSequenceTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_014LongestCollatzSequenceTest.class);

	public _014LongestCollatzSequenceTest() {

		super(_014LongestCollatzSequence.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_014LongestCollatzSequence problem = new _014LongestCollatzSequence();

		testEquality(problem);
	}

}
