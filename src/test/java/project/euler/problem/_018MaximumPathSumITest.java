package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _018MaximumPathSumITest extends EulerTest {

	static Logger logger = Logger.getLogger(_018MaximumPathSumITest.class);

	public _018MaximumPathSumITest() {

		super(_018MaximumPathSumI.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_018MaximumPathSumI problem = new _018MaximumPathSumI();

		testEquality(problem);
	}

}
