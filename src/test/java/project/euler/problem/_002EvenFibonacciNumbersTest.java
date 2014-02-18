package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _002EvenFibonacciNumbersTest extends EulerTest {
	static Logger logger = Logger.getLogger(_002EvenFibonacciNumbersTest.class);

	public _002EvenFibonacciNumbersTest() {
		super(_002EvenFibonacciNumbers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_002EvenFibonacciNumbers problem = new _002EvenFibonacciNumbers();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
