package project.euler.problem;

import project.euler.base.IProblem;
import project.euler.base.KeyConstant;

public class _031CoinSums implements IProblem {

	private static final int TARGET = 200;

	public Integer solve() {

		int count = 0;

		for (int a = TARGET ; a >= 0; a -= KeyConstant.COINS[7]) {
			for (int b = a; b >= 0; b -= KeyConstant.COINS[6]) {
				for (int c = b; c >= 0; c -= KeyConstant.COINS[5]) {
					for (int d = c; d >= 0; d -= KeyConstant.COINS[4]) {
						for (int e = d; e >= 0; e -= KeyConstant.COINS[3]) {
							for (int f = e; f >= 0; f -= KeyConstant.COINS[2]) {
								for (int g = f; g >= 0; g -= KeyConstant.COINS[1]) {
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

	public int getNo() {

		return 31;
	}

}
