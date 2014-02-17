package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _003LargestPrimeFactorTest extends EulerTest {

	public _003LargestPrimeFactorTest() {
		super(_003LargestPrimeFactor.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_003LargestPrimeFactor problem = new _003LargestPrimeFactor();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
