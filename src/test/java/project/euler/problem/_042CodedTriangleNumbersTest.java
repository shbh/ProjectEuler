package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _042CodedTriangleNumbersTest extends EulerTest {
	static Logger logger = Logger.getLogger(_042CodedTriangleNumbersTest.class);

	public _042CodedTriangleNumbersTest() {
		super(_042CodedTriangleNumbers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_042CodedTriangleNumbers problem = new _042CodedTriangleNumbers();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
