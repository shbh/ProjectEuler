package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _047DistinctPrimesFactorsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_047DistinctPrimesFactorsTest.class);

	public _047DistinctPrimesFactorsTest() {
		super(_047DistinctPrimesFactors.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_047DistinctPrimesFactors problem = new _047DistinctPrimesFactors();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
