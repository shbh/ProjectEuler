package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _039IntegerRightTrianglesTest extends EulerTest {

	public _039IntegerRightTrianglesTest() {
		super(_039IntegerRightTriangles.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_039IntegerRightTriangles problem = new _039IntegerRightTriangles();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
