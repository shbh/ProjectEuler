package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _008LargestProductInASeriesTest extends EulerTest {

	public _008LargestProductInASeriesTest() {
		super(_008LargestProductInASeries.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_008LargestProductInASeries problem = new _008LargestProductInASeries();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
