package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _005SmallestMultipleTest extends EulerTest {

	public _005SmallestMultipleTest() {
		super(_005SmallestMultiple.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_005SmallestMultiple problem = new _005SmallestMultiple();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
