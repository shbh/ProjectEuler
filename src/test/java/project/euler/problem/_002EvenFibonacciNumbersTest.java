package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

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
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
