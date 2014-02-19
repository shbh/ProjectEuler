package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;
import project.euler.feature.KeyConstant;

import project.euler.net.EulerTest;

public class _003LargestPrimeFactorTest extends EulerTest {

	static Logger logger = Logger.getLogger(_003LargestPrimeFactorTest.class);

	public _003LargestPrimeFactorTest() {

		super(_003LargestPrimeFactor.class.getSimpleName());
	}

	@Override
	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_003LargestPrimeFactor problem = new _003LargestPrimeFactor();

		testEquality(problem);
	}

}
