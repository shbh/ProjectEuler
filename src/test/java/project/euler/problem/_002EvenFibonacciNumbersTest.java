package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _002EvenFibonacciNumbersTest extends EulerTest {

	public _002EvenFibonacciNumbersTest() {
		super(_002EvenFibonacciNumbers.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_002EvenFibonacciNumbers problem = new _002EvenFibonacciNumbers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
