package com.project.euler.problem;

import java.util.List;

import org.apache.log4j.Logger;


import com.project.euler.feature.Reader;

public class _059XORDecryption  {

	static Logger logger = Logger.getLogger(_059XORDecryption.class);

	public Integer solve() {

		int result = 0;

		int[] ciphers = null;

		List<String> datas = new Reader().readFile("cipher1.txt");

		String cipher = datas.get(0);

		String[] ciphertexts = cipher.split(",");

		ciphers = new int[ciphertexts.length];

		for (int i = 0; i < ciphertexts.length; i++) {

			ciphers[i] = Integer.parseInt(ciphertexts[i]);

		}

		gotoresult: for (int first = 97; first <= 122; first++) {

			for (int second = 97; second <= 122; second++) {

				for (int third = 97; third <= 122; third++) {

					StringBuilder sentence = new StringBuilder();

					int sum = 0;

					for (int i = 0; i < ciphers.length;) {

						int junk = 0;

						int text1 = 0;

						int text2 = 0;

						int text3 = 0;

						

							text1 = ciphers[i] ^ first;

							junk++;

						if(i<ciphers.length-1)
						{
							text2 = ciphers[i + 1] ^ second;

							junk++;

							text3 = ciphers[i + 2] ^ third;

							junk++;

						} 

						sum += text1 + text2 + text3;

						sentence.append((char) text1);
						
						if (junk == 3 || junk ==2) {

							sentence.append((char) text2).append((char) text3);

						} 
						i += 3;

					}

					if (sentence.indexOf(" the ") > -1) {

						result = sum;
						break gotoresult;

					}

				}
			}
		}

		return result;
	}

}
