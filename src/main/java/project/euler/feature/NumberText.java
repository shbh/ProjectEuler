package project.euler.feature;




public class NumberText implements KeyConstant {

	public static String getNumberLetters(Integer number) {
		StringBuffer text = new StringBuffer();
		int remainder = number;
		int quotient = number / 1000;

		if (quotient > 0) {
			text.append(numbertext(quotient)).append(SPACE)
					.append(NUMBER.thousand).append(SPACE);
			remainder = number % 1000;
		}

		quotient = remainder / 100;

		if (quotient > 0) {
			text.append(numbertext(quotient)).append(SPACE)
					.append(NUMBER.hundred).append(SPACE);
			remainder = number % 100;
		}

		quotient = remainder / 10;

		if (quotient > 1) {
			if (number > 100)
				text.append(AND).append(SPACE);
			text.append(numbertext(quotient * 10));

			remainder = number % 10;
		} else if (quotient == 1) {
			if (number > 100)
				text.append(AND).append(SPACE);
			text.append(numbertext(remainder));
			remainder = 0;
		} else {
			quotient = 0;
		}

		// quotient = i;
		if (remainder > 0) {
			if (quotient > 0) {
				text.append(HYPHEN).append(numbertext(remainder));
			} else {
				if (number > 100)
					text.append(AND).append(SPACE);
				text.append(numbertext(remainder));
			}
		}
		return text.toString();
	}

	public static String numbertext(int destination) {
		NUMBER[] number = NUMBER.values();
		for (int j = 0; j < number.length; j++) {
			if (number[j].getValue() == destination) {
				return number[j].toString();
			}

		}
		return NUMBER.thousand.toString();

	}
}
