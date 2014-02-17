package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _034DigitFactorialsTest extends EulerTest {

	public _034DigitFactorialsTest() {
		super(_034DigitFactorials.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_034DigitFactorials problem = new _034DigitFactorials();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
