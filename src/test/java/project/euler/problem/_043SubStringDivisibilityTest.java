package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _043SubStringDivisibilityTest extends EulerTest {

	public _043SubStringDivisibilityTest() {
		super(_043SubStringDivisibility.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_043SubStringDivisibility problem = new _043SubStringDivisibility();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
