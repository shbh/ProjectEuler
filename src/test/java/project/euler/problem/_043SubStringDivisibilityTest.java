package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _043SubStringDivisibilityTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_043SubStringDivisibilityTest.class);

	public _043SubStringDivisibilityTest() {

		super(_043SubStringDivisibility.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {

		_043SubStringDivisibility problem = new _043SubStringDivisibility();

		testEquality(problem);
	}

}
