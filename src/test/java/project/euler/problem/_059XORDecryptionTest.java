package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _059XORDecryptionTest extends EulerTest {
	static Logger logger = Logger.getLogger(_059XORDecryptionTest.class);

	public _059XORDecryptionTest() {
		super(_059XORDecryption.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_059XORDecryption problem = new _059XORDecryption();

		testEquality(problem);
	}

}
