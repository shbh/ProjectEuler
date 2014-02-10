package project.euler;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TruncatablePrimes {

	public static void main(String[] args) {

		int count = 0;
		List<String> list = new ArrayList<>();
		
		Integer sum = 0;

		for (int i = 13; count <11; ) {
				System.out.println(i);
			if ( isPrime(i)) {
				// System.out.println(i);
				Set<String> combinations = generate("" + i);

				boolean isPrimeCombination = false;

				for (Iterator<String> iterator = combinations.iterator(); iterator
						.hasNext();) {

					String string = (String) iterator.next();
					if (isPrime(Integer.valueOf(string))) {
						isPrimeCombination = true;
						continue;
					} else {
						isPrimeCombination = false;
						break;
					}
				}
				if (isPrimeCombination) {
					list.add(Integer.toString(i));
						
						count = count+1;
						System.out.println(count + "::"+i);
						sum = sum + i;
					

				}

			}
			
			if(i%10==7)
			{
				i=i+6;
			}
			else if(i%10==3)
			{
				i=i+4;
			}

		}
		System.out.println(count + " " + sum);

	}

	@SuppressWarnings("unused")
	private static boolean isNumberStartNEndWith37(String string) {
		// TODO Auto-generated method stub
		//String 
		String l = string.substring(0,1);
		String r = string.substring(string.length()-1);
		if((l.equals("3") || l.equals("7"))&& (r.equals("3") || r.equals("7")) )
		{
			return true;
		}
		return false;
	}

	private static Set<String> generate(String string) {
		// TODO Auto-generated method stub
		Set<String> sets = new HashSet<>();
		sets.add(string);
		String ltemp = string;
		String rtemp = string;
		for (int i = 0; i < string.length() - 1; i++) {
			ltemp = ltemp.substring(0, ltemp.length() - 1);
			rtemp = rtemp.substring(1);

			sets.add(rtemp);
			sets.add(ltemp);
		}

		return sets;
	}

	

	public static boolean isPrime(long number) {
		if (number < 0) {
			number = -number;
		}
		
		if(number==1)
		{
			return false;
		}
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
