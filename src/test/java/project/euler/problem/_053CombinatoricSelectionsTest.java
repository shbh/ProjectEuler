package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _053CombinatoricSelectionsTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_053CombinatoricSelectionsTest.class);

	public _053CombinatoricSelectionsTest() {

		super(_053CombinatoricSelections.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_053CombinatoricSelections problem = new _053CombinatoricSelections();

		testEquality(problem);

	}

}
