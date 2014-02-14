package project.euler.problem;

import project.euler.base.IProblem;

/**
 * Created by shashi on 1/29/14.
 */
public class _015LatticePaths implements IProblem {

	int limit = 20;

	public Long solve() {
		int node = limit + 1;
		long[][] nodes = new long[node][node];

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

	public int getNo() {

		return 15;
	}
}