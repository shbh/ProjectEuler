package project.euler.problem;

import org.apache.log4j.Logger;
import junit.framework.Assert;

import org.junit.Test;

import project.euler.net.EulerTest;

public class _040ChampernowneConstantTest extends EulerTest {
	static Logger logger = Logger.getLogger(_040ChampernowneConstantTest.class);

	public _040ChampernowneConstantTest() {
		super(_040ChampernowneConstant.class.getSimpleName());
	}

	@Test(timeout = 60000)
	public void testSolve() {
		_040ChampernowneConstant problem = new _040ChampernowneConstant();
		Assert.assertEquals(problem.solve().toString(), results.get(classNo));

	}

}
