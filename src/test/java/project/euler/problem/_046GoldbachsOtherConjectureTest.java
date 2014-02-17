package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _046GoldbachsOtherConjectureTest extends EulerTest {
	static Logger logger = Logger.getLogger(_046GoldbachsOtherConjectureTest.class);

	public _046GoldbachsOtherConjectureTest() {
		super(_046GoldbachsOtherConjecture.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_046GoldbachsOtherConjecture problem = new _046GoldbachsOtherConjecture();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
