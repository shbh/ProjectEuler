package project.euler;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/29/14.
 */
public class LatticePaths implements IProblem {
	int limit = 20;

	public Integer solve() {

		int node = limit + 1;
		int[][] nodes = new int[node][node];

		int k = node - 1;
		for (int i = k; i >= 0; i--) {
			for (int j = k; j >= 0; j--) {
				if (i == k && j == k) {
					nodes[i][j] = 0;
				} else if (i == k) {
					nodes[i][j] = 1;
				} else if (j == k) {
					nodes[i][j] = 1;
				} else {
					nodes[i][j] = nodes[i + 1][j] + nodes[i][j + 1];
				}
			}
		}

		return nodes[0][0];

	}
	
	public LatticePaths limit(int limit)
	{
		this.limit = limit;
		return this;
	}
}
