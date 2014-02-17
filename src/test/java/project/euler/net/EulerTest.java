package project.euler.net;

import java.util.Map;

import project.euler.util.Reader;

public class EulerTest {

	
	protected Map<Integer, String> results = Reader.getInstance().getResults();
	
	protected Integer classNo = 0;

	protected EulerTest(String className) {
		classNo = Integer.parseInt(className.substring(1, 4));
	}
	
	

}
