package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _038PandigitalMultiplesTest extends EulerTest {

	public _038PandigitalMultiplesTest() {
		super(_038PandigitalMultiples.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_038PandigitalMultiples problem = new _038PandigitalMultiples();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
