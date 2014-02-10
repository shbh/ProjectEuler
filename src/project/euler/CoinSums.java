package project.euler;

import project.euler.base.IProblem;
import project.euler.base.Key;

public class CoinSums implements IProblem {

	int target = 0;

	public Integer solve() {

		int count = 0;

		for (int a = target; a >= 0; a -= Key.coins[7]) 
		{
			for (int b = a; b >= 0; b -= Key.coins[6]) 
			{
				for (int c = b; c >= 0; c -= Key.coins[5]) 
				{
					for (int d = c; d >= 0; d -= Key.coins[4]) 
					{
						for (int e = d; e >= 0; e -= Key.coins[3]) 
						{
							for (int f = e; f >= 0; f -= Key.coins[2]) 
							{
								for (int g = f; g >= 0; g -= Key.coins[1]) 
								{
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

	public CoinSums target(int target) {
		this.target = target;
		return this;
	}

}
