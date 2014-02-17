package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _023NonAbundantSumsTest extends EulerTest {

	public _023NonAbundantSumsTest() {
		super(_023NonAbundantSums.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_023NonAbundantSums problem = new _023NonAbundantSums();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
