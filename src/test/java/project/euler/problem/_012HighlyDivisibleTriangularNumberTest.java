package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _012HighlyDivisibleTriangularNumberTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_012HighlyDivisibleTriangularNumberTest.class);

	public _012HighlyDivisibleTriangularNumberTest() {
		super(_012HighlyDivisibleTriangularNumber.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_012HighlyDivisibleTriangularNumber problem = new _012HighlyDivisibleTriangularNumber();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
