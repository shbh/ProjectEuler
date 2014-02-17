package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _032PandigitalProductsTest extends EulerTest {

	public _032PandigitalProductsTest() {
		super(_032PandigitalProducts.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_032PandigitalProducts problem = new _032PandigitalProducts();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
