package project.euler;

import java.util.Iterator;
import java.util.Set;

import euler.learning.Permutations;

public class PandigitalPrime {

	
	public static void main(String[] args) {
		int n = 123456789;
		
		int m = n;
		//
			//
		//}
		int pandigitalNumber = 0;
		boolean yougotit =false;
		for (int i = 1; i < 9; i++) {
			
			Set<String> combinations = Permutations.generate(Integer.toString(m));
			
			for (Iterator<String> iterator = combinations.iterator(); iterator
					.hasNext();) {
				String number = (String) iterator.next();
				
				if(isPrime(Long.parseLong(number)))
				{
					pandigitalNumber = Integer.parseInt(number);
					yougotit = true;
					break;
				}
				
			}
			if(yougotit)
			{
				break;
			}
			m = n/(int)Math.pow(10,i);
			
		}
		System.out.println(pandigitalNumber);
	}
	

	public static boolean isPrime(long number) {
		if (number < 0) {
			number = -number;
		}
		if(number==1 || number==0)return false;
		
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
