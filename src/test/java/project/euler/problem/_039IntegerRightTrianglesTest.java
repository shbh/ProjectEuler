package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _039IntegerRightTrianglesTest extends EulerTest {

	static Logger logger = Logger
			.getLogger(_039IntegerRightTrianglesTest.class);

	public _039IntegerRightTrianglesTest() {

		super(_039IntegerRightTriangles.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_039IntegerRightTriangles problem = new _039IntegerRightTriangles();

		testEquality(problem);
	}

}
