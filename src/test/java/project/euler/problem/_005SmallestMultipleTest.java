package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _005SmallestMultipleTest extends EulerTest {
	static Logger logger = Logger.getLogger(_005SmallestMultipleTest.class);

	public _005SmallestMultipleTest() {
		super(_005SmallestMultiple.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_005SmallestMultiple problem = new _005SmallestMultiple();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
