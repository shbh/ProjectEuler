package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _031CoinSumsTest extends EulerTest {

	public _031CoinSumsTest() {
		super(_031CoinSums.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_031CoinSums problem = new _031CoinSums();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
