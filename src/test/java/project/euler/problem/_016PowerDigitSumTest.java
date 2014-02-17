package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _016PowerDigitSumTest extends EulerTest {

	public _016PowerDigitSumTest() {
		super(_016PowerDigitSum.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_016PowerDigitSum problem = new _016PowerDigitSum();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
