package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _004LargestPalindromeProductTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_004LargestPalindromeProductTest.class);

	public _004LargestPalindromeProductTest() {
		super(_004LargestPalindromeProduct.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_004LargestPalindromeProduct problem = new _004LargestPalindromeProduct();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
