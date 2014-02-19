package project.euler.problem;

import org.apache.log4j.Logger;

/**
 * Created by shashi on 1/29/14.
 */
import project.euler.IProblem;
import project.euler.feature.KeyConstant;
import project.euler.feature.NumberText;

public class _017NumberLetterCounts implements IProblem {
	
	static Logger logger = Logger.getLogger(_017NumberLetterCounts.class);
	
	public static final String HYPHENSPACEREGEX = "[\\s\\-()]";

	public Integer solve() {
	
		int length = 0;
	
		for (int i = 1; i <= 1000; i++) {

			
			String letters = NumberText.getNumberLetters(i);
			
			String replacedLetter = letters.replaceAll(KeyConstant.HYPHENSPACEREGEX, KeyConstant.BLANK);
		
			length += replacedLetter.length();
		
		}
		
		return length;

	}

}
