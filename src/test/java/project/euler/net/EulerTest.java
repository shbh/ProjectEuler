package project.euler.net;

import java.util.Map;

import project.euler.IProblem;
import project.euler.feature.Encrypt;
import project.euler.feature.Reader;

public abstract class EulerTest {


	
	protected Map<Integer, String> results = Reader.getInstance().getResults();
	
	protected Integer classNo = 0;

	protected EulerTest(String className) {

		classNo = Integer.parseInt(className.substring(1, 4));
	}
	
	
	protected void testEquality(IProblem problem)
	{

		try {
			if (!Encrypt.encrypt(problem.solve().toString(), "SHA", "UTF-8").equals(results.get(classNo))) {

				org.junit.Assert
						.fail("The result is not matched with desired result");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			org.junit.Assert
			.fail("The system break!!! not the code");
		}
	}


	protected abstract void testSolve();
	
	

}
