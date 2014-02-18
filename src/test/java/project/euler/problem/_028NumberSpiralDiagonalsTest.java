package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _028NumberSpiralDiagonalsTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_028NumberSpiralDiagonalsTest.class);

	public _028NumberSpiralDiagonalsTest() {
		super(_028NumberSpiralDiagonals.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_028NumberSpiralDiagonals problem = new _028NumberSpiralDiagonals();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
