package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _034DigitFactorialsTest extends EulerTest {
	static Logger logger = Logger.getLogger(_034DigitFactorialsTest.class);

	public _034DigitFactorialsTest() {
		super(_034DigitFactorials.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_034DigitFactorials problem = new _034DigitFactorials();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
