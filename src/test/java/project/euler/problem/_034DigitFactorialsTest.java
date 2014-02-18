package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _034DigitFactorialsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_034DigitFactorialsTest.class);

	public _034DigitFactorialsTest() {
		super(_034DigitFactorials.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_034DigitFactorials problem = new _034DigitFactorials();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
