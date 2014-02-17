package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _020FactorialDigitSumTest extends EulerTest {
	static Logger logger = Logger.getLogger(_020FactorialDigitSumTest.class);

	public _020FactorialDigitSumTest() {
		super(_020FactorialDigitSum.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_020FactorialDigitSum problem = new _020FactorialDigitSum();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
