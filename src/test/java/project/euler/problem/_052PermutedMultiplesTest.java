package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _052PermutedMultiplesTest extends EulerTest {

	public _052PermutedMultiplesTest() {
		super(_052PermutedMultiples.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_052PermutedMultiples problem = new _052PermutedMultiples();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
