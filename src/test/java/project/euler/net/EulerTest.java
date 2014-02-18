package project.euler.net;

import java.util.Map;

import project.euler.base.IProblem;
import project.euler.feature.Reader;

public abstract class EulerTest {

	
	protected Map<Integer, String> results = Reader.getInstance().getResults();
	
	protected Integer classNo = 0;

	protected EulerTest(String className) {
		classNo = Integer.parseInt(className.substring(1, 4));
	}
	
	
	protected void testEquality(IProblem problem)
	{
		if (!problem.solve().toString().equals(results.get(classNo))) {
			org.junit.Assert
					.fail("The result is not matched with desired result");
		}
	}


	protected abstract void testSolve();
	
	

}
