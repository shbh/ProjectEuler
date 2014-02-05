package euler;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Set;

public class DistinctPowers {

	
	public static void main(String[] args) {
	
			int lowerA = 2;
			int upperA = 100;
			int lowerB = 2;
			int upperB = 100;
			Set<BigInteger> powers = new HashSet<>(); 
	
			
			for(int i=lowerA;i<=upperA;i++)
			{
				for(int j=lowerB;j<=upperB;j++)
				{
					powers.add(BigInteger.valueOf(i).pow(j));
				}
			}
			System.out.println(powers.size());
	}
	
}
