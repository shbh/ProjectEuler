package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _035CircularPrimesTest extends EulerTest {

	public _035CircularPrimesTest() {
		super(_035CircularPrimes.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_035CircularPrimes problem = new _035CircularPrimes();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
