package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _050ConsecutivePrimeSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_050ConsecutivePrimeSumTest.class);

	public _050ConsecutivePrimeSumTest() {

		super(_050ConsecutivePrimeSum.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_050ConsecutivePrimeSum problem = new _050ConsecutivePrimeSum();

		testEquality(problem);
	}

}
