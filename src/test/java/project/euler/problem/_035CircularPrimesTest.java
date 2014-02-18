package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _035CircularPrimesTest extends EulerTest {
	static Logger logger = Logger.getLogger(_035CircularPrimesTest.class);

	public _035CircularPrimesTest() {
		super(_035CircularPrimes.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_035CircularPrimes problem = new _035CircularPrimes();

		testEquality(problem);
	}

}
