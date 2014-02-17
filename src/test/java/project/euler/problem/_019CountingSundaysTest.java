package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _019CountingSundaysTest extends EulerTest {

	public _019CountingSundaysTest() {
		super(_019CountingSundays.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_019CountingSundays problem = new _019CountingSundays();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
