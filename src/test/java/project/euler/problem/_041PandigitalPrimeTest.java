package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _041PandigitalPrimeTest extends EulerTest {
	static Logger logger = Logger.getLogger(_041PandigitalPrimeTest.class);

	public _041PandigitalPrimeTest() {
		super(_041PandigitalPrime.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_041PandigitalPrime problem = new _041PandigitalPrime();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
