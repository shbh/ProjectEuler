package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _029DistinctPowersTest extends EulerTest {

	public _029DistinctPowersTest() {
		super(_029DistinctPowers.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_029DistinctPowers problem = new _029DistinctPowers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
