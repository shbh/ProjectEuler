package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _012HighlyDivisibleTriangularNumberTest extends EulerTest {

	public _012HighlyDivisibleTriangularNumberTest() {
		super(_012HighlyDivisibleTriangularNumber.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_012HighlyDivisibleTriangularNumber problem = new _012HighlyDivisibleTriangularNumber();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
