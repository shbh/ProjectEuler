package project.euler.problem;

import org.apache.log4j.Logger;
import org.junit.Test;

import project.euler.net.EulerTest;

public class _024LexicographicPermutationsTest extends EulerTest {
	static Logger logger = Logger
			.getLogger(_024LexicographicPermutationsTest.class);

	public _024LexicographicPermutationsTest() {
		super(_024LexicographicPermutations.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_024LexicographicPermutations problem = new _024LexicographicPermutations();
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}

	}

}
