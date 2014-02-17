package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _045TriangularPentagonalAndHexagonalTest extends EulerTest {

	public _045TriangularPentagonalAndHexagonalTest() {
		super(_045TriangularPentagonalAndHexagonal.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_045TriangularPentagonalAndHexagonal problem = new _045TriangularPentagonalAndHexagonal();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
