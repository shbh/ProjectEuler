package com.project.euler.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;

public class _081PathSumTwoWays implements IProblem {

	static Logger logger = Logger.getLogger(_081PathSumTwoWays.class);

	public Integer solve() {

		InputStream input = _081PathSumTwoWays.class.getClassLoader().getResourceAsStream("p081_matrix.txt");

		int[][] matrix = new int[80][80];

		try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {

			String sCurrentLine;

			int line = 0;
			while ((sCurrentLine = br.readLine()) != null) {

				String[] value = sCurrentLine.split(",");

				for (int i = 0; i < value.length; i++) {
					matrix[line][i] = Integer.parseInt(value[i]);

				}
				line = line + 1;
			}

		} catch (IOException e) {

			logger.trace("friendly message");

		}
		

		return getMinimalSumPath(matrix);
	}


	public static int getMinimalSumPath(int[][] numbers) {
		
		int dimension = numbers.length - 1;
		for (int x = dimension; x >= 0; x--)
			for (int y = dimension; y >= 0; y--) {
				if (x == dimension && y == dimension)
					continue;
				int val1 = x < dimension ? numbers[x + 1][y] : Integer.MAX_VALUE;
				int val2 = y < dimension ? numbers[x][y + 1] : Integer.MAX_VALUE;
				numbers[x][y] += val1 < val2 ? val1 : val2;
			
				
				
			}
		return numbers[0][0];
	}

}
