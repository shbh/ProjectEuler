package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _054PokerHandsTest extends EulerTest {

	public _054PokerHandsTest() {
		super(_054PokerHands.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_054PokerHands problem = new _054PokerHands();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
