package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _048SelfPowersTest extends EulerTest {

	public _048SelfPowersTest() {
		super(_048SelfPowers.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_048SelfPowers problem = new _048SelfPowers();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
