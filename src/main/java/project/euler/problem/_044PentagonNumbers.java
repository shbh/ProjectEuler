package project.euler.problem;

import org.apache.log4j.Logger;

import project.euler.base.IProblem;
import project.euler.feature.Functions;

public class _044PentagonNumbers implements IProblem {
	
	static Logger logger = Logger.getLogger(_044PentagonNumbers.class);

	public Integer solve() {

		int result = 0;
	
		boolean notFound = true;
		
		int i = 1;

		while (notFound) {
		
			i++;
			
			int n = i * (3 * i - 1) / 2;

			for (int j = i - 1; j > 0; j--) {
			
				int m = j * (3 * j - 1) / 2;
				
				if (Functions.isPentagonal(n - m) && Functions.isPentagonal(n + m)) {
				
					result = n - m;
					
					notFound = false;
					
					break;
				}
			}
		}
		
		
		return result;

	}

}
