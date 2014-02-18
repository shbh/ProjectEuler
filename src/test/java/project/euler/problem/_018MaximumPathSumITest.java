package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _018MaximumPathSumITest extends EulerTest {
	static Logger logger = Logger.getLogger(_018MaximumPathSumITest.class);

	public _018MaximumPathSumITest() {
		super(_018MaximumPathSumI.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_018MaximumPathSumI problem = new _018MaximumPathSumI();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
