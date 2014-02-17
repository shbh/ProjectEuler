package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _044PentagonNumbersTest extends EulerTest {
	static Logger logger = Logger.getLogger(_044PentagonNumbersTest.class);

	public _044PentagonNumbersTest() {
		super(_044PentagonNumbers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_044PentagonNumbers problem = new _044PentagonNumbers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
