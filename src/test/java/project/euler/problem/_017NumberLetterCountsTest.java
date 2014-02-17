package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _017NumberLetterCountsTest extends EulerTest {

	public _017NumberLetterCountsTest() {
		super(_017NumberLetterCounts.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_017NumberLetterCounts problem = new _017NumberLetterCounts();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
