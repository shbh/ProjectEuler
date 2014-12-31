package com.project.euler.problem; 
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;


import com.project.euler.feature.Reader;

public class _099LargestExponential  { 

	static Logger logger = Logger.getLogger(_097LargeNonMersennePrime.class);


	public Integer solve() {


		List<String> datas = new Reader().readFile("p099_base_exp.txt");
		
		int[][] matrix = new int[1000][2];

		int line = 0;
		for (Iterator<String> iterator = datas.iterator(); iterator.hasNext();) {
			String data = (String) iterator.next();
			String[] value = data.split(",");

			for (int i = 0; i < value.length; i++) {
				matrix[line][i] = Integer.parseInt(value[i]);

			}
			line = line + 1;
		
		
		}
		
		int large = 0;
		int linenumber = 0;
		for (int i = 0; i < matrix.length; i++) {
			int base = matrix[i][0];
			int exponential = matrix[i][1];
			int value = (int) (exponential * Math.log(base));
			if(value > large)
			{
				large = value;
				linenumber=i+1;
			}
		}
		
		
		return linenumber;
		
		
	}
	

}
