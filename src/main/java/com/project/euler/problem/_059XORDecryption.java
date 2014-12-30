package com.project.euler.problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;

public class _059XORDecryption implements IProblem {

	static Logger logger = Logger.getLogger(_059XORDecryption.class);
	
	public Integer solve() {
		
		int result = 0;

		int[] ciphers = null;
		
		InputStream input = _059XORDecryption.class.getClassLoader().getResourceAsStream("cipher1.txt");
		
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {
			
			String cipher = br.readLine();
			
			String[] ciphertexts = cipher.split(",");
			
			ciphers = new int[ciphertexts.length];
			
			for (int i = 0; i < ciphertexts.length; i++) {
			
				ciphers[i] = Integer.parseInt(ciphertexts[i]);
			
			}
			
			gotoresult:
			for (int first = 97; first <= 122; first++) {
				
				for (int second = 97; second <= 122; second++) {
				
					for (int third = 97; third <= 122; third++) {
					
						StringBuilder sentence = new StringBuilder();
						
						int sum = 0;
						
						for (int i = 0; i < ciphers.length;) {
						
							int junk=0;
							
							int text1=0;
							
							int text2 =0;
							
							int text3 =0;
							
							try
							{
							
								text1 = ciphers[i] ^ first;
							
								junk++;
						
								text2 = ciphers[i + 1] ^ second;
							
								junk++;
							
								text3 = ciphers[i + 2] ^ third;
							
								junk++;
							
							}
							catch(Exception ex)
							{
							
								logger.trace("friendly exception");
							
							}
							
							sum+=text1+text2+text3;
							
							if(junk==3)
							{
							
								sentence.append((char)text1).append((char)text2).append((char)text3);	
							
							}
							else if(junk==2)
							{
							
								sentence.append((char)text1).append((char)text2).append((char)text3);
							
							}
							else
							{
							
								sentence.append((char)text1);
							
							}
							
							i+=3;
							
							
						}
						
						if(sentence.indexOf(" the ")>-1)
						{
							
							result= sum;
							break gotoresult;
						
						}

					}
				}
			}
		
		} catch (IOException e) {
		
			logger.trace("friendly exception");
		
		}

		
		
		return result;
	}

}
