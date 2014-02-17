package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _010SummationOfPrimesTest extends EulerTest {

	public _010SummationOfPrimesTest() {
		super(_010SummationOfPrimes.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_010SummationOfPrimes problem = new _010SummationOfPrimes();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
