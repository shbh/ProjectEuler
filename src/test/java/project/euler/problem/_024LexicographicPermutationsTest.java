package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _024LexicographicPermutationsTest extends EulerTest {

	public _024LexicographicPermutationsTest() {
		super(_024LexicographicPermutations.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_024LexicographicPermutations problem = new _024LexicographicPermutations();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
