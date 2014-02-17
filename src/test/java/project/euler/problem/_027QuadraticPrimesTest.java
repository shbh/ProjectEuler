package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _027QuadraticPrimesTest extends EulerTest {

	public _027QuadraticPrimesTest() {
		super(_027QuadraticPrimes.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_027QuadraticPrimes problem = new _027QuadraticPrimes();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
