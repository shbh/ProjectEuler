package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _022NamesScoresTest extends EulerTest {

	static Logger logger = Logger.getLogger(_022NamesScoresTest.class);

	public _022NamesScoresTest() {

		super(_022NamesScores.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_022NamesScores problem = new _022NamesScores();

		testEquality(problem);
	}

}
