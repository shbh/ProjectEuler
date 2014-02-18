package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _011LargestProductInAGridTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_011LargestProductInAGridTest.class);

	public _011LargestProductInAGridTest() {
		super(_011LargestProductInAGrid.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_011LargestProductInAGrid problem = new _011LargestProductInAGrid();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
