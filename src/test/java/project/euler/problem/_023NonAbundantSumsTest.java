package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _023NonAbundantSumsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_023NonAbundantSumsTest.class);

	public _023NonAbundantSumsTest() {

		super(_023NonAbundantSums.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_023NonAbundantSums problem = new _023NonAbundantSums();

		testEquality(problem);
	}

}
