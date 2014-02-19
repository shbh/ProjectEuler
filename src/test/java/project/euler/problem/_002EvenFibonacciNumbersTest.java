package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;
import project.euler.feature.KeyConstant;

import project.euler.net.EulerTest;

public class _002EvenFibonacciNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_002EvenFibonacciNumbersTest.class);

	public _002EvenFibonacciNumbersTest() {

		super(_002EvenFibonacciNumbers.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_002EvenFibonacciNumbers problem = new _002EvenFibonacciNumbers();

		testEquality(problem);

	}

}
