package com.project.euler.problem; 
import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _031CoinSums  { 

	static Logger logger = Logger.getLogger(_031CoinSums.class);

	private static final int TARGET = 200;

	public Integer solve() {

		int count = 0;

		for (int a = TARGET ; a >= 0; a -= Functions.COINS[7]) {
	
			for (int b = a; b >= 0; b -= Functions.COINS[6]) {
			
				for (int c = b; c >= 0; c -= Functions.COINS[5]) {
				
					for (int d = c; d >= 0; d -= Functions.COINS[4]) {
					
						for (int e = d; e >= 0; e -= Functions.COINS[3]) {
						
							for (int f = e; f >= 0; f -= Functions.COINS[2]) {
							
								for (int g = f; g >= 0; g -= Functions.COINS[1]) {
									
									count++;
								
								}
							}
						}
					}
				}
			}
		}
		
		return count;
	}


}
