package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _015LatticePathsTest extends EulerTest {

	public _015LatticePathsTest() {
		super(_015LatticePaths.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_015LatticePaths problem = new _015LatticePaths();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
