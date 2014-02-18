package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _050ConsecutivePrimeSumTest extends EulerTest {
	static Logger logger = Logger.getLogger(_050ConsecutivePrimeSumTest.class);

	public _050ConsecutivePrimeSumTest() {
		super(_050ConsecutivePrimeSum.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_050ConsecutivePrimeSum problem = new _050ConsecutivePrimeSum();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
