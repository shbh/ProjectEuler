package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _041PandigitalPrimeTest extends EulerTest {

	public _041PandigitalPrimeTest() {
		super(_041PandigitalPrime.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_041PandigitalPrime problem = new _041PandigitalPrime();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
