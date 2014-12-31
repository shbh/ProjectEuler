package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _054PokerHandsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_054PokerHandsTest.class);

	public _054PokerHandsTest() {

		super(_054PokerHands.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_054PokerHands problem = new _054PokerHands();

		testEquality(54,problem.solve());
	}

}
