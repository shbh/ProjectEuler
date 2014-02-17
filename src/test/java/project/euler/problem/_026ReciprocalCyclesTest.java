package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _026ReciprocalCyclesTest extends EulerTest {
	static Logger logger = Logger.getLogger(_026ReciprocalCyclesTest.class);

	public _026ReciprocalCyclesTest() {
		super(_026ReciprocalCycles.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_026ReciprocalCycles problem = new _026ReciprocalCycles();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
