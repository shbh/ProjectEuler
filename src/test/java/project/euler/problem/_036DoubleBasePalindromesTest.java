package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _036DoubleBasePalindromesTest extends EulerTest {

	public _036DoubleBasePalindromesTest() {
		super(_036DoubleBasePalindromes.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_036DoubleBasePalindromes problem = new _036DoubleBasePalindromes();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
