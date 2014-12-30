package com.project.euler.problem;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;

/**
 * Created by shashi on 1/30/14.
 */
public class _067MaximumSumPathII implements IProblem {

	static Logger logger = Logger.getLogger(_067MaximumSumPathII.class);

	public Integer solve() {

		InputStream input = _067MaximumSumPathII.class.getClassLoader()
				.getResourceAsStream("triangle.txt");
		
		String[] texts = new String[100];
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(input))) {

			String sCurrentLine;

			int x = 0;
			while ((sCurrentLine = br.readLine()) != null) {
				texts[x++] = sCurrentLine;
			}

		} catch (Exception e) {

			logger.trace("friendly exception");

		}

		int x = texts.length;
		
		int y = texts[x - 1].split(" ").length;

		int[][] chunks = new int[x][y];

		for (int i = 0; i < x; i++) {
		
			String[] chunk = texts[i].split(" ");
			
			for (int j = 0; j < y; j++) {
			
				if (j < chunk.length) {
			
					chunks[i][j] = new Integer(chunk[j]);
			
				} else {
			
					chunks[i][j] = 0;
			
				}

			}
		}
		
		for (int i = x - 2; i >= 0; i--) {
		for (int j = y - 2; j >= 0; j--) {

			

				int right = chunks[i][j] + chunks[i + 1][j + 1];

				int left = chunks[i][j] + chunks[i + 1][j];

				chunks[i][j] = left > right ? left : right;

			}
		}

		

		return chunks[0][0];

	}

}
