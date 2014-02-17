package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _004LargestPalindromeProductTest extends EulerTest {

	public _004LargestPalindromeProductTest() {
		super(_004LargestPalindromeProduct.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_004LargestPalindromeProduct problem = new _004LargestPalindromeProduct();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
