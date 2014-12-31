package com.project.euler.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;

public class _049PrimePermutations  {

	static Logger logger = Logger.getLogger(_049PrimePermutations.class);

	public String solve() {

		List<Integer> primes = new ArrayList<>();
	
		for (int i = 1000; i < 10000; i++) {
		
			if (Functions.isPrime(i)) {
			
				primes.add(i);

			}
		}

		final Map<String, List<Integer>> filters = new HashMap<>();
		
		for (Iterator<Integer> iterator = primes.iterator(); iterator.hasNext();) {
		
			Integer integer = (Integer) iterator.next();
			
			char[] temp = integer.toString().toCharArray();
			
			Arrays.sort(temp);

			String tempString = new String(temp);
			
			if (filters.containsKey(tempString)) {
			
				List<Integer> values = filters.get(tempString);
				
				values.add(integer);
			} 
			else 
			{

				List<Integer> values = new ArrayList<>();
			
				values.add(integer);
				
				filters.put(tempString, values);
			
			}

		}

		final Map<String, List<Integer>> result = new HashMap<>();
		
		final Map<String, List<Integer>> tempfilter = new HashMap<>(filters);

		
		Set<String> keySet = filters.keySet();

		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
		
			String key = iterator.next();
			
			List<Integer> values = filters.get(key);
			
			if (values.size() > 2) {
			
				boolean isFound = false;
				
				for (Integer top : values) {

					for (Integer bottom : values) {

						Integer diff = top - bottom;

						if (diff < 0) {
				
							diff = diff * (-1);
						
						}

						if (top + diff != bottom && values.contains(top + diff)) {

							final List<Integer> resultValue = new LinkedList<>();
						
							resultValue.add(top);
							
							resultValue.add(top + diff);
							
							resultValue.add(bottom);
							
							result.put(key, resultValue);
							
							isFound = true;
							
							break;
						}

					}

					if (isFound) {
					
						break;
					
					}
				}

			} 
			else 
			{
			
				tempfilter.remove(key);
			
			}

		}

		keySet = result.keySet();
		String output = Functions.BLANK;
		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
		
			String key = iterator.next();
			
			List<Integer> resultValue = result.get(key);
			
			Collections.sort(resultValue);
			
			if (key.equals("1478")) {
			
				continue;
			
			}
			
			output = Functions.join(resultValue, Functions.BLANK);
			break;
		}

		
		return output;

	}

}
