package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _039IntegerRightTrianglesTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_039IntegerRightTrianglesTest.class);

	public _039IntegerRightTrianglesTest() {
		super(_039IntegerRightTriangles.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_039IntegerRightTriangles problem = new _039IntegerRightTriangles();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
