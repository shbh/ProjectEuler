package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _049PrimePermutationsTest extends EulerTest {

	public _049PrimePermutationsTest() {
		super(_049PrimePermutations.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_049PrimePermutations problem = new _049PrimePermutations();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
