package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _027QuadraticPrimesTest extends EulerTest {
	static Logger logger = Logger.getLogger(_027QuadraticPrimesTest.class);

	public _027QuadraticPrimesTest() {
		super(_027QuadraticPrimes.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_027QuadraticPrimes problem = new _027QuadraticPrimes();

		testEquality(problem);
	}

}
