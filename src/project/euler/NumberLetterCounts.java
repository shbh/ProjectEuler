package project.euler;

/**
 * Created by shashi on 1/29/14.
 */
import static project.euler.base.Key.*;
import project.euler.base.IProblem;
import project.euler.base.Key;

public class NumberLetterCounts implements IProblem {

	public Integer solve() {
		int length = 0;
		for (int i = 1; i <= 1000; i++) {
			StringBuffer text = new StringBuffer();
			int remainder = i;
			int quotient = i / 1000;

			if (quotient > 0) {
				text.append(text(quotient)).append(SPACE)
						.append(NUMBER.thousand).append(SPACE);
				remainder = i % 1000;
			}

			quotient = remainder / 100;

			if (quotient > 0) {
				text.append(text(quotient)).append(SPACE)
						.append(NUMBER.hundred).append(SPACE);
				remainder = i % 100;
			}

			quotient = remainder / 10;

			if (quotient > 1) {
				if (i > 100)
					text.append(AND).append(SPACE);
				text.append(text(quotient * 10));

				remainder = i % 10;
			} else if (quotient == 1) {
				if (i > 100)
					text.append(AND).append(SPACE);
				text.append(text(remainder));
				remainder = 0;
			} else {
				quotient = 0;
			}

			// quotient = i;
			if (remainder > 0) {
				if (quotient > 0) {
					text.append(HYPHEN).append(text(remainder));
				} else {
					if (i > 100)
						text.append(AND).append(SPACE);
					text.append(text(remainder));
				}
			}

			//System.out.println(text);
			//length += text.toString().replaceAll("[\\s\\-()]", "").length();
			length += text.toString().replaceAll(Key.HYPHENSPACEREGEX, Key.BLANK).length();
		}
		return length;

	}
	
	 public static String text(int i )
	    {
	        NUMBER[] number = NUMBER.values();
	        for (int j =0; j<number.length;j++)
	        {
	            if(number[j].getValue()==i)
	            {
	                return number[j].toString();
	            }

	        }
	        return NUMBER.thousand.toString();

	    }
}
