package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _025ThousandDigitFibonacciNumberTest extends EulerTest {

	public _025ThousandDigitFibonacciNumberTest() {
		super(_025ThousandDigitFibonacciNumber.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_025ThousandDigitFibonacciNumber problem = new _025ThousandDigitFibonacciNumber();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
