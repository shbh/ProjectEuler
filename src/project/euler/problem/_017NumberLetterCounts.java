package project.euler.problem;

/**
 * Created by shashi on 1/29/14.
 */
import project.euler.base.IProblem;
import project.euler.base.Key;
import project.euler.util.Learning;

public class _017NumberLetterCounts implements IProblem {

	public Integer solve() {
		int length = 0;
		for (int i = 1; i <= 1000; i++) {

			// System.out.println(text);
			// length += text.toString().replaceAll("[\\s\\-()]", "").length();
			length += Learning.getNumberLetters(i)
					.replaceAll(Key.HYPHENSPACEREGEX, Key.BLANK).length();
		}
		return length;

	}

	public int getNo() {

		return 17;
	}

}
