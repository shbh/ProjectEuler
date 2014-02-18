package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _021AmicableNumbersTest extends EulerTest {
	static Logger logger = Logger.getLogger(_021AmicableNumbersTest.class);

	public _021AmicableNumbersTest() {
		super(_021AmicableNumbers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_021AmicableNumbers problem = new _021AmicableNumbers();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
