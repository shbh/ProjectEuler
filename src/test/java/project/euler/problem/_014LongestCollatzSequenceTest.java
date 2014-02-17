package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _014LongestCollatzSequenceTest extends EulerTest {

	public _014LongestCollatzSequenceTest() {
		super(_014LongestCollatzSequence.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_014LongestCollatzSequence problem = new _014LongestCollatzSequence();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
