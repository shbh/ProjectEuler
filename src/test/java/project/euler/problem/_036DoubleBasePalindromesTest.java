package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _036DoubleBasePalindromesTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_036DoubleBasePalindromesTest.class);

	public _036DoubleBasePalindromesTest() {
		super(_036DoubleBasePalindromes.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_036DoubleBasePalindromes problem = new _036DoubleBasePalindromes();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
