package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _033DigitCancelingFractionsTest extends EulerTest {

	public _033DigitCancelingFractionsTest() {
		super(_033DigitCancelingFractions.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_033DigitCancelingFractions problem = new _033DigitCancelingFractions();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
