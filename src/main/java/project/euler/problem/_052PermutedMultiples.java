package project.euler.problem;

import java.util.Arrays;

import org.apache.log4j.Logger;

import project.euler.IProblem;
import project.euler.feature.Functions;

public class _052PermutedMultiples implements IProblem {

	static Logger logger = Logger.getLogger(_052PermutedMultiples.class);

	public Integer solve() {

		int digitnumber = 2;

		while (true) {
	
			int startrange = 10 * (int) Math.pow(10, digitnumber - 2);
			
			int endrange = 17 * (int) Math.pow(10, digitnumber - 2);

			for (int i = startrange; i < endrange; i++) {
			
				String number = Integer.toString(i);
				
				char[] temp = number.toCharArray();
				
				Arrays.sort(temp);
				
				int countPermutedMultiple = 0;
				
				for (int j = 6; j > 0; j--) {
				
					if (Functions.isPandigital(Integer.toString(j * i),	new String(temp))) {
					
						countPermutedMultiple++;
					} 
					else 
					{
					
						break;
					}
				}
				
				if (countPermutedMultiple == 6) {
				
					return i;

				}

			}
			
			digitnumber++;

		}

	}

}
