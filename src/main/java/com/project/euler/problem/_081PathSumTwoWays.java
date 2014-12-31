package com.project.euler.problem;

import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;


import com.project.euler.feature.Reader;

public class _081PathSumTwoWays  {

	static Logger logger = Logger.getLogger(_081PathSumTwoWays.class);

	public Integer solve() {

	
		int[][] matrix = new int[80][80];
		
		List<String> datas = Reader.getInstance().readFile("p081_matrix.txt");

		int line = 0;
		for (Iterator<String> iterator = datas.iterator(); iterator.hasNext();) {
			String data = (String) iterator.next();
			String[] value = data.split(",");

			for (int i = 0; i < value.length; i++) {
				matrix[line][i] = Integer.parseInt(value[i]);

			}
			line = line + 1;
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
