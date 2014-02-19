package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _048SelfPowersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_048SelfPowersTest.class);

	public _048SelfPowersTest() {

		super(_048SelfPowers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {

		_048SelfPowers problem = new _048SelfPowers();

		testEquality(problem);
	}

}
