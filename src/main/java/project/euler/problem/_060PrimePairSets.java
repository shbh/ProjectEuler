package project.euler.problem;

import static project.euler.feature.Functions.isPrime;

import java.util.ArrayList;
import java.util.List;

/*import java.util.ArrayList;
 import java.util.HashMap;
 import java.util.List;
 import java.util.Map;
 import java.util.Map.Entry;
 */
import org.apache.log4j.Logger;

import project.euler.IProblem;
import project.euler.feature.NumberText;

/*
 considering the given example is in three digit... so, maximum digit would be six digit... so, take out the combination till 999999...

 */
public class _060PrimePairSets implements IProblem {

	static Logger logger = Logger.getLogger(_060PrimePairSets.class);
	// Map<Integer, List<Integer>> combinations = new HashMap<>();

	int trail = 999999;
	int marker = 999;

	// List<String> primes = new ArrayList<>();
	// List<Integer> numberundertrail = new ArrayList<>();

	public Integer solve() {

		int[] primes = new int[trail];
		int[] numbers = new int[marker];

		for (Integer i = 3; i < trail; i++) {

			if (isPrime(i)) {
				if (i < marker) {
					numbers[i] = 1;
				} 
				primes[i]=1;
			}
		}

		int[][] result = new int[marker][marker];

		for (int i = 3; i < numbers.length; i = i + 2) {

			if (numbers[i] == 1) {
				for (int j = 3; j < numbers.length; j = j + 2) {
					if (numbers[j] == 1) {
						if (primes[Integer.parseInt(i + "" + j)] == 1) {
							
							result[i][j] = 1;

						}
					}
				}
			}
		}

		int solution = 0;
		int sum = 0;
		for (int i = 3; i < result.length; i=i+2) {// 3, 7, 109, and 673
			int loop = 0;
			
			int totalsum = 0;
			for (int j = 3; j < result[i].length; j=j+2) {// 3, 7, 109, and 673
				loop =1;
				if(result[i][j]==1) //7,9,673
				{
					for (int k = 3; k < result.length; k=k+2) {
						if(result[j][k]==1 && result[i][k]==1 && result[k][i]==1) //7,9,673
						{
							loop=2;
							for (int l = 3; l < result.length; l=l+2) {
								loop =3;
								if(result[k][l]==1 && result[i][l]==1 && result[l][i] == 1 && result[j][l]==1 && result[l][j]==1 ) //7,9,673
								{
									for (int m = 3; m < result.length; m=m+2) {
										loop =3;
										if(result[l][m]==1 && result[i][m]==1 && result[m][i] == 1 && result[j][m]==1 && result[m][j]==1 && result[k][m]==1 && result[m][k]==1 ) //7,9,673
										{
											logger.info(i+" "+j + " "+k + " "+l + " "+m);
										}
									}
									
								}
							}
						}
					}
				}
			}

		}

		return 0;
	}

}
