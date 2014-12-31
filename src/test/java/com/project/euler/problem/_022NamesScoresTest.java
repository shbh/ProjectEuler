package com.project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import com.project.euler.feature.Functions;
import com.project.euler.net.EulerTest;

public class _022NamesScoresTest extends EulerTest {

	static Logger logger = Logger.getLogger(_022NamesScoresTest.class);

	public _022NamesScoresTest() {

		super(_022NamesScores.class.getSimpleName());
	}

	@Test(timeout = Functions.ALLOWEDTIME)
	public void testSolve() {

		_022NamesScores problem = new _022NamesScores();

		testEquality(22,problem.solve());
	}

}
