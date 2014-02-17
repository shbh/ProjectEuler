package project.euler.problem;

import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _009SpecialPythagoreanTripletTest extends EulerTest {

	public _009SpecialPythagoreanTripletTest() {
		super(_009SpecialPythagoreanTriplet.class.getSimpleName());
	}

	@Test(timeout=60000)
	public void testSolve() {
		_009SpecialPythagoreanTriplet problem = new _009SpecialPythagoreanTriplet();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));
		
	}

}
