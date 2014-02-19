package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _025ThousandDigitFibonacciNumberTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_025ThousandDigitFibonacciNumberTest.class);

	public _025ThousandDigitFibonacciNumberTest() {

		super(_025ThousandDigitFibonacciNumber.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_025ThousandDigitFibonacciNumber problem = new _025ThousandDigitFibonacciNumber();

		testEquality(problem);
	}

}
