package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _044PentagonNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_044PentagonNumbersTest.class);

	public _044PentagonNumbersTest() {

		super(_044PentagonNumbers.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_044PentagonNumbers problem = new _044PentagonNumbers();

		testEquality(problem);
	}

}
