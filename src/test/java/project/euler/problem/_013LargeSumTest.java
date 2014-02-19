package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _013LargeSumTest extends EulerTest {

	static Logger logger = Logger.getLogger(_013LargeSumTest.class);

	public _013LargeSumTest() {

		super(_013LargeSum.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {

		_013LargeSum problem = new _013LargeSum();

		testEquality(problem);
	}

}
