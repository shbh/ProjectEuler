package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _010SummationOfPrimesTest extends EulerTest {
	static Logger logger = Logger.getLogger(_010SummationOfPrimesTest.class);

	public _010SummationOfPrimesTest() {
		super(_010SummationOfPrimes.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_010SummationOfPrimes problem = new _010SummationOfPrimes();

		testEquality(problem);
	}

}
