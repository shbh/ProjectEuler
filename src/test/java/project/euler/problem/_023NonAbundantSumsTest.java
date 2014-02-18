package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _023NonAbundantSumsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_023NonAbundantSumsTest.class);

	public _023NonAbundantSumsTest() {
		super(_023NonAbundantSums.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_023NonAbundantSums problem = new _023NonAbundantSums();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
