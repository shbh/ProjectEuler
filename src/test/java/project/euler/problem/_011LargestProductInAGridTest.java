package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _011LargestProductInAGridTest extends EulerTest {

	public _011LargestProductInAGridTest() {
		super(_011LargestProductInAGrid.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_011LargestProductInAGrid problem = new _011LargestProductInAGrid();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
