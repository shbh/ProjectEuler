package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _003LargestPrimeFactorTest extends EulerTest {
	static Logger logger = Logger.getLogger(_003LargestPrimeFactorTest.class);

	public _003LargestPrimeFactorTest() {
		super(_003LargestPrimeFactor.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_003LargestPrimeFactor problem = new _003LargestPrimeFactor();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
