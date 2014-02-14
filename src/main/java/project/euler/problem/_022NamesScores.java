package project.euler.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import project.euler.base.IProblem;
import project.euler.base.KeyConstant;

/**
 * Created by shashi on 1/30/14.
 */
public class _022NamesScores implements IProblem {

	public Long solve() {
		InputStream input = _022NamesScores.class
				.getResourceAsStream("/files/project/names.txt");
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(input))) {

			String sCurrentLine = br.readLine();
			long totalsum = 0;
			if (sCurrentLine != null) {
				String[] names = sCurrentLine.split(KeyConstant.COMMA);
				Arrays.sort(names);
				for (int i = 0; i < names.length; i++) {

					int sum = 0;
					char[] charcters = names[i].replace(KeyConstant.FORWARD_SLASH,
							KeyConstant.BLANK).toCharArray();
					for (int c = 0; c < charcters.length; c++) {
						sum += charcters[c] - 64;
					}
					totalsum += sum * (i + 1);

				}
			} else {
				return 0l;
			}
			return totalsum;
		} catch (IOException e) {
			e.printStackTrace();
		}
		return 0l;
	}

	public int getNo() {

		return 22;
	}

}
