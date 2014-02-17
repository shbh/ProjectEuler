package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _018MaximumPathSumITest extends EulerTest {

	public _018MaximumPathSumITest() {
		super(_018MaximumPathSumI.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_018MaximumPathSumI problem = new _018MaximumPathSumI();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
