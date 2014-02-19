package project.euler.problem;


import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.feature.KeyConstant;
import project.euler.net.EulerTest;

public class _049PrimePermutationsTest extends EulerTest {

	static Logger logger = Logger.getLogger(_049PrimePermutationsTest.class);

	public _049PrimePermutationsTest() {

		super(_049PrimePermutations.class.getSimpleName());
	}

	@Test(timeout = KeyConstant.ALLOWEDTIME)
	public void testSolve() {

		_049PrimePermutations problem = new _049PrimePermutations();

		testEquality(problem);
	}

}
