package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _058SpiralPrimesTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_058SpiralPrimesTest.class);

	public _058SpiralPrimesTest() {
		super(_058SpiralPrimes.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_058SpiralPrimes problem = new _058SpiralPrimes();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
