package project.euler.problem;

/**
 * Created by shashi on 1/29/14.
 */
import project.euler.base.IProblem;
import project.euler.base.KeyConstant;
import project.euler.util.NumberText;

public class _017NumberLetterCounts implements IProblem {
	 public static final String HYPHENSPACEREGEX= "[\\s\\-()]";
	public Integer solve() {
		int length = 0;
		for (int i = 1; i <= 1000; i++) {

			// System.out.println(text);
			// length += text.toString().replaceAll("[\\s\\-()]", "").length();
			String letters = NumberText.getNumberLetters(i);
			String replacedLetter = letters.replaceAll(KeyConstant.HYPHENSPACEREGEX, KeyConstant.BLANK);
			length += replacedLetter.length();
		}
		return length;

	}

	public int getNo() {

		return 17;
	}

}
