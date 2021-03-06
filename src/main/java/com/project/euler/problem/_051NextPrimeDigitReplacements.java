package com.project.euler.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _051NextPrimeDigitReplacements  {

	static Logger logger = Logger.getLogger(_051NextPrimeDigitReplacements.class);

	public Integer solve() {

		int result = 0;
		
		
		gotoresult:
		for (int i = 11; i < 1000000; i = i + 2) {
			
	
			if (Functions.isPrime(i)) {
			
				String strPrime = Integer.toString(i);
				
				char[] chars = strPrime.toCharArray();
				
				Character[] characters = new Character[chars.length];
				
				for (int l = 0; l < chars.length; l++) {
				
					characters[l] = chars[l];
				
				}
				
				Set<Character> uniqueChars = new HashSet<Character>(Arrays.asList(characters));
				
				for (Character c : uniqueChars) {
				
				
					if (strPrime.replace(c.toString(), "").length() != strPrime.length() - 3) {
					
						continue;
					}

					List<Integer> listPrimes = new ArrayList<>();
					
					for (Integer j = 0; j < 10; j++) {
					
					
						Integer newNum = Integer.parseInt(strPrime.replace(c.toString(), j.toString()));
						
						if (Functions.isPrime(newNum) && newNum.toString().length() == strPrime.length()) {
						
							listPrimes.add(newNum);
						
						}

						List<Integer> unique = new ArrayList<Integer>();

						for (Integer arr : listPrimes) {
							// Use your method here, to test whether this value
							// - `arr`
							// is already in `unique` List or not. If not, then
							// add it.
							if (!unique.contains(arr)) {
						
								unique.add(arr);
							
							}
						}

						if (unique.size() == 8) {
							
							Collections.sort(unique);
							
							result= unique.get(0);
							break gotoresult;
						
						}

					}
				}
			}
		}
	
		return result;

	}

}
