package com.project.euler.problem;

import org.apache.log4j.Logger;

/**
 * Created by shashi on 1/29/14.
 */
import com.project.euler.IProblem;
import com.project.euler.feature.Functions;
import com.project.euler.feature.NumberText;

public class _017NumberLetterCounts implements IProblem {
	
	static Logger logger = Logger.getLogger(_017NumberLetterCounts.class);
	
	

	public Integer solve() {
	
		int length = 0;
	
		for (int i = 1; i <= 1000; i++) {

			
			String letters = NumberText.getNumberLetters(i);
			
			String replacedLetter = letters.replaceAll(Functions.HYPHENSPACEREGEX, Functions.BLANK);
		
			length += replacedLetter.length();
		
		}
		
		return length;

	}

}
