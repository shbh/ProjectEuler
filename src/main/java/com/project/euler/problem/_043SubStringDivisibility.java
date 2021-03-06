package com.project.euler.problem;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _043SubStringDivisibility  {
	
	static Logger logger = Logger.getLogger(_043SubStringDivisibility.class);

	public Long solve() {
		
		long sum = 0;

		// Loop through all multiples
		for (int p17 = 17; p17 < 1000; p17 += 17) 
		{
			
			// Make sure the multiple has distinct digits.
			if (!Functions.areDistinctDigits(p17))
			{
				continue; 
			}
			
			// Loop through all multiples of 13.
			for (int p13 = 13; p13 < 1000; p13 += 13) 
			{
				
				// Make sure the multiple of 17 ends with the starting digits of
				// the multiple of 13.
				
				if (p17 / 10 != p13 % 100 || !Functions.areDistinctDigits(p13))
				{
				
					continue;
				}

				for (int p11 = 11; p11 < 1000; p11 += 11) {
					
					if (p13 / 10 != p11 % 100 || !Functions.areDistinctDigits(p11))
					{
						continue;
					}
					
					
					for (int p7 = 7; p7 < 1000; p7 += 7) {
					
						if (p11 / 10 != p7 % 100 || !Functions.areDistinctDigits(p7))
						{
						
							continue;
						}

						for (int p5 = 5; p5 < 1000; p5 += 5) {
							
							if (p7 / 10 != p5 % 100 || !Functions.areDistinctDigits(p5))
							{
							
								continue;
							}

							for (int p3 = 3; p3 < 1000; p3 += 3) {
								
								if (p5 / 10 != p3 % 100 || !Functions.areDistinctDigits(p3))
								{
								
									continue;
								}

								for (int p2 = 2; p2 < 1000; p2 += 2) {
									
									if (p3 / 10 != p2 % 100 || !Functions.areDistinctDigits(p2))
									{
										continue;
									}
								
									// Extract the the correct digits from the multiples and concatenate the together.
									
									long c1310= Functions.concat(p13 % 10,p17 % 10);
									
									long c1110 = Functions.concat(p11 % 10,c1310);
									
									long c0710= Functions.concat(p7 % 10,c1110);
											
									long c0510 = Functions.concat(p5 % 10,c0710);	
									
									long c0310 = Functions.concat(p3 % 10,c0510);

									long n = (long) Functions.concat(p2,c0310);
									
									// Make sure the concatenated number has
									// distinct digits.
									
									if (!Functions.areDistinctDigits(n))
									{
										continue;
									}
									
									// Find the last digit needed and
									// concatenated to the front of the number.
									
									long pan = Functions.makePandigital(n);
									
									
									// Make sure the missing digit was not a 0
									// (Because 0123456789 is not a 0-9
									// pandigital).
									
									
									if (n == pan)
									{
									
										continue;
									
									}

									
									// And finally add it to the sum.
									
									
									sum += pan;
								
								}
							}
						}
					}
				}
			}
		}

		return sum;

	}

}
