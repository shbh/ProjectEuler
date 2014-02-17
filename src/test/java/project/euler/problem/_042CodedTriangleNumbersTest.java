package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _042CodedTriangleNumbersTest extends EulerTest {

	public _042CodedTriangleNumbersTest() {
		super(_042CodedTriangleNumbers.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_042CodedTriangleNumbers problem = new _042CodedTriangleNumbers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
