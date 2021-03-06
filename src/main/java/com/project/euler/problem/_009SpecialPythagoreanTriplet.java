package com.project.euler.problem; 
import org.apache.log4j.Logger;



/**
 * Created by shashi on 1/28/14.
 */
public class _009SpecialPythagoreanTriplet  { 
	
	static Logger logger = Logger.getLogger(_009SpecialPythagoreanTriplet.class);

	int marker = 1000;

	public Integer solve() {

		int result = 0;
		result:
		for (int c = 1; c <= marker; c++) {

			int a;
			
			int residue = marker - c;
		
			for (int b = 1; b < residue; b++) {
		
				a = residue - b;
		
				if (a * a + b * b == c * c) {
		
					result =  a * b * c;
					break result;
				} else {
			
					if (a == b || a == (b - 1)) {
			
						break;
		
					}
				}
			}

		}
		
		return result;

	}

}
