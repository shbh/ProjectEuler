package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

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
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}