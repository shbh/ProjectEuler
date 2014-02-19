package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _057SquareRootConvergentsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_057SquareRootConvergentsTest.class);

	public _057SquareRootConvergentsTest() {

		super(_057SquareRootConvergents.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_057SquareRootConvergents problem = new _057SquareRootConvergents();

		testEquality(problem);
	}

}
