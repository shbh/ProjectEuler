package com.project.euler.problem;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

public class _069TotientMaximum implements IProblem {

	
	static Logger logger = Logger.getLogger(_069TotientMaximum.class);

	public static final Integer LIMIT = 100000;
	
	
	public Integer solve() {
	
		int[] primes = new int[20];
		
		int lastIndex = 0;
		primes[0]=2;
		int n =3;
		while(true)
		{
			if(lastIndex+1==20)
			{
				break;
			}
			boolean prime = Functions.isPrime(n);
			
			if(prime)
			{
				primes[++lastIndex]=n;
			}
			n=n+2;
		}
		
		int result = 1;
		for (int i = 0; i < primes.length; i++) {
			if(result>LIMIT)
			{
				break;
			}
			result=result*primes[i];
		}
//		double max = 0;
//		int maxN =0;
//		for (int i = LIMIT; i >0; i--) {
//			
//			
//			int psi = Functions.countNoOfRelativePrime(i);
//			double ratio = i/psi;
//			if(ratio>max)
//			{
//				max = ratio;
//				maxN = i;
//			}
//			
//		}
		
		return result;
	}

}
