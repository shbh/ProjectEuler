package project.euler.problem;

import junit.framework.Assert;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _056PowerfulDigitSumTest extends EulerTest {
	static Logger logger = Logger.getLogger(_056PowerfulDigitSumTest.class);

	public _056PowerfulDigitSumTest() {
		super(_056PowerfulDigitSum.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_056PowerfulDigitSum problem = new _056PowerfulDigitSum();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
