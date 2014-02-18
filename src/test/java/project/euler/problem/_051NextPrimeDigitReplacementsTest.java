package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _051NextPrimeDigitReplacementsTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_051NextPrimeDigitReplacementsTest.class);

	public _051NextPrimeDigitReplacementsTest() {
		super(_051NextPrimeDigitReplacements.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_051NextPrimeDigitReplacements problem = new _051NextPrimeDigitReplacements();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
