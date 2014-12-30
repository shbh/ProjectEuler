package com.project.euler.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

/**
 * Created by shashi on 1/30/14.
 */
public class _042CodedTriangleNumbers implements IProblem {
	
	static Logger logger = Logger.getLogger(_042CodedTriangleNumbers.class);

	static List<Integer> triangleNumber = new ArrayList<>();
	
	static int max = 0;

	public Integer solve() {

		int n = 1;
		
		int count = 0;
		
		InputStream input = _042CodedTriangleNumbers.class.getClassLoader()
				.getResourceAsStream("words.txt");
		
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(input))) {

			String sCurrentLine = br.readLine();

			String[] names = sCurrentLine.split(Functions.COMMA);
		
			Arrays.sort(names);
			
			for (int i = 0; i < names.length; i++) {

			
				int sum = 0;
			
				char[] charcters = names[i].replace(Functions.FORWARD_SLASH,
						Functions.BLANK).toCharArray();
				
				
				for (int c = 0; c < charcters.length; c++) {
					
					sum += charcters[c] - 64;
					
					if (sum > max) {
					
						n = generateNext(n, sum);

					}

				}
				
				if (triangleNumber.contains(sum)) {
				
					count++;
				
				}

			}
			
			return count;
		
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
		
		return 0;
	}

	private final int generateNext(int n, int limit) {

		int sum = n * (n + 1) / 2;
		
		triangleNumber.add(sum);
		
		max = sum;
		
		if (sum < limit) {
		
			return generateNext(n + 1, limit);
		
		
		}
		
		return n;

	}

}
