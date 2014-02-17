package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _050ConsecutivePrimeSumTest extends EulerTest {
	static Logger logger = Logger.getLogger(_050ConsecutivePrimeSumTest.class);

	public _050ConsecutivePrimeSumTest() {
		super(_050ConsecutivePrimeSum.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_050ConsecutivePrimeSum problem = new _050ConsecutivePrimeSum();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
