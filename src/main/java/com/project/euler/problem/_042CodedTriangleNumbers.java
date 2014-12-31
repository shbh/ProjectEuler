package com.project.euler.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;
import com.project.euler.feature.Reader;

/**
 * Created by shashi on 1/30/14.
 */
public class _042CodedTriangleNumbers  {

	static Logger logger = Logger.getLogger(_042CodedTriangleNumbers.class);

	static List<Integer> triangleNumber = new ArrayList<>();

	static int max = 0;

	public Integer solve() {

		int n = 1;

		int count = 0;

		List<String> datas = new Reader().readFile("words.txt");

		String sCurrentLine = datas.get(0);

		String[] names = sCurrentLine.split(Functions.COMMA);

		Arrays.sort(names);

		for (int i = 0; i < names.length; i++) {

			int sum = 0;

			char[] charcters = names[i].replace(Functions.FORWARD_SLASH, Functions.BLANK).toCharArray();

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
