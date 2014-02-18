package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _022NamesScoresTest extends EulerTest {
	static Logger logger = Logger.getLogger(_022NamesScoresTest.class);

	public _022NamesScoresTest() {
		super(_022NamesScores.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_022NamesScores problem = new _022NamesScores();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
