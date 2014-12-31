package com.project.euler.problem;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;


import com.project.euler.feature.Functions;
import com.project.euler.feature.Reader;

/**
 * Created by shashi on 1/30/14.
 */
public class _022NamesScores  {

	static Logger logger = Logger.getLogger(_022NamesScores.class);

	public Long solve() {

		List<String> datas = Reader.getInstance().readFile("names.txt");

		String sCurrentLine = datas.get(0);

		long totalsum = 0;

		if (sCurrentLine != null) {

			String[] names = sCurrentLine.split(Functions.COMMA);

			Arrays.sort(names);

			for (int i = 0; i < names.length; i++) {

				int sum = 0;

				char[] charcters = names[i].replace(Functions.FORWARD_SLASH, Functions.BLANK).toCharArray();

				for (int c = 0; c < charcters.length; c++) {

					sum += charcters[c] - 64;
				}

				totalsum += sum * (i + 1);

			}
		}

		return totalsum;

	}

}
