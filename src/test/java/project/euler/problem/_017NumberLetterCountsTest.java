package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _017NumberLetterCountsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_017NumberLetterCountsTest.class);

	public _017NumberLetterCountsTest() {
		super(_017NumberLetterCounts.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_017NumberLetterCounts problem = new _017NumberLetterCounts();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
