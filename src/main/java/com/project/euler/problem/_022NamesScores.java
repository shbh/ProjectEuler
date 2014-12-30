package com.project.euler.problem; 
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

import org.apache.log4j.Logger;

import com.project.euler.IProblem;
import com.project.euler.feature.Functions;

/**
 * Created by shashi on 1/30/14.
 */
public class _022NamesScores implements IProblem { 
	
	static Logger logger = Logger.getLogger(_022NamesScores.class);

	public Long solve() {
		
		InputStream input = _022NamesScores.class.getClassLoader().getResourceAsStream("names.txt");
		
		try (BufferedReader br = new BufferedReader(new InputStreamReader(input))) {

			String sCurrentLine = br.readLine();
			
			long totalsum = 0;
			
			if (sCurrentLine != null) {
			
				String[] names = sCurrentLine.split(Functions.COMMA);
				
				Arrays.sort(names);
				
				for (int i = 0; i < names.length; i++) {

					
					int sum = 0;
					
					char[] charcters = names[i].replace(Functions.FORWARD_SLASH,Functions.BLANK).toCharArray();
					
					for (int c = 0; c < charcters.length; c++) {
					
						sum += charcters[c] - 64;
					}
					
					totalsum += sum * (i + 1);

				}
			} 
			else 
			{
			
				return 0l;
			
			}
			
			
			return totalsum;
		
		} 
		catch (Exception e) {
		
			//e.printStackTrace();
		
		}
		
		return 0l;
	}


}
