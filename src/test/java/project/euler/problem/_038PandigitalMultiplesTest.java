package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _038PandigitalMultiplesTest extends EulerTest {
	static Logger logger = Logger.getLogger(_038PandigitalMultiplesTest.class);

	public _038PandigitalMultiplesTest() {
		super(_038PandigitalMultiples.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_038PandigitalMultiples problem = new _038PandigitalMultiples();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}