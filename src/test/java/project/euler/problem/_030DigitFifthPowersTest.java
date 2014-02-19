package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _030DigitFifthPowersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_030DigitFifthPowersTest.class);

	public _030DigitFifthPowersTest() {

		super(_030DigitFifthPowers.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {

		_030DigitFifthPowers problem = new _030DigitFifthPowers();

		testEquality(problem);
	}

}
