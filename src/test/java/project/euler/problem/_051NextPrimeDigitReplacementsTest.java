package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _051NextPrimeDigitReplacementsTest extends EulerTest {

	public _051NextPrimeDigitReplacementsTest() {
		super(_051NextPrimeDigitReplacements.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_051NextPrimeDigitReplacements problem = new _051NextPrimeDigitReplacements();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
