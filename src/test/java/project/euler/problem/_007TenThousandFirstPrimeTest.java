package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _007TenThousandFirstPrimeTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_007TenThousandFirstPrimeTest.class);

	public _007TenThousandFirstPrimeTest() {

		super(_007TenThousandFirstPrime.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {

		_007TenThousandFirstPrime problem = new _007TenThousandFirstPrime();

		testEquality(problem);
	}

}
