package com.project.euler.problem;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _041PandigitalPrime  {

	static Logger logger = Logger.getLogger(_041PandigitalPrime.class);

	public Integer solve() {

		int n = 123456789;

		int m = n;

		int pandigitalNumber = 0;

		for (int i = 9; i > 0; i--) {

			Set<String> combinations = generateCombination(Integer.toString(m));

			m = n / (int) Math.pow(10, i);

			for (Iterator<String> iterator = combinations.iterator(); iterator.hasNext();) {

				String number = (String) iterator.next();

				if (Functions.isPrime(Long.parseLong(number))) {

					if (pandigitalNumber < Integer.parseInt(number)) {

						pandigitalNumber = Integer.parseInt(number);

					}

				}

			}

		}

		return pandigitalNumber;
	}

	
	private static final int ZERO = 0;
	
	

		// print N! permutation of the characters of the string s (in order)
	public  void perm1(final String string, final Set<String> content) {
		
		perm1("", content, string);
	
	}

	private  void perm1(final String prefix,
			final Set<String> content, final String string) {
		
		final int nLength = string.length();
		
		if (nLength == ZERO) {
		
			content.add(prefix);
	
		}
		else 
		{
		
			for (int i = 0; i < nLength; i++) {
			
				perm1(prefix + string.charAt(i),
						content,
						string.substring(0, i)
								+ string.substring(i + 1, nLength));
			
			}
		}

	}

	

	private  SortedSet<String> generateCombination(final String alphabet) {

		return generateCombination(alphabet, alphabet.length());
	
	}

	private  SortedSet<String> generateCombination(final String alphabet,
			final int nLength) {

		final SortedSet<String> strings = new TreeSet<String>(
				new Comparator<String>() {
	
					public int compare(final String first, final String second) {
						return Long.valueOf(second).compareTo(Long.valueOf(first));
					
					}

				});
		
		final String elements = alphabet.substring(0, nLength);
		
		perm1(elements, strings);

		return strings;
	
	}
}
