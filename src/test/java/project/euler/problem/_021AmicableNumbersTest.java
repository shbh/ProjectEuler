package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _021AmicableNumbersTest extends EulerTest {

	public _021AmicableNumbersTest() {
		super(_021AmicableNumbers.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_021AmicableNumbers problem = new _021AmicableNumbers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
