package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _036DoubleBasePalindromesTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_036DoubleBasePalindromesTest.class);

	public _036DoubleBasePalindromesTest() {

		super(_036DoubleBasePalindromes.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_036DoubleBasePalindromes problem = new _036DoubleBasePalindromes();

		testEquality(problem);
	}

}
