package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _047DistinctPrimesFactorsTest extends EulerTest {

	public _047DistinctPrimesFactorsTest() {
		super(_047DistinctPrimesFactors.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_047DistinctPrimesFactors problem = new _047DistinctPrimesFactors();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
