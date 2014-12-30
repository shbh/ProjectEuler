package com.project.euler.problem; 
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;

public class _099LargestExponential implements IProblem { 

	static Logger logger = Logger.getLogger(_097LargeNonMersennePrime.class);


	public Integer solve() {

		InputStream input = _081PathSumTwoWays.class.getClassLoader().getResourceAsStream("p099_base_exp.txt");

		int[][] matrix = new int[1000][2];

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

		} catch (Exception e) {

		//	logger.trace("friendly exception");

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
