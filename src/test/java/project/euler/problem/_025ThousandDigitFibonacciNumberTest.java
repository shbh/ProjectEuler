package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _025ThousandDigitFibonacciNumberTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_025ThousandDigitFibonacciNumberTest.class);

	public _025ThousandDigitFibonacciNumberTest() {
		super(_025ThousandDigitFibonacciNumber.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_025ThousandDigitFibonacciNumber problem = new _025ThousandDigitFibonacciNumber();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
