package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _028NumberSpiralDiagonalsTest extends EulerTest {

	public _028NumberSpiralDiagonalsTest() {
		super(_028NumberSpiralDiagonals.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_028NumberSpiralDiagonals problem = new _028NumberSpiralDiagonals();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
