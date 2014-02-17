package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _029DistinctPowersTest extends EulerTest {
	static Logger logger = Logger.getLogger(_029DistinctPowersTest.class);

	public _029DistinctPowersTest() {
		super(_029DistinctPowers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_029DistinctPowers problem = new _029DistinctPowers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
