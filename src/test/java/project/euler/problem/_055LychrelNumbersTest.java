package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _055LychrelNumbersTest extends EulerTest {
	static Logger logger = Logger.getLogger(_055LychrelNumbersTest.class);

	public _055LychrelNumbersTest() {
		super(_055LychrelNumbers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_055LychrelNumbers problem = new _055LychrelNumbers();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
