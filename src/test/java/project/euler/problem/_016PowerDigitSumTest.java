package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _016PowerDigitSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_016PowerDigitSumTest.class);

	public _016PowerDigitSumTest() {

		super(_016PowerDigitSum.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_016PowerDigitSum problem = new _016PowerDigitSum();

		testEquality(problem);
	}

}
