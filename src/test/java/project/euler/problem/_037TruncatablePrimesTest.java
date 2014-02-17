package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _037TruncatablePrimesTest extends EulerTest {

	public _037TruncatablePrimesTest() {
		super(_037TruncatablePrimes.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_037TruncatablePrimes problem = new _037TruncatablePrimes();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
