package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _041PandigitalPrimeTest extends EulerTest {

	static Logger logger = Logger.getLogger(_041PandigitalPrimeTest.class);

	public _041PandigitalPrimeTest() {

		super(_041PandigitalPrime.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_041PandigitalPrime problem = new _041PandigitalPrime();

		testEquality(problem);
	}

}
