package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _051NextPrimeDigitReplacementsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_051NextPrimeDigitReplacementsTest.class);

	public _051NextPrimeDigitReplacementsTest() {

		super(_051NextPrimeDigitReplacements.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_051NextPrimeDigitReplacements problem = new _051NextPrimeDigitReplacements();

		testEquality(problem);

	}
}
