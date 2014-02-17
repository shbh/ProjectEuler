package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _001MultiplesOf3And5Test extends EulerTest {

	public _001MultiplesOf3And5Test() {
		super(_001MultiplesOf3And5.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_001MultiplesOf3And5 problem = new _001MultiplesOf3And5();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
