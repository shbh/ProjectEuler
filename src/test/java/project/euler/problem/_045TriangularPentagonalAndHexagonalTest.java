package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _045TriangularPentagonalAndHexagonalTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_045TriangularPentagonalAndHexagonalTest.class);

	public _045TriangularPentagonalAndHexagonalTest() {

		super(_045TriangularPentagonalAndHexagonal.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_045TriangularPentagonalAndHexagonal problem = new _045TriangularPentagonalAndHexagonal();

		testEquality(problem);
	}

}
