package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _030DigitFifthPowersTest extends EulerTest {

	public _030DigitFifthPowersTest() {
		super(_030DigitFifthPowers.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_030DigitFifthPowers problem = new _030DigitFifthPowers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
