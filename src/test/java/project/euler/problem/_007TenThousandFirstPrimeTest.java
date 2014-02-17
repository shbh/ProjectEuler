package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _007TenThousandFirstPrimeTest extends EulerTest {

	public _007TenThousandFirstPrimeTest() {
		super(_007TenThousandFirstPrime.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_007TenThousandFirstPrime problem = new _007TenThousandFirstPrime();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
