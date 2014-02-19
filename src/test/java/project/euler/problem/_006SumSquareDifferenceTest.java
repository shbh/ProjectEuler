package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _006SumSquareDifferenceTest extends EulerTest {

	static Logger logger = Logger.getLogger(_006SumSquareDifferenceTest.class);

	public _006SumSquareDifferenceTest() {

		super(_006SumSquareDifference.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_006SumSquareDifference problem = new _006SumSquareDifference();

		testEquality(problem);
	}

}
