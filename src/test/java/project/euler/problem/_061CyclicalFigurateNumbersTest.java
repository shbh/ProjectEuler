package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _061CyclicalFigurateNumbersTest extends EulerTest {

	static Logger logger = Logger.getLogger(_061CyclicalFigurateNumbers.class);

	public _061CyclicalFigurateNumbersTest() {

		super(_061CyclicalFigurateNumbers.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_061CyclicalFigurateNumbers problem = new _061CyclicalFigurateNumbers();

		testEquality(problem);
	}

}
