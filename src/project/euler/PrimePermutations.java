package project.euler;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class PrimePermutations {

	static List<Integer> primes = new ArrayList<>();

	public Integer solve() {

		
		for (int i = 1000; i < 10000; i++) {
			if (isPrime(i)) {
				primes.add(i);
				
			}
		}
		
		Map<String, List<Integer>> filters = new HashMap<>();
		for (Iterator<Integer> iterator = primes.iterator(); iterator.hasNext();) {
			Integer integer = (Integer) iterator.next();
			char[] temp = integer.toString().toCharArray();
			Arrays.sort(temp);
		
			String tempString = new String(temp);
			if(filters.containsKey(tempString))
			{
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
		
		Map<String,List<Integer>> result = new HashMap<>();
		Map<String, List<Integer>> tempfilter = new HashMap<>(filters);
		
		Set<String> keySet = filters.keySet();
		
		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			List<Integer> values = filters.get(key);
			if(values.size()>2)
			{
				boolean isFound = false;
				for (Integer top : values) {
					
					for (Integer bottom : values) {
						
						Integer diff =top-bottom;
						
						if(diff<0)
						{
							diff=diff*(-1);
						}
						
						
						if(top+diff!=bottom && values.contains(top+diff))
						{
							
							System.out.println(key);
							List<Integer> resultValue = new LinkedList<>();
							resultValue.add(top);
							resultValue.add(top+diff);
							resultValue.add(bottom);
							result.put(key,resultValue);
							isFound=true;
							break;
						}
						
					}
					if(isFound)
					{
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
		for (Iterator<String> iterator = keySet.iterator(); iterator.hasNext();) {
			String key = iterator.next();
			System.out.print(key+"::");
			List<Integer> resultValue = result.get(key);
			Collections.sort(resultValue);
			
			System.out.println(join(resultValue,""));
		}

	}

	public static String join(List<?> list, String delim) {
	    int len = list.size();
	    if (len == 0)
	        return "";
	    StringBuilder sb = new StringBuilder(list.get(0).toString());
	    for (int i = 1; i < len; i++) {
	        sb.append(delim);
	        sb.append(list.get(i).toString());
	    }
	    return sb.toString();
	}
	
	public static boolean isPrime(long number) {
		long condition = number / 2 + 1;
		for (int n = 2; n < condition; n++) {

			if (number % n == 0) {
				return false;
			}
			condition = number / n + 1;
		}
		return true;
	}


}
