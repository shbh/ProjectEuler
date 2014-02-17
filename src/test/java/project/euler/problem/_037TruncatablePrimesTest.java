package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _037TruncatablePrimesTest extends EulerTest {
	static Logger logger = Logger.getLogger(_037TruncatablePrimesTest.class);

	public _037TruncatablePrimesTest() {
		super(_037TruncatablePrimes.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_037TruncatablePrimes problem = new _037TruncatablePrimes();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
